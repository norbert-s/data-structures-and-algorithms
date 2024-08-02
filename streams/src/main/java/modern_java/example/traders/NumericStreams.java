package modern_java.example.traders;

import modern_java.example.Dish.Dish;
import modern_java.example.Dish.DishFactory;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class NumericStreams {
    public static void main(String[]args){
        List<Dish> menu = DishFactory.createDishes();
        //
        int calories = menu.stream()
            .mapToInt(Dish::getCalories).sum();
        System.out.println(calories);
        //
        IntStream intStream = menu.stream()
            .mapToInt(Dish::getCalories);
        Stream<Integer> stream = intStream.boxed();
        System.out.println(stream);
        //
        OptionalInt maxCalories = menu.stream()
            .mapToInt(Dish::getCalories).max();

        System.out.println(maxCalories);
        System.out.println(maxCalories.getAsInt());
        int max = maxCalories.orElse(1); 

        //
        IntStream evenNumbers = IntStream.rangeClosed(1, 100)
            .filter(n -> n % 2 == 0);
        
    }
}