package ocp__book;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.DoubleStream;

public class PrimitiveStreams {
    public static void main(String [] args){
        var random = DoubleStream.generate(Math::random);
        var fractions = DoubleStream.iterate(.5, d -> d / 2);
        random.map(s->(double) Math.round(s*10000)/100).limit(5).forEach(System.out::println);
        fractions.limit(3).forEach(System.out::println);

        Optional<Integer> optional = Optional.of(333);
//        optional.ifPresentOrElse(s->{
//            if(s.toString().length()==3){
//                System.out.println(s);
//            }else{
//                System.out.println("nem 3");
//            }
//        },()-> System.out.println("nincs ilyen"));
        optional
                .filter(s->s.toString().length()==3)
                .ifPresent(System.out::println);
//        Optional<Integer> result = optional.map(String::length);

    }
}
