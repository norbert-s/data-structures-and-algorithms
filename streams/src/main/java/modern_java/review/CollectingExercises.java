package modern_java.review;

import modern_java.example.Dish.Dish;
import modern_java.example.Dish.DishFactory;

import java.util.List;
import java.util.stream.Collectors;

public class CollectingExercises {
    public static void main(String[]args){
        List<Dish> menu = DishFactory.createDishes();
        String shortMenu = menu.stream().map(Dish::getName).collect(Collectors.joining());
//        String shortMenu2 = menu.stream().collect(Collectors.reducing( (d1, d2) -> d1.getName() + d2.getName() ).get();

        String shortMenu3 = menu.stream().collect(Collectors.reducing( "", Dish::getName, (s1, s2) -> s1 + s2 ) );


    }
}
