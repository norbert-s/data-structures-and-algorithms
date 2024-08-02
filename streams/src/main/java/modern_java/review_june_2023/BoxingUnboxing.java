package modern_java.review_june_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoxingUnboxing {
    public static void main(String[]args){
        int count = (int) IntStream.rangeClosed(1, 100)
            .filter(n -> n % 2 == 0)
                .count();
        System.out.println(count);
        IntStream count2 = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0);
        System.out.println(count2.count());
        List<Integer> list=IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0)
                .boxed()
                .collect(Collectors.toList());


        Stream<int[]> pythagoreanTriples =
                IntStream.rangeClosed(1, 100).boxed()
                        .flatMap(a ->
                                IntStream.rangeClosed(a, 100)
                                        .filter(b -> Math.sqrt(a*a + b*b) % 1 == 0)
                                        .mapToObj(b ->
                                                new int[]{a, b, (int)Math.sqrt(a * a + b * b)})
                        );
        System.out.println(pythagoreanTriples);
        pythagoreanTriples.forEach(s->{
            Arrays.stream(s).forEach(System.out::println);
            System.out.println("------");
        });
//        List list = List.of(1,2,3,4);
//        list.add(5);
//        List<Integer> list2 = List.of(1,2,3,4);
//        list2.add(5);
        List<Integer> list3 = new ArrayList<>(List.of(1,2,3,4));
        list3.add(5);
        System.out.println(list3);


    }
}
