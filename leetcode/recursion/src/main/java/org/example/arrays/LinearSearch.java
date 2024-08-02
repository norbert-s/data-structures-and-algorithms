package org.example.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int [] nums = {1,2,6,4,5};
        System.out.println(linearSearch(nums,0,1));
    }

    static int linearSearch(int []num, int index, int val){
        if(index==num.length)
            return -1;
        else if(num[index]==val)
            return index;
        return linearSearch(num,index+1,val);

    }
}
