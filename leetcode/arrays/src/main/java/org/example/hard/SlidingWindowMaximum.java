package org.example.hard;

import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[]args){
        SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();
        int [] arr = {1,3,3,2,0,5};
        int [] arrRes = slidingWindowMaximum.maxSlidingWindow(arr,3);
        Arrays.stream(arrRes).forEach(System.out::println);
    }

        ArrayDeque<Integer> deq = new ArrayDeque<Integer>();
        int [] nums;

        public void clean_deque(int i, int k) {
            // remove indexes of elements not from sliding window
            if (!deq.isEmpty() && deq.getFirst() == i - k)
                deq.removeFirst();

            // remove from deq indexes of all elements
            // which are smaller than current element nums[i]
            while (!deq.isEmpty() && nums[i] > nums[deq.getLast()])                           deq.removeLast();
        }

        public int[] maxSlidingWindow(int[] nums, int k) {
            int n = nums.length;
            if (n * k == 0) return new int[0];
            if (k == 1) return nums;

            // init deque and output
            this.nums = nums;
            int max_idx = 0;
            for (int i = 0; i < k; i++) {
                clean_deque(i, k);
                deq.addLast(i);
                // compute max in nums[:k]
                if (nums[i] > nums[max_idx]) max_idx = i;
            }
            int [] output = new int[n - k + 1];
            output[0] = nums[max_idx];

            // build output
            for (int i  = k; i < n; i++) {
                clean_deque(i, k);
                deq.addLast(i);
                output[i - k + 1] = nums[deq.getFirst()];
            }
            return output;
        }


    //time limit exceeded 39/51
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        Map<Integer,Integer> map = new HashMap<>();
//        List<Integer>list = new ArrayList<>();
//        List<Map<Integer,Integer>> finalList = new ArrayList<>();
//        int maxvalue = -100001;
//        int startPtr =0;
//        int i=0;
//        int counter = 0;
//        int secondMax = -100001;
//        for(;i<k;i++){
//            //hozzadjuk a sumhoz az elso k elem erteket
//            //majd hozzaadjuk oket a linkedlistahoz
//            if(map.containsKey(nums[i])){
//                map.put(nums[i],map.get(nums[i])+1);
//            }
//            else{
//                map.put(nums[i],1);
//            }
//            if(nums[i]>maxvalue){
//                maxvalue=nums[i];
//            }
//        }
//        //idáig kész
//        //az eddigi maxot hozzá kell adni egy listához
//        list.add(maxvalue);
//
//        for(;i<nums.length;i++){
//
//            int mapElemCount = map.get(nums[startPtr]);
//
//            if(mapElemCount==1){
//                map.remove(nums[startPtr]);
//                if(nums[startPtr]==maxvalue){
//                    maxvalue= -100001;
//                }
//            }else{
//                //ha ez volt a max akkor marad
//                if(maxvalue<nums[startPtr]) maxvalue = nums[startPtr];
//                map.put(nums[startPtr],map.get(nums[startPtr])-1);
//            }
//
//
//            if(map.containsKey(nums[i])){
//                if(maxvalue<nums[i]) maxvalue = nums[i];
//                map.put(nums[i],map.get(nums[i])+1);
//            }
//            else{
//                if(maxvalue<nums[i]) maxvalue = nums[i];
//                map.put(nums[i],1);
//                maxvalue = -100001;
//                for(Map.Entry<Integer,Integer> entry:map.entrySet()){
//                    if(entry.getKey()>maxvalue)maxvalue=entry.getKey();
//                }
//            }
//
//            list.add(maxvalue);
//            startPtr++;
//        }
//
//        int [] arr = list.stream().mapToInt(s->Integer.valueOf(s)).toArray();
//        return arr;
//    }
}
