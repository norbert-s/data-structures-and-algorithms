package modern_java.review;

import modern_java.example.Dish.DishFactory;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Reduce {
    public static void main(String[]args){
        List<Integer> numbers = List.of(1,2,3,4,5);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);

        int sum2 = numbers.stream()
                .reduce(0,Integer::sum);

        int sum3 = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        Optional<Integer> sum4 = numbers.stream()
                .reduce((a, b) -> (a + b));

        Optional<Integer> max = numbers.stream()
                .reduce(Integer::max);

        Optional<Integer> min = numbers.stream()
                .reduce(Integer::min);

        //How would you count the number of dishes in a stream using the map and reduce methods?
        long numberOfDishes= DishFactory.createDishesSecondVersion().stream()
                .collect(Collectors.counting());
        System.out.println(numberOfDishes);

        int numberOfdishes2 = DishFactory.createDishesSecondVersion().stream()
                .map(dish->1)
                .reduce(0,(a,b)->a+1);
        System.out.println(numberOfdishes2);

        //also with count
        long count = DishFactory.createDishesSecondVersion().stream().count();
        System.out.println(count);
        int countTwo = DishFactory.createDishes().stream()
                .map(x->1)
                .reduce(0,Integer::sum);
        System.out.println(countTwo);
    }
}
