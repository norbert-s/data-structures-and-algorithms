package modern_java.review.exercise;

import modern_java.example.Dish.Dish;
import modern_java.example.Dish.DishFactory;
import modern_java.example.traders.Transaction;
import modern_java.example.traders.TransactionFactory;
import modern_java.review.Grouping;
import modern_java.util.Util;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static modern_java.util.Util.printOutGeneric;

public class Exercises_1226 {
    public static void main(String[]args){
        List<Dish> menu = DishFactory.createDishes();
        List<Transaction> transactions = TransactionFactory.generateTransactions();
//        printOutMap(mostCaloricDish(menu));
//        printOutMap(findMostCaloricDishUsingComparator(menu));
        printOutGeneric(mostCaloricDish2(menu));

        //Find the transaction with the smallest value.
        printOutGeneric(withSmallestValue(transactions));
        printOutGeneric(printOutUppercaseLetters("Haboru Es Beke"));
        printOutGeneric(caloriesPerType(menu));
        printOutGeneric(caloricLevelsByType(menu));
        printOutGeneric(dishesByCaloricLevel(menu));
    }

    //hard
    static Dish mostCaloricDish2(List<Dish>menu){
        return menu.stream()
                .reduce((a,b)->a.getCalories()>b.getCalories() ?a :b).get();
    }

    //hard
    static Transaction withSmallestValue(List<Transaction> transactionList){
        return transactionList.stream()
                .reduce((a,b)->a.getValue()<b.getValue() ? a : b).get();
    }

    static String printOutUppercaseLetters(String str){
        //since java 9 -> chars()
        return str.chars()
                .filter(notFilteredYet->Character.isUpperCase(notFilteredYet))
                .mapToObj(s->String.valueOf((char)s))
                .collect(Collectors.joining());
    }

    static Map<Dish.Type, Optional<Dish>> caloriesPerType(List<Dish>menu){
        return menu.stream()
                .collect(Collectors.groupingBy(Dish::getType,Collectors.reducing((a,b)->a.getCalories()>b.getCalories()?a :b)));
    }

    //it can be reused
    static Function<Dish, Grouping.CaloricLevel> byCaloricLevel = (Dish s)->{
        if(s.getCalories()<400) return Grouping.CaloricLevel.DIET;
        else if (s.getCalories()>=400&&s.getCalories()<700) {
            return Grouping.CaloricLevel.NORMAL;
        }
        else return Grouping.CaloricLevel.FAT;
    };

    private static Map<Dish.Type,Set<Grouping.CaloricLevel>> caloricLevelsByType(List<Dish>menu){
        return menu.stream()
                .collect(Collectors.groupingBy(Dish::getType,Collectors.mapping(byCaloricLevel,toSet())));
    }

    private static Map<Grouping.CaloricLevel,List<Dish>> dishesByCaloricLevel(List<Dish>menu){
        return menu.stream()
                .collect(Collectors.groupingBy(byCaloricLevel,Collectors.toList()));
    }

    //hard
    static Dish mostCaloricDish(List<Dish>menu){
        int max = menu.stream()
                .map(s->s.getCalories())
                .reduce(0,Integer::max);
        OptionalInt max2 = menu.stream()
                .mapToInt(s2->s2.getCalories())
                .max();
        return menu.stream()
                .reduce((a,b)->a.getCalories()>b.getCalories() ? a :b).get();
    }
    private static Dish findMostCaloricDishUsingComparator(List<Dish>menu) {
        Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);
        BinaryOperator<Dish> moreCaloricOf = BinaryOperator.maxBy(dishCaloriesComparator);
        return menu.stream().collect(reducing(BinaryOperator.maxBy(Comparator.comparingInt(Dish::getCalories)))).get();
    }

}
