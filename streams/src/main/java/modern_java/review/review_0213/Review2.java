package modern_java.review.review_0213;

import modern_java.example.Dish.Dish;
import modern_java.example.Dish.DishFactory;
import modern_java.review.Grouping;
import modern_java.util.Util;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Review2 {
    public static void main(String[]args){
        List<Dish> menu = DishFactory.createDishes();
        Util.printOutGeneric(groupCaloricDishesByType(menu));
        Util.printOutGeneric(groupDishesByCaloricLevel(menu));
//        Util.printOutGeneric(groupDishesByTypeAndCaloricLevel(menu));
        Util.printOutGeneric((countDishesInGroups(menu)));
        Util.printOutGeneric(mostCaloricDishesByType(menu));
//        Util.printOutGeneric(mostCaloricDishesByTypeWithoutOptionals(menu));
        Util.printOutGeneric(sumCaloriesByType(menu));
        Util.printOutGeneric(mostCaloricDishesByType(menu));
    }

    private static Map<Dish.Type, List<Dish>> groupCaloricDishesByType(List<Dish>menu) {
        return menu.stream()
                .collect(Collectors.groupingBy(Dish::getType,Collectors.toList()));
    }
    private static Map<String, List<Dish>> groupDishesByCaloricLevel(List<Dish>menu) {
        return menu.stream().collect(Collectors.groupingBy((Dish s)->{
                    if(s.getCalories()<400){
                        return "Diet";
                    } else   {
                        return "fat";
                    }
                }));
    }
    private static Map<Dish.Type, Long> countDishesInGroups(List<Dish>menu) {
        return menu.stream()
                .collect(Collectors.groupingBy(Dish::getType,Collectors.counting()));
    }
    private static Map<Dish.Type, Optional<Dish>> mostCaloricDishesByType(List<Dish>menu) {
        return menu.stream()
                .collect(Collectors.groupingBy(s->s.getType(),Collectors.maxBy((k1,k2)->Integer.compare(k1.getCalories(),k2.getCalories()))));
    }
    private static Map<Dish.Type, Integer> sumCaloriesByType(List<Dish>menu) {
        return menu.stream()
                .collect(Collectors.groupingBy(Dish::getType,Collectors.summingInt(Dish::getCalories)));
    }

    private static Map<Dish.Type, Set<Grouping.CaloricLevel>> caloricLevelsByType(List<Dish>menu) {
        return menu.stream()
                .collect(Collectors.groupingBy(s->s.getType(),Collectors.mapping(c->{
                    if(c.getCalories()<400){
                        return Grouping.CaloricLevel.DIET;
                    }else if(c.getCalories()>=400&&c.getCalories()<700){
                        return Grouping.CaloricLevel.NORMAL;
                    }else{
                        return Grouping.CaloricLevel.FAT;
                    }
                },Collectors.toSet())));
    }
}
