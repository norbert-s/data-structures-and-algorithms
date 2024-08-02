package org.example;

public class NumberOfSteps {

    public int numberOfSteps(int num) {
        if(num == 0) return 0;
        int result = 0;
        if(num%2==0)
            result = num / 2;
        else
            result = num -1;

        return 1+ numberOfSteps(result);
    }
    //leetcode 1342
}
