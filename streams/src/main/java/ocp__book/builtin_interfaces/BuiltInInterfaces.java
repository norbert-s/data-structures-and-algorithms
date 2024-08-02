package ocp__book.builtin_interfaces;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.function.*;

public class BuiltInInterfaces {
    public static void main(String [] args){

        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();
        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();
        System.out.println(s1.get());
        System.out.println(s2.get());

        Supplier<StringBuilder> s12 = StringBuilder::new;
        Supplier<StringBuilder> s22 = () -> new StringBuilder();
        System.out.println(s12.get());
        System.out.println(s22.get());

        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);
        c1.accept("Annie");
        c2.accept("Annie");

        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
        b1.accept("chicken", 7);
        b2.accept("chick", 1);
        System.out.println(map);

        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();
        System.out.println(p1.test("")); // true
        System.out.println(p2.test("")); // true

        BiPredicate<String, String> b12 = String::startsWith;
        BiPredicate<String, String> b22 =
                (string, prefix) -> string.startsWith(prefix);
        System.out.println(b12.test("chicken", "chick")); // true
        System.out.println(b22.test("chicken", "chick")); // true

        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();
        System.out.println(f1.apply("cluck")); // 5
        System.out.println(f2.apply("cluck")); // 5

        BiFunction<String, String, String> b13 = String::concat;
        BiFunction<String, String, String> b23 =
                (string, toAdd) -> string.concat(toAdd);
        System.out.println(b13.apply("baby ", "chick")); // baby chick
        System.out.println(b23.apply("baby ", "chick")); // baby chick

        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();
        System.out.println(u1.apply("chirp")); // CHIRP
        System.out.println(u2.apply("chirp")); // CHIRP

        BinaryOperator<String> b14 = String::concat;
        BinaryOperator<String> b24 = (string, toAdd) ->
                string.concat(toAdd);
        System.out.println(b14.apply("baby ", "chick")); // baby chick
        System.out.println(b24.apply("baby ", "chick")); // baby chick

        Predicate<List> cdx =x -> "as".equals(x.get(0));;
        System.out.println(cdx.test(List.of("as","ad")));

        Consumer<Long> ex2 = (Long l) -> System.out.println(l);
        ex2.accept(23L);

        BiPredicate<String, String> ex3 = (pred1, pred2) -> false;


    }
}
