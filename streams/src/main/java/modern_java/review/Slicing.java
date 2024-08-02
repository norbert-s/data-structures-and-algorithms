package modern_java.review;

import modern_java.example.Dish.Dish;
import modern_java.example.Dish.DishFactory;

import static java.util.stream.Collectors.toList;

public class Slicing {
    public static void main(String[]args){
        //getting elements have less than 320 calories

        DishFactory.createDishesSecondVersion()
            .stream()
            .takeWhile(s->s.getCalories()<320)
            .peek(System.out::println)
            .collect(toList());

        //getting the ones having more than 320
        System.out.println("--------------------");
        DishFactory.createDishesSecondVersion()
                .stream()
                .dropWhile(s->s.getCalories()<320)
                .peek(System.out::println)
                .collect(toList());

        System.out.println("--------------------");
        DishFactory.createDishesSecondVersion()
                .stream()
                .limit(3)
                .peek(System.out::println)
                .collect(toList());

        //How would you use streams to filter the first two meat dishes?
        System.out.println("--------------------");
        DishFactory.createDishes()
                .stream()
                .map(obj->obj.getType())
                .skip(2)
                .peek(System.out::println)
                .collect(toList());

        System.out.println("--------------------");
        DishFactory.createDishes().stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT)
                .limit(2)
                .peek(System.out::println)
                .collect(toList());
    }
}
