class Solution {
    public double largestSumOfAverages(int[] nums, int k) {
        int n = nums.length;

        double[] prefix = new double[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        double[][] dp = new double[n + 1][k + 1];

        for (int i = 1; i <= n; i++) {
            dp[i][1] = prefix[i] / i;
        }

        for (int groups = 2; groups <= k; groups++) {
            for (int i = groups; i <= n; i++) {
                for (int cut = groups - 1; cut < i; cut++) {
                    double lastAverage = (prefix[i] - prefix[cut]) / (i - cut);
                    dp[i][groups] = Math.max(
                        dp[i][groups],
                        dp[cut][groups - 1] + lastAverage
                    );
                }
            }
        }

        return dp[n][k];
    }
}
