package org.example.integer;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factHead(3));
    }

    private static int factHead(int num){
        if(num ==1) return 1;

        int result = num* factHead(num-1);

        return result;
    }

    private static int factTail(int num){
        if(num ==1) return 1;

        return num* factTail(num-1);
    }
}
