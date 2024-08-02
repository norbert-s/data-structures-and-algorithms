package modern_java.example.streams;
import modern_java.example.Dish.Dish;
import modern_java.example.Dish.DishFactory;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;


public class StreamBookExamples {
    public static void main(String[] args) {
        List<Dish> menu = DishFactory.createDishes();
        // List<String> threeHighCaloricDishNames = menu.stream()
        // .filter(dish -> dish.getCalories() > 300)
        // .map(Dish::getName)                   
        // .limit(3)                             
        // .collect(Collectors.toList());                                                          
        // System.out.println(threeHighCaloricDishNames);
        
        // List<String> names = menu.stream()

        // .filter(dish -> {
        //     System.out.println("filtering:" + dish.getName());
        //                   return dish.getCalories() > 300;})
        // .map(dish -> {
        //     System.out.println("mapping:" + dish.getName());
        //                return dish.getName();
        //           })                                                       
        // .limit(10)
        // .collect(Collectors.toList());
        // System.out.println(names);

        // List<Dish> vegetarianMenu = menu.stream()
        //     .filter(Dish::isVegetarian) 
        //     .collect(Collectors.toList());
        // System.out.println(vegetarianMenu);
        // List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        // numbers.stream()
        //     .filter(i -> i % 2 == 0)
        //     .distinct()
        //     .forEach(System.out::println);
        List<Dish> specialMenu = DishFactory.createDishesSecondVersion();
        // List<Dish> myList = specialMenu.stream()
        // .filter(s->s.getCalories()<320).collect(Collectors.toList());
        // System.out.println(myList);

        // List<Dish> slicedMenu1 = specialMenu.stream()
        //     .takeWhile(dish -> dish.getCalories() < 320)
        //     .peek(System.out::print)
        //     .collect(Collectors.toList());
        //     System.out.println("----------------------------------------------");
        //System.out.println(slicedMenu1);

        // List<Dish> slicedMenu2    = specialMenu.stream()
        //     .dropWhile(dish -> dish.getCalories() < 320).peek(System.out::print)
        //     .collect(Collectors.toList());
        // List<Dish> dishes = specialMenu
        //     .stream()
        //     .filter(dish -> dish.getCalories() > 300)
        //     .limit(3)
        //     .peek(System.out::print)
        //     .collect(Collectors.toList());

        //exrecise
        // List<Dish> meat = menu.stream()
        //     .filter(s->s.getType()==Dish.Type.MEAT)
        //     .peek(System.out::print)
        //     .limit(2)
        //     .collect(Collectors.toList());

        // List<String> dishNames = menu.stream()
        //     .map(Dish::getName)

        //     .peek(System.out::println)
        //     .collect(Collectors.toList());

        // List<Integer> dishNamesLength = menu.stream()
        //     .map(Dish::getName)
        //     .map(String::length)
        //     .peek(System.out::println)
        //     .collect(Collectors.toList());
        
        // List<String> words= List.of("alma","barack","szilva","narancs","eper","korte");

        // List<Integer> length = words.stream()
        //     //.map(s->s.length())
        //     .map(String::length)
        //     .peek(System.out::println)
        //     .collect(Collectors.toList());
        
        // //List<List<Character>> charList = words.stream()
        // List<String> charList = words.stream()
        //     .map(s->s.split(""))
        //     .flatMap(Arrays::stream)
        //     .collect(Collectors.toList());
        // System.out.println(charList);

        // //exerceise
        // int[]tomb = {1,2,3,4,5};
        // IntStream listSquares = Arrays.stream(tomb);
        // List<Integer> numbers = List.of(1,2,3,4,5);
        // List<Integer> squares  = numbers.stream()
        //     .map(s->s*s)
        //     .collect(Collectors.toList());
        
        
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        List<int[]> pairs = numbers1.stream()
            .flatMap(i -> numbers2.stream()
            .map(j -> new int[]{i, j}).peek(System.out::print))
            .collect(Collectors.toList());
        //System.out.println(pairs);
        

    }
}
