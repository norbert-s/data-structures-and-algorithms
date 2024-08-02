package ocp__book.builtin_interfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConvenienceMethods {
    public static void main(String [] args){
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");
        Predicate<String> brownEggs =
                s -> s.contains("egg") && s.contains("brown");
        Predicate<String> otherEggs =
                s -> s.contains("egg") && ! s.contains("brown");

        Predicate<String> brownEggs2 = egg.and(brown);
        Predicate<String> otherEggs2 = egg.and(brown.negate());

        //-----------------------------
        Consumer<String> c1 = x -> System.out.print("1: " + x);
        Consumer<String> c2 =y -> System.out.print(",2: " + y);
//        Consumer<String> combined = c1.andThen(c2);
        Consumer<String> combined = c1.andThen(y-> System.out.println(y+y+y+y));
        combined.accept("Annie"); // 1: Annie,2: Annie

        Function<Integer, Integer> before = x -> x + 1;
        Function<Integer, Integer> after = x -> x * 2;
        Function<Integer, Integer> combined2 = after.compose(before);
        System.out.println(combined2.apply(3)); // 8
    }
}
