package org.example.easy;

public class BestTimeToSellStock {
    public static void main(){
        BestTimeToSellStock instance = new BestTimeToSellStock();

    }
    public int maxProfit(int[] prices) {
        int arr [] = new int [2];
        int max=0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]-prices[i]>max){
                    max = prices[j]-prices[i];
                    arr[0]=prices[i];
                    arr[1]=prices[j];
                }
            }
        }
        return max;
    }

}
