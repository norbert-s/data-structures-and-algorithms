package modern_java.review;

import modern_java.example.Dish.Dish;
import modern_java.example.Dish.DishFactory;
import modern_java.util.Util;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Partitioning {
    public static void main(String[]args) {
        List<Dish> menu = DishFactory.createDishes();
        Map<Boolean, List<Dish>> partitionedMenu =
                menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian));
        Util.printOutGeneric(partitionedMenu);
        Util.printOutBorder();
        Util.printOutGeneric(partitionedMenu.get(true));
        Util.printOutBorder();
        Util.printOutGeneric(partitionedMenu.get(false));
        Util.printOutBorder();
        menu.stream()
                .filter(Dish::isVegetarian)
                .peek(System.out::println)
                .collect(Collectors.toList());

        Util.printOutBorder();
        //complex !!
        var vegetarianDishesByType =
                menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian,
                                Collectors.groupingBy(Dish::getType)));
        Util.printOutGeneric(vegetarianDishesByType);

        //to find the most caloric dish among both vegetarian and nonvegetarian
        //dishes:
        //my solution
        var mostCaloric = menu.stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian
                        ,Collectors.maxBy(Comparator.comparing(Dish::getCalories))
                        ));
        Util.printOutGeneric(mostCaloric);

        //book solution
        Map<Boolean, Dish> mostCaloricPartitionedByVegetarian =
                menu.stream().collect(
                        Collectors.partitioningBy(Dish::isVegetarian,
                                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)),
                                        Optional::get)));
        Util.printOutGeneric(mostCaloricPartitionedByVegetarian);
    }
}
