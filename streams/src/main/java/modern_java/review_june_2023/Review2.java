package modern_java.review_june_2023;

import modern_java.example.Dish.Dish;
import modern_java.example.Dish.DishFactory;
import modern_java.util.Util;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.reducing;

public class Review2 {
    public static void main(String[]args){
        List<Dish> menu = DishFactory.createDishes();
        Util.printOutGeneric(groupCaloricDishesByType(menu));
        Util.printOutGeneric(groupDishesByCaloricLevel(menu));
        Util.printOutGeneric(groupDishesByTypeAndCaloricLevel(menu));
//        Util.printOutGeneric((countDishesInGroups(menu)));
//        Util.printOutGeneric(mostCaloricDishesByType(menu));
//        Util.printOutGeneric(mostCaloricDishesByTypeWithoutOptionals(menu));
//        Util.printOutGeneric(sumCaloriesByType(menu));
    }
    static Map<Dish.Type, List<Dish>> groupCaloricDishesByType(List<Dish> menu){
        return menu.stream()
                .collect(Collectors.groupingBy(Dish::getType));
    }

    static Map<String, List<Dish>> groupDishesByCaloricLevel(List<Dish> menu){
        return menu.stream()
                .collect(Collectors.groupingBy(s->{
                    if(s.getCalories()<300)return "low";
                    else if (s.getCalories()>=300&s.getCalories()<700) {
                        return "mid";
                    }
                    else return "fat";
                }));
    }

    static Map<Dish.Type, Map<String, List<Dish>>> groupDishesByTypeAndCaloricLevel(List<Dish> menu){
        return menu.stream()
                .collect(Collectors.groupingBy(Dish::getType,
                        Collectors.groupingBy(s-> {
                            if (s.getCalories() < 300) return "low";
                            else if (s.getCalories() >= 300 & s.getCalories() < 700) {
                                return "mid";
                            } else return "fat";
                        })));
    }
    private static Map<Dish.Type, Optional<Dish>> mostCaloricDishesByType(List<Dish> menu) {
        return menu.stream().collect(
                groupingBy(Dish::getType,
                        reducing((Dish d1, Dish d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2)));
    }
    private static Map<Dish.Type, Optional<Dish>> mostCaloricDishesByType2(List<Dish> menu) {
        return menu.stream().collect(
                groupingBy(Dish::getType,
                        Collectors.minBy((Dish d1, Dish d2) -> Integer.compare(d1.getCalories(), d2.getCalories()))));
    }

}
