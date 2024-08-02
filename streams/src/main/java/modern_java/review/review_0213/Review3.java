package modern_java.review.review_0213;

import modern_java.example.Dish.Dish;
import modern_java.example.Dish.DishFactory;
import modern_java.example.traders.Transaction;
import modern_java.example.traders.TransactionFactory;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static modern_java.util.Util.printOutGeneric;

public class Review3 {
    public static void main(String[]args){
        List<Dish> menu = DishFactory.createDishes();
        List<Transaction> transactions = TransactionFactory.generateTransactions();
//        printOutMap(mostCaloricDish(menu));
//        printOutMap(findMostCaloricDishUsingComparator(menu));
//        printOutGeneric(mostCaloricDish2(menu));
//
//        //Find the transaction with the smallest value.
//        printOutGeneric(withSmallestValue(transactions));
        printOutGeneric(printOutUppercaseLetters("Haboru Es Beke"));
//        printOutGeneric(caloriesPerType(menu));
//        printOutGeneric(caloricLevelsByType(menu));
//        printOutGeneric(dishesByCaloricLevel(menu));
    }
//    static Integer mostCaloricDish2(List<Dish>menu){
//        return menu.stream()
//                .map(s->Integer.valueOf(s))
//                .
//    }
    static String printOutUppercaseLetters(String str){
        return str.chars()
                .filter(s->Character.isUpperCase(s))
                .mapToObj(s->String.valueOf((char)s))
                .collect(Collectors.joining());
    }
    static Map<Dish.Type, Optional<Dish>> caloriesPerType(List<Dish>menu){
        return menu.stream()
                .collect(Collectors.groupingBy(s->s.getType(),Collectors.reducing((a,b)->a.getCalories()>b.getCalories()?a:b)));
    }
    static Dish mostCaloricDish(List<Dish>menu){
        return menu.stream()
                .reduce((a,b)->a.getCalories()>b.getCalories()?a:b).get();
    }
}
