package org.example.dynamic_programming;

import java.util.Arrays;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        MinCostClimbingStairs minCostClimbingStairs= new MinCostClimbingStairs();
    }

    int [] cost;
    public int minCostClimbingStairs(int[] cost) {
        this.cost=cost;
        this.minCost = new int[cost.length+1];
        Arrays.fill(minCost,-1);
        return dp(cost.length-1,0);
    }

    int dp(int index,int result){
        return 2;
    }

    int [] minCost;

    int dp2(int index,int result){
        if(index==0)return 0;
        if(index==1) return dp(index-1,result);

        if(minCost[index]!=-1){
            result+= minCost[index]+cost[index];
        }else{
            minCost[index] = Math.min(cost[index]+minCost[index-1],cost[index]+ minCost[index-2]);
            result+= minCost[index];
        }
        return dp(index-1,result);
    }
}
//                new Object[]{new int[]{10,15,20}, 3},
//                new Object[]{new int[]{1,100,1,1,1,100,1,1,100,1}, 2}