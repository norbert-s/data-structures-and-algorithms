package org.sample.array1;

public class MiddleWay {
    public int[] middleWay(int[] a, int[] b) {
        int length = 2;
        int [] newArr = new int [length];
        newArr[0]= a[1];
        newArr[1] =b[1];
        return newArr;
    }

}
