package org.example.integer;

public class Sum {

    public static void main(String [] args){
        System.out.println(sum(3,5));
    }

    public static int sum(int from,int to){

        if ( from==to )
            return to;
        else
            return from + sum( from+1, to );

    }
}
