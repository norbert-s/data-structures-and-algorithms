package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(12345));
    }
    
    public static List<String> fizzBuzz(int s) {
        List<String> list = new ArrayList<>();
        IntStream.rangeClosed(1,s+1).forEach(n->{
            if((n % 3 == 0) && (n % 5 == 0))
                list.add("FizzBuzz");
            else if (n%3==0) {
                list.add("Fizz");
            } else if (n%5==0) {
                list.add("Buzz");
            }else {
                list.add(String.valueOf(n));
            }
        });
        return list;
    }
}
