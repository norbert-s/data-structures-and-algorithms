package ocp__book;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String [] args){
        Stream<String> empty = Stream.empty(); // count =

        Stream<Integer> singleElement = Stream.of(1); // count =

        Stream<Integer> fromArray = Stream.of(1, 2, 3); // count =

        var list = List.of("a", "b", "c");

        Stream<String> fromList = list.stream();

        var list2 = List.of("a", "b", "c");

        Stream<String> fromListParallel = list2.parallelStream();
        Stream
                .generate(Math::random)
                .limit(10)
                .forEach(System.out::println);

        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);

        Stream<Integer> oddNumberUnder100 = Stream.iterate(
                1, // seed
                n -> n < 100, // Predicate to specify when done
                n -> n + 2); // UnaryOperator to get next value

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count()); // 3

        Stream<String> str = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = str.min((s1, s2) -> s1.length()-
                s2.length());
        min.ifPresent(System.out::println); // ape

        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent()); // false

        var list3 = List.of("monkey", "2", "chimp");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
        System.out.println(list.stream().anyMatch(pred)); // true
        System.out.println(list.stream().allMatch(pred)); // false
        System.out.println(list.stream().noneMatch(pred)); // false
        System.out.println(infinite.anyMatch(pred)); // true

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (sx, c) -> sx + c);
        //String word2 = stream.reduce("", String::concat);
        System.out.println(word); // wolf

        Stream<Integer> numStream = Stream.of(1,2,3,4,5,6);
        numStream.map(sxx->sxx*2).forEach(System.out::println);

        Stream<Integer> stream2 = Stream.of(3, 5, 6);
        System.out.println(stream2.reduce(1, (a, b) -> a*b)); // 90

        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty2 = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);
        empty2.reduce(op).ifPresent(System.out::println); // no
     
        oneElement.reduce(op).ifPresent(System.out::println); // 3
        threeElements.reduce(op).ifPresent(System.out::println); // 90

        Stream<String> stream3 = Stream.of("w", "o", "l", "f!");
        int length = stream3.reduce(0,(i,stream2String)->i+stream2String.length(),(a,b)->a+b);
        System.out.println(length); // 5
        Stream<String> stream4 = Stream.of("w", "o", "l", "f!");
        String newWolf=stream4.collect(Collectors.joining());
        System.out.println(newWolf);

        Stream<String> stream5 = Stream.of("w", "o", "l", "f");
        StringBuilder word5 = stream5.collect(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append);
        System.out.println(word5); // wolf

        long counted = Stream.of("goldfish", "finch")
                .filter(itt -> itt.length()> 5)
                .collect(Collectors.counting());

        System.out.println(counted);
    }
}
//    Stream<Integer> fromList = (Stream<Integer>) List.of(fromArray);
//
//        fromList.peek(System.out::println);