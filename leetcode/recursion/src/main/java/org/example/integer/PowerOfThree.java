package org.example.integer;

public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(123456));

    }

    private static boolean isPowerOfThree(int num){
        if(num==0)
            return false;
        else if(num==1)
            return true;
        else if(num==3)
            return true;
        else if(num%3!=0)
            return false;
        return isPowerOfThree(num/3);
    }
}
