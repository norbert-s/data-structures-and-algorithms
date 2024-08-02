package modern_java.example.streams;

import modern_java.example.Dish.Dish;
import modern_java.example.Dish.DishFactory;

import java.util.List;
import java.util.stream.Collectors;



public class Grouping_Streams {
    public static void main (String[]args){
        List<Dish> menu = DishFactory.createDishes();
        long howManyDishes = menu.stream().collect(Collectors.counting());
        long howManyDishes2 = menu.stream().count();
        System.out.println(howManyDishes2);
    }
    
}
