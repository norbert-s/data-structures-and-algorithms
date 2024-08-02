package org.example.integer;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(101));
    }
    private static int countZeros(int num){
        if(num ==0) return 0;
        int result = 0;
        if(num%10==0)
            result +=1;

        return result + countZeros(num/10);
    }
}
