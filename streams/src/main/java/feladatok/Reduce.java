package feladatok;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Reduce {
    public static void main(String[] args) {
        List.of(1, 2, 3, 4, 5)
                .stream()
                .reduce(0, (előző, aktuális) -> előző + aktuális);

        List.of(1, 2, 3, 4, 5)
                .stream()
                .reduce(0, (sum, n) -> sum + n);

        List.of(3, 1, 4, 1, 5, 9)
                .stream()
                .reduce(Integer.MIN_VALUE, (max, n) -> n > max ? n : max);

        List.of("hi", "hello", "hey", "world")
                .stream()
                .reduce("", (előző, aktuális) -> aktuális.length() > előző.length() ? aktuális : előző);

        IntStream.rangeClosed(1, 5)
                .reduce(1, (előző, aktuális) -> előző * aktuális);

        List.of("alma", "körte", "szilva")
                .stream()
                .collect(Collectors.toMap(
                        s -> s,           // kulcs: maga a szó
                        s -> s.length()   // érték: szó hossza
                ));

        List.of(1, 2, 3, 4, 5, 6)
                .stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List.of(1, 2, 3, 4, 5, 6)
                .stream()
                .collect(Collectors.groupingBy(n -> n % 3));

        List.of(
                        List.of(1, 2, 3),
                        List.of(2, 3, 4),
                        List.of(3, 4, 5)
                )
                .stream()
                .flatMap(Collection::stream)
                .distinct()
                .collect(toList());

        List.of(1, 2, 3, 4, 5, 6)
                .stream()
                .takeWhile(n -> n < 5)
                .collect(toList()).forEach(System.out::println);


        List.of(1, 2, 3, 4, 5, 6)
                .stream()
                .dropWhile(n -> n < 4)
                .collect(toList()).forEach(System.out::println);

        // IntStream -> Stream<String>
        IntStream.of(1, 2, 3)
                .mapToObj(n -> "szám: " + n)
                .collect(toList());
        // ["szám: 1", "szám: 2", "szám: 3"]

        // Stream<Integer> -> IntStream
        List.of(1, 2, 3)
                .stream()
                .mapToInt(Integer::intValue)
                .sum();

        List.of(1, 2, 3)
                .stream()
                .mapToInt(Integer::intValue)
                .min();

        // iterate — minden elem az előzőből számolódik
        Stream.iterate(1, n -> n * 2)
                .limit(6)
                .collect(toList());
        // [1, 2, 4, 8, 16, 32]

        // generate — minden elem függetlenül generálódik
        Stream.generate(Math::random)
                .limit(3)
                .collect(toList());
        // [0.234, 0.876, 0.123]

        IntStream.rangeClosed(1,10).forEach(System.out::println);
    }
}
