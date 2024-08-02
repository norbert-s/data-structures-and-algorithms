package modern_java.review_feb_2024;

import modern_java.example.Dish.Dish;
import modern_java.example.Dish.DishFactory;
import modern_java.example.traders.Transaction;
import modern_java.example.traders.TransactionFactory;
import modern_java.util.Util;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercises {
    public static void main(String [] args){
        Exercises exercises = new Exercises();
        Util.printOutGeneric(exercises.printOutUppercaseLetters("Adam Sandler"));

    }
    private Optional<Dish> mostCaloricDish(){
        return DishFactory.createDishes().stream()
                .collect(Collectors.maxBy((a,b)->a.getCalories()));
    }
    private Optional<Dish> mostCaloricDish2(){
        return DishFactory.createDishes().stream()
                .max((a, b) -> Integer.compare(a.getCalories(), b.getCalories()));
    }
    private Optional<Dish> mostCaloricDish3(){
        return DishFactory.createDishes().stream()
                .max(Comparator.comparingInt(Dish::getCalories));
    }

    private Optional<Transaction> withSmallestValue(){
        return TransactionFactory.generateTransactions().stream()
                .collect(Collectors.minBy(Comparator.comparingInt(Transaction::getValue)));
    }
    private Optional<Transaction> withSmallestValue2(){
        return TransactionFactory.generateTransactions().stream()
                .min(Comparator.comparingInt(Transaction::getValue));
    }

    private String printOutUppercaseLetters(String str){
//        return str.chars()
//                .filter(a->Character.isUpperCase(a))
//                .mapToObj(s->String.valueOf((char)s))
//                .collect(Collectors.joining());
//        return str.chars()
//                .filter(a->Character.isUpperCase(a))
//                .mapToObj(s->(char)s)
//                .collect(Collectors.joining());
        return "";
    }

}
