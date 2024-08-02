package org.example.medium;

public class RemoveDuplicates2 {

    public static void main(String[] args) {
        RemoveDuplicates2 removeDuplicates2 = new RemoveDuplicates2();

    }
    public int removeDuplicates(int[] nums) {

        if(nums.length>=0&&nums.length<=2) return nums.length;
        int counterOfSpill=0;

        int length = nums.length;
        int count =1;
        int i=1;
        for(;i<length-counterOfSpill;i++){

            int currentMin=nums[i-1];
            int current=nums[i];
            if(current==currentMin){
                count++;
                if(count>2){
                    int k=i;
                    while(k<length-1-counterOfSpill){
                        nums[k]=nums[k+1];
                        k++;
                    }
                    counterOfSpill++;
                    i--;

                }

            }
            else{
                count=1;
            }


        }
        return length-counterOfSpill;
    }
}
