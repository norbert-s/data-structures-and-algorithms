package org.sample.array1;

public class Sum2 {
    public int sum2(int[] nums) {
        int ossz = 0;
        int length = nums.length;
        if(length==0){
            return 0;
        }
        else if(length==1){
            return nums[0];
        }
        else{
            for(int i=0;i<2;i++){
                ossz+=nums[i];
            }
        }

        return ossz;
    }

}
