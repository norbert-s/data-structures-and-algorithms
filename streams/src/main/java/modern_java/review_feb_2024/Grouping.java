package modern_java.review_feb_2024;

import modern_java.example.Dish.Dish;
import modern_java.example.Dish.DishFactory;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import modern_java.review.Grouping.CaloricLevel;
import modern_java.util.Util;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class Grouping {
    public static void main(String [] args){

        Map<Dish.Type, List<Dish>> dishesByType = DishFactory.createDishes().stream()
                        .collect(groupingBy(Dish::getType));

        Map<CaloricLevel, List<Dish>> dishesByCaloricLevel = DishFactory.createDishes().stream().collect(
                groupingBy(dish -> {
                    if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                    else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                    else return CaloricLevel.FAT;
                } ));
        Util.printOutGeneric(dishesByCaloricLevel);

        Map<Dish.Type, List<Dish>> caloricDishesByType =
                DishFactory.createDishes().stream().filter(dish -> dish.getCalories() > 500)
                        .collect(groupingBy(Dish::getType));

        Map<Dish.Type, List<Dish>> caloricDishesByType2= DishFactory.createDishes().stream()
                        .collect(groupingBy(Dish::getType,
                                Collectors.filtering(dish -> dish.getCalories() > 500, toList())));

        Util.printOutGeneric( caloricDishesByType2);

        Map<Dish.Type, Map<CaloricLevel, List<Dish>>> dishesByTypeCaloricLevel =
                DishFactory.createDishes().stream().collect(
                        groupingBy(Dish::getType,
                                groupingBy(dish -> {
                                    if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                                    else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                                    else return CaloricLevel.FAT;
                                } )
                        )
                );

        Map<Dish.Type, Long> typesCount = DishFactory.createDishes().stream().collect( Collectors.groupingBy(Dish::getType, Collectors.counting()));
    }
}
