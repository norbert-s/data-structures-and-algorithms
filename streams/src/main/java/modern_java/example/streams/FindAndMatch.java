package modern_java.example.streams;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import modern_java.example.Dish.Dish;
import modern_java.example.Dish.DishFactory;

public class FindAndMatch {
    public static void main(String[]args){
        List<Dish> menu = DishFactory.createDishes();
        // if(menu.stream().anyMatch(Dish::isVegetarian)) {
        //     System.out.println("The menu is (somewhat) vegetarian friendly!!");
        // }

        // boolean isHealthy = menu.stream()
        //                 .allMatch(dish -> dish.getCalories() < 1000);
        // System.out.println(isHealthy);

        // boolean isHealthy2 = menu.stream()
        //                 .noneMatch(d -> d.getCalories() >= 1000);
        // System.out.println(isHealthy);

        Optional<Dish> dish = menu.stream()
            .filter(Dish::isVegetarian)
            .findAny();

        System.out.println(dish.isPresent());

        menu.stream()
            .filter(Dish::isVegetarian)
            .findAny()
            .ifPresent(dish2 -> System.out.println(dish2.getName()));

        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> firstSquareDivisibleByThree = someNumbers.stream()
            .map(n -> n * n)
            .filter(n -> n % 3 == 0)
            .findFirst(); // 9
    }
}
