package modern_java.review;

import modern_java.example.Dish.Dish;
import modern_java.example.Dish.DishFactory;

import java.util.List;
import java.util.OptionalInt;

public class NumericStreams {
    public static void main(String[]args){
        List<Dish> menu = DishFactory.createDishes();
        int calories = menu.stream()
                .map(Dish::getCalories)
                .reduce(0, Integer::sum);

        int calories2 = menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();

        OptionalInt maxCalories = menu.stream()
                .mapToInt(Dish::getCalories)
                .max();

        int max = maxCalories.orElse(1);
    }
}
