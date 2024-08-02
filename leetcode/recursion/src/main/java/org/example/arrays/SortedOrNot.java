package org.example.arrays;

public class SortedOrNot {
    public static void main(String[] args) {
        int [] nums = {1,2,6,4,5};
        System.out.println(sortedOrNot(nums,nums.length-1));
    }

    static boolean sortedOrNot(int []num, int ptr){
        if(ptr==0)
            return true;
        if(num[ptr]<num[ptr-1])
            return false;
        return sortedOrNot(num,ptr-1);
    }
}
