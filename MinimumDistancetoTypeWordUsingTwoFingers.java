class Solution {

    private int dist(int a, int b) {
        if (a == -1 || b == -1) return 0; // initial free position
        int x1 = a / 6, y1 = a % 6;
        int x2 = b / 6, y2 = b % 6;
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

    public int minimumDistance(String word) {
        int n = word.length();

        // dp[l][r] = min cost
        int[][] dp = new int[27][27];

        // initialize with large value
        for (int i = 0; i < 27; i++) {
            for (int j = 0; j < 27; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        // both fingers free
        dp[26][26] = 0;

        for (char ch : word.toCharArray()) {
            int curr = ch - 'A';

            int[][] newDp = new int[27][27];
            for (int i = 0; i < 27; i++) {
                for (int j = 0; j < 27; j++) {
                    newDp[i][j] = Integer.MAX_VALUE;
                }
            }

            for (int l = 0; l < 27; l++) {
                for (int r = 0; r < 27; r++) {
                    if (dp[l][r] == Integer.MAX_VALUE) continue;

                    // move left finger
                    newDp[curr][r] = Math.min(
                        newDp[curr][r],
                        dp[l][r] + dist(l == 26 ? -1 : l, curr)
                    );

                    // move right finger
                    newDp[l][curr] = Math.min(
                        newDp[l][curr],
                        dp[l][r] + dist(r == 26 ? -1 : r, curr)
                    );
                }
            }

            dp = newDp;
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < 27; i++) {
            for (int j = 0; j < 27; j++) {
                ans = Math.min(ans, dp[i][j]);
            }
        }

        return ans;
    }
}
