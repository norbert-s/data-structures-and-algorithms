package org.example.memoization;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static void main(String[] args) {

        int num = 7;
        System.out.println(fib(num));
    }
    static Map<Integer,Integer> map = new HashMap<>();
    public static int fib(int n) {

        if(n==1)
            return 1;
        if(n==0)
            return 0;
        if(map.containsKey(n)){
            return map.get(n);
        }
        int result;
        result = fib(n-1)+fib(n-2);
        map.put(n,result);
        return result;
    }
}
