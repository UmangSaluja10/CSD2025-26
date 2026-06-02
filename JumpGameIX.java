class Solution {
    public int[] maxValue(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int[] suffixMin = new int[n + 1];
        suffixMin[n] = Integer.MAX_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }

        int start = 0;
        int currentMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            currentMax = Math.max(currentMax, nums[i]);

            if (i == n - 1 || currentMax <= suffixMin[i + 1]) {
                for (int j = start; j <= i; j++) {
                    ans[j] = currentMax;
                }

                start = i + 1;
                currentMax = Integer.MIN_VALUE;
            }
        }

        return ans;
    }
}
