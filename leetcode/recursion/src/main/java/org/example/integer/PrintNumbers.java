package org.example.integer;

public class PrintNumbers {

    public static void main(String[] args) {
        printNumbers(1,5);
    }

    static void printNumbers2(int from,int to){
        if(from==to) {
            System.out.println(from);
        }
        else{
            System.out.println(from);
            printNumbers2(from+1,to);
        }
    }
    public static void printNumbers(int first,int last){
        if ( first<=last ){
            System.out.println(first);
            printNumbers( first+1, last );
        }
    }
}
