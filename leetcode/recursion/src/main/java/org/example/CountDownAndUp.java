package org.example;

public class CountDownAndUp {
    public static void main(String[] args) {

        int num = 10;
        myNum = num;
        countDownAndUp(num);

    }
    static int myNum= 0;
    static void countDownAndUp(int n){
        System.out.println(n);
        if(n==0) {
            System.out.println("reaced base");
            return;
        }else{
            countDownAndUp(n-1);
            System.out.println(n+" returning");
            return;
        }
    }
}
