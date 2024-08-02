package org.example.integer;

public class SumOfProduct {
    public static void main(String [] args){
        System.out.println(sumOfProduct(1117));
    }

    public static int sumOfProduct(int num){
        if(num ==0){
            return 1;
        }

        return (num%10) * sumOfProduct(num/10);
    }
}
