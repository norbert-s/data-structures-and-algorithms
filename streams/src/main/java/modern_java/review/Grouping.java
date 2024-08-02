package modern_java.review;

import modern_java.util.Util;
import modern_java.example.Dish.Dish;
import modern_java.example.Dish.DishFactory;

import java.util.*;
import java.util.stream.Collectors;

import static modern_java.util.Util.printOutGeneric;


public class Grouping {
    public static enum CaloricLevel { DIET, NORMAL, FAT }
    public static void main(String[]args){
        List<Dish> menu = DishFactory.createDishes();
        Map<Dish.Type,List<Dish>> map = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(map);
        System.out.println(map.get(Dish.Type.MEAT));
        Util.printOutGeneric(map);

        //only other
        System.out.println(map.get(Dish.Type.OTHER));
        //grouping by calory level
        Map<CaloricLevel,List<Dish>> map2 = menu.stream()
                .collect(Collectors.groupingBy(dish->{
                    int calorie = dish.getCalories();
                    if(calorie <=400) return CaloricLevel.DIET;
                    else if(calorie>=400&calorie<700) return CaloricLevel.NORMAL;
                    else  return CaloricLevel.FAT;
                }));
        System.out.println(map2);
        Util.printOutGeneric(map2);

        //manipulating grouped elements

        Map<Dish.Type, List<Dish>> caloricDishesByType =
                menu.stream().filter(dish -> dish.getCalories() > 500)
                        .collect(Collectors.groupingBy(Dish::getType));
        //here some probelms though with fish not being in the map
        Util.printOutGeneric(caloricDishesByType);

        //another solution with groupingBy having a different

        //here groupingby accepts 2 parameters
        //the first is the type by which the grouping you may want to occur and the second which is the filtering accepting 2 params
        Map<Dish.Type, List<Dish>> caloricDishesByType2 =
                menu.stream()
                        .collect(Collectors.groupingBy(Dish::getType
                                ,Collectors.filtering(dish -> dish.getCalories() > 500
                                    , Collectors.toList())));
        Util.printOutGeneric(caloricDishesByType2);

        Map<Dish.Type, Long> typesCount = menu.stream().collect(
                Collectors.groupingBy(Dish::getType, Collectors.counting()));
        Util.printOutGeneric(typesCount);

        //Optional because of maxBy
        Map<Dish.Type, Optional<Dish>> mostCaloricByType =
                menu.stream()
                        .collect(Collectors.groupingBy(Dish::getType,
                                Collectors.maxBy(Comparator.comparingInt(Dish::getCalories))));
        Util.printOutGeneric(mostCaloricByType);

        //sasme but with
        Map<Dish.Type, Dish> mostCaloricByType2 =
                menu.stream()
                        .collect(Collectors.groupingBy(Dish::getType,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)),
                                        Optional::get)));
        Util.printOutGeneric(mostCaloricByType2);

        //For example, you could also reuse the collector
        //created to sum the calories of all the dishes in the menu to obtain a similar
        //result, but this time for each group of Dishes:
        Map<Dish.Type,Integer> sumOfCaloriesByDish = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType,Collectors.summingInt(Dish::getCalories)));
        Util.printOutGeneric(sumOfCaloriesByDish);

        //suppose you want to know which CaloricLevels are
        //available in the menu for each type of Dish. You could achieve this result combining a
        //groupingBy and a mapping collector, as follows

        Map<Dish.Type,List<CaloricLevel>> caloricLevelByDish = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType,Collectors.mapping(s->{
                    int calorie = s.getCalories();
                    if(calorie<400) return CaloricLevel.DIET;
                    else if(calorie>=400&&calorie<700) return CaloricLevel.NORMAL;
                    else return CaloricLevel.FAT;
                },Collectors.toList())));
        Util.printOutGeneric(caloricLevelByDish);

        //put it in a set so that it appears only once
        Map<Dish.Type, Set<CaloricLevel>> caloricLevelByDish2 = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType,Collectors.mapping(s->{
                    int calorie = s.getCalories();
                    if(calorie<400) return CaloricLevel.DIET;
                    else if(calorie>=400&&calorie<700) return CaloricLevel.NORMAL;
                    else return CaloricLevel.FAT;
//                },Collectors.toCollection(HashSet::new))));
                },Collectors.toSet())));
        Util.printOutGeneric(caloricLevelByDish2);
    }
}
