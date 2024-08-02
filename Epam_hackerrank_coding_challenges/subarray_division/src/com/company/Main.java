package subarray_division.src.com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {

        int count=0;

        for(int i=0;i<=s.size()-1-m+1;i++){
            int sum =0;
            for(int j=0;j<m;j++){
                sum+=s.get(i+j);
            }
            if(sum==d){
                count++;
            }
        }
        return count;
    }
}
