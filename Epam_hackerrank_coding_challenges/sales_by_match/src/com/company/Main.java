package sales_by_match.src.com.company;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        HashSet<Integer> a = new HashSet<Integer>();
        for (int i = 0; i < ar.length; i++) {
            a.add(ar[i]);
        }
        int pairs = 0;
        Iterator<Integer> setIt = a.iterator();
        while (setIt.hasNext()) {
            int next = setIt.next();
            int count = 0;
            for (int i = 0; i < ar.length; i++) {
                int egyik = ar[i];
                if (egyik == next) {
                    count++;
                }
            }
            pairs += count / 2;
        }
        return pairs;

    }
}
