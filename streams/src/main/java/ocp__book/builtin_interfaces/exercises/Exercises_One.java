package ocp__book.builtin_interfaces.exercises;

import java.util.List;
import java.util.function.*;

public class Exercises_One {
    public static void main(String [] args){
        Predicate<List> cdx = x -> "as".equals(x.get(0));;
        System.out.println(cdx.test(List.of("as","ad")));

        Consumer<Long> ex2 = (Long l) -> System.out.println(l);
        ex2.accept(23L);

        BiPredicate<String, String> ex3 = (pred1, pred2) -> false;

        //-------------------
        //6: Function<List<String>> ex1 = x -> x.get(0); // DOES NOT
        //COMPILE
        //7: UnaryOperator<Long> ex2 = (Long l) -> 3.14; // DOES NOT
        //COMIPLE
        //8: Predicate ex4 = String::isEmpty; // DOES NOT
        //COMPILE
        //UnaryOperator<List<String>> ex1 = x -> x.get(0);


        UnaryOperator<Long> unary1 = (Long l) -> (long)3.14;

        Predicate<String> ex4 = String::isEmpty;


    }
}
