package org.example.integer;

public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(123456));

    }

    private static boolean isPowerOfFour(int num){
        if(num==0)
            return false;
        else if(num==1)
            return true;
        else if(num==4)
            return true;
        else if(num%4!=0)
            return false;
        return isPowerOfFour(num/4);
    }
}
