package q19255;

import java.util.*;

public class CTJ19255 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();
        int n = sc.nextInt();

        int[] coins = new int[n];

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        long[] dp = new long[sum + 1];

        dp[0] = 1;

        for (int coin : coins) {
            for (int j = coin; j <= sum; j++) {
                dp[j] = dp[j] + dp[j - coin];
            }
        }

        System.out.println(dp[sum]);
    }
}
