package modern_java.example.traders;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.sound.sampled.SourceDataLine;

public class BuildingStreams {
    public static void main(String[]args){
        Stream<String> stream = Stream.of("Modern ", "Java ", "In ", "Action");
        //List<String> strList = stream.collect(Collectors.toList());
        stream.map(String::toUpperCase).forEach(System.out::println);
        
        // Stream<String> emptyStream = Stream.empty();
        

        // String homeValue = System.getProperty("home");
        // Stream<String> homeValueStream = homeValue == null ? Stream.empty() : Stream.of(value);

        // int[] numbers = {2, 3, 5, 7, 11, 13};
        // IntStream stream2 = Arrays.stream(numbers);
        // // stream2.forEach(System.out::println);
        // Stream<Integer> list = stream2.boxed();
        // List<Integer> list2 = list.collect(Collectors.toList());
        // System.out.println(list);

        // Stream.iterate(0, n -> n + 2)
        //     .limit(10)
        //     .forEach(System.out::println);
        // int val=0;
        // Stream.iterate(1, n->n)
        //     .map(a->returnFib(a))
        //     .limit(10)
        //     .peek(System.out::println);

        // Stream.iterate(new int[]{0, 1},
        // t -> new int[]{t[1],t[0] + t[1]})
        //     .limit(10)
        //     .map(t -> t[0])
        //     .forEach(System.out::println);

        // IntStream.iterate(0, n -> n < 100, n -> n + 4)
        //     .forEach(System.out::println);

        // IntStream.iterate(0, n -> n + 4)
        //     .takeWhile(n -> n < 100)
        //     .forEach(System.out::println);

        // Stream.generate(Math::random)
        //     .limit(5)
        //     .forEach(System.out::println);
        
        IntStream ones = IntStream.generate(() -> 1).limit(5);
        ones.forEach(System.out::println);
    }

    public static int returnFib(int a){
        if(a==0)return 0;
        if(a==1)return 1;
        return a;
    }
}
