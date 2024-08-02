package org.example.integer;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(123456));

    }

    private static boolean isPowerOfTwo(int num){
        if(num==0)
            return false;
        else if(num==1)
            return true;
        else if(num==2)
            return true;
        else if(num%2!=0)
            return false;
        return isPowerOfTwo(num/2);
    }

}
