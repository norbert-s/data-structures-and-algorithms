package org.example.dynamic_programming;

public class HomerSimpson {
    public static void main(String[] args) {
        HomerSimpson homerSimpson = new HomerSimpson();
        homerSimpson.solve(4, 9, 15);
        homerSimpson.solveDP(4,9,15);
        //System.out.println(homerSimpson.total_calls);
    }
    void solveDP(int m, int n, int t) {
        int result, i, first, second;
        int dp[]=new int[10000];
        dp[0] = 0;
        for (i = 1; i <= t; i++) {
            if (i >= m)
                first = dp[i - m];
            else
                first = -1;
            if (i >= n)
                second = dp[i - n];
            else
                second = -1;
            if (first == -1 && second == -1)
                dp[i] = -1;
            else
                dp[i] = Math.max(first, second) + 1;
        }

        result = dp[t];
        if (result >= 0) {
            System.out.println(result);
        }
        else {
            i = t - 1;
            result = dp[i];
            while (result == -1) {
                i--;
                result = dp[i];
            }
            System.out.println(result+" "+(t-i));;
        }
    }
    long  total_calls=0;
    int solve_t(int m, int n, int t) {
        total_calls++;
        int first, second;
        if (memo[t] != -2)
            return memo[t];
        if (t == 0) {
            memo[t] = 0;
            return memo[t];
        }
        if (t >= m)
            first = solve_t(m, n, t - m);
        else
            first = -1;
        if (t >= n)
            second = solve_t(m, n, t - n);
        else
            second = -1;
        if (first == -1 && second == -1) {
            memo[t] = -1;
            return memo[t];
        } else {
            memo[t] = Math.max(first, second) + 1;
            return memo[t];
        }
    }
    int memo[];
    void solve(int m, int n, int t) {
        this.memo = new int[1000000];
        for (int i = 0; i <= t; i++)
            memo[i] = -2;
        int result, i;
        result = solve_t(m, n, t);
        if (result >= 0)
            System.out.println( result);
        else {
            i = t - 1;
            result = solve_t(m, n, i);
            while (result == -1) {
                i--;
                result = solve_t(m, n, i);
            }
            System.out.println( result+" "+ (t - i));
        }
    }
}
