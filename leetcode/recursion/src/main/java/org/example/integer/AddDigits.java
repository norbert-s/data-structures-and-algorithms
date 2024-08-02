package org.example.integer;

public class AddDigits {

    //https://leetcode.com/problems/add-digits/description/
    public int addDigits(int num) {
        return addDigitRecursive(Long.valueOf(num));
    }

    public int addDigitRecursive(long n) {
        if(n==0)return 0;
        long sum =n%10+ addDigitRecursive(n/10);
        if(sum/10==0){
            return (int) sum;
        }else{
            sum = addDigitRecursive(sum);
        }
        return (int) sum;
    }
}
