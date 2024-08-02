package modern_java.review.exercise;

import modern_java.example.Dish.Dish;
import modern_java.example.Dish.DishFactory;
import modern_java.review.Grouping;
import modern_java.util.Util;

import java.util.*;
import java.util.stream.Collectors;

import static modern_java.util.Util.printOutGeneric;

public class Exercises_1225 {
    public static void main(String[]args){
        List<Dish> menu = DishFactory.createDishes();
        Util.printOutGeneric(groupCaloricDishesByType(menu));
        Util.printOutGeneric(groupDishesByCaloricLevel(menu));
        Util.printOutGeneric(groupDishesByTypeAndCaloricLevel(menu));
        Util.printOutGeneric((countDishesInGroups(menu)));
        Util.printOutGeneric(mostCaloricDishesByType(menu));
        Util.printOutGeneric(mostCaloricDishesByTypeWithoutOptionals(menu));
        Util.printOutGeneric(sumCaloriesByType(menu));
    }

    //get dishes grouped by type which ha s a calorie>500
    private static Map<Dish.Type, List<Dish>> groupCaloricDishesByType(List<Dish>menu) {
        return menu.stream().filter(dish -> dish.getCalories() > 500).collect(Collectors.groupingBy(Dish::getType));
//        return menu.stream()
//                .collect(Collectors.groupingBy(Dish::getType,
//                        Collectors.filtering(s->s.getCalories()>500,toList())));
    }

    private static Map<Grouping.CaloricLevel, List<Dish>> groupDishesByCaloricLevel(List<Dish>menu) {
        return menu.stream()
                .collect(Collectors.groupingBy((Dish s)->{
                    if(s.getCalories()<400)return Grouping.CaloricLevel.DIET;
                    else if (s.getCalories()>=400&&s.getCalories()<700) return Grouping.CaloricLevel.NORMAL;
                    else return Grouping.CaloricLevel.FAT;
                }));
    }

    static Map<Dish.Type,Map<Grouping.CaloricLevel,List<Dish>>> groupDishesByTypeAndCaloricLevel(List<Dish>menu){
        return menu.stream()
                .collect(Collectors.groupingBy(Dish::getType,Collectors.groupingBy((Dish k)->{
                    if(k.getCalories()<400)return Grouping.CaloricLevel.DIET;
                    else if (k.getCalories()>=400&&k.getCalories()<700) return Grouping.CaloricLevel.NORMAL;
                    else return Grouping.CaloricLevel.FAT;
                })));
    }
    private static Map<Dish.Type, Long> countDishesInGroups(List<Dish>menu) {
        return menu.stream()
                .collect(Collectors.groupingBy(Dish::getType,Collectors.counting()));
    }

    private static Map<Dish.Type, Optional<Dish>> mostCaloricDishesByType(List<Dish>menu) {
        return menu.stream()
                .collect(Collectors.groupingBy(Dish::getType,Collectors.maxBy((a,b)->a.getCalories()-b.getCalories())));
//        return
//                menu.stream()
//                        .collect(groupingBy(Dish::getType,
//                                maxBy(comparingInt(Dish::getCalories))));
    }

    //to adapt the result returned by a collector to a different
    //type, you could use the collector returned by the Collectors.collectingAndThen
    //factory method, as shown in the following listing.
    private static Map<Dish.Type, Dish> mostCaloricDishesByTypeWithoutOptionals(List<Dish>menu) {
        //mysolution
        return menu.stream()
                .collect(Collectors.groupingBy(Dish::getType,Collectors.collectingAndThen(Collectors.maxBy((a,b)->a.getCalories()-b.getCalories()),Optional::get)));

        //book solution
//        Map<Dish.Type, Dish> mostCaloricByType =
//                menu.stream()
//                        .collect(groupingBy(Dish::getType,
//                                collectingAndThen(
//                                        maxBy(comparingInt(Dish::getCalories)),
//                                        Optional::get)));
    }

    private static Map<Dish.Type, Integer> sumCaloriesByType(List<Dish>menu) {
        return menu.stream()
                .collect(Collectors.groupingBy(Dish::getType,
                        Collectors.summingInt(Dish::getCalories)
                        ));
    }

    //simply all the caloric levels that apply by type
    private static Map<Dish.Type, Set<Grouping.CaloricLevel>> caloricLevelsByType(List<Dish>menu) {
        return menu.stream().collect(
                Collectors.groupingBy(Dish::getType, Collectors.mapping(
                        dish -> {
                            if (dish.getCalories() <= 400) {
                                return Grouping.CaloricLevel.DIET;
                            }
                            else if (dish.getCalories() <= 700) {
                                return Grouping.CaloricLevel.NORMAL;
                            }
                            else {
                                return Grouping.CaloricLevel.FAT;
                            }
                        },
                        Collectors.toSet()
                ))
        );
    }

}