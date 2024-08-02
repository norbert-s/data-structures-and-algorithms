package org.sample.array2;

public class EvenOdd {
    public int[] evenOdd(int[] nums) {
        int[] tombParos = new int[nums.length];
        int[] tombParatlan = new int[nums.length];


        int counterParos = -1;
        int counterParatlan = -1;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] % 2) == 1) {
                counterParatlan++;
                tombParatlan[counterParatlan] = nums[i];
            } else {
                counterParos++;
                tombParos[counterParos] = nums[i];
            }
        }
        int[] resultTomb = new int[nums.length];
        int counterResult = 0;

        int i = 0;


        while (i <= counterParos) {
            resultTomb[i] = tombParos[i];
            i++;
            counterResult++;
        }
        i = 0;
        while (i <= counterParatlan) {
            resultTomb[counterResult] = tombParatlan[i];
            i++;
            counterResult++;
        }
        return resultTomb;
    }


}
