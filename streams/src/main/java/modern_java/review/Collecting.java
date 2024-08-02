package modern_java.review;

import modern_java.example.Dish.Dish;
import modern_java.example.Dish.DishFactory;

import java.util.*;
import java.util.stream.Collectors;

public class Collecting {
    public static void main(String[]args){
        List<Dish> menu =  DishFactory.createDishes();
        int numBerOfDishes = menu
                .stream()
                .map(s->1)
                .reduce(0,(a,b)->a+b);

        long other = menu.stream().count();
        long howManyDishes = menu.stream().collect(Collectors.counting());
        System.out.println(numBerOfDishes+" ,"+other+" ,"+howManyDishes);

        System.out.println("-------------------------------");
        OptionalInt highestCalorie = menu.stream()
                .mapToInt(Dish::getCalories)
                .max();

        Optional<Dish> highestCalorieDish = menu.stream()
                .max(Comparator.comparing(s->s.getCalories()));
        System.out.println(highestCalorieDish.get().getCalories());

        System.out.println("-------------------------------");
        //same but differently
//        Comparator<Dish> dishCaloriesComparator =
//                Comparator.comparingInt(Dish::getCalories);
        Optional<Dish> mostCalorieDish =
                menu.stream()
                        .collect(Collectors.maxBy(Comparator.comparing(Dish::getCalories)));
        System.out.println(mostCalorieDish.get());

        //total calories
        int totalCalories = menu.stream().collect(Collectors.summingInt(Dish::getCalories));

        //averaging
        double avgCalories = menu.stream().collect(Collectors.averagingInt(Dish::getCalories));

        //int summary statistics
        IntSummaryStatistics menuStatistics =
                menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));
        System.out.println(menuStatistics.getMax());
        System.out.println(menuStatistics.getMin());


        //joining
        System.out.println("-------------------------------");
        String str = menu.stream()
                .map(Dish::getName)
                .collect(Collectors.joining(" ,"));
        System.out.println(str);

        //Collectors.reducing()
        int totalCalories2 = menu.stream().collect(Collectors.reducing(0, Dish::getCalories, Integer::sum));

        //that's  how the optional value is extracted directly from the stream
        int totalCalories3 = menu.stream().map(Dish::getCalories).reduce(Integer::sum).get();

        //once again
        int totalCalories4 = menu.stream().mapToInt(Dish::getCalories).sum();


    }
}
