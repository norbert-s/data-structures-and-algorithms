package divisible_sum_pairs.src.com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        for (int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                if(i!=j){
                    if((ar[i]+ar[j])%k==0){
                        count++;
                    }
                }
            }
        }
        return count/2;
    }
}
