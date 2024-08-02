package org.example;

public class FindMaxConsequtiveOnes {
    public static void main(String[] args) {
        int[] tomb ={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(tomb));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int max=0;
        int current=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) current++;
            else{
                if(current>max){
                    max=current;
                }
                current=0;
            }
        }
        if(current>max){
            max=current;
        }
        return max;

    }
    public int findMaxConsecutiveOnes2(int[] nums) {
        if(nums==null|nums.length==0) return 0;
        if(nums.length==1&&nums[0]==1) return 1;
        int counterOfOnes = 0;
        int maxNumberOfOnes = 0;
        int maxIndexAllowed = nums.length-1;
        for(int i=0;i<=maxIndexAllowed;i++){
            if(nums[i]==1){
                counterOfOnes++;
                int lookAhead=1;
                while((i+lookAhead)<=maxIndexAllowed&&nums[i+lookAhead]==1 ){
                    counterOfOnes++;
                    lookAhead++;
                }
            }
            if(counterOfOnes>maxNumberOfOnes)maxNumberOfOnes=counterOfOnes;
            counterOfOnes=0;
        }
        return maxNumberOfOnes;
    }
}
