import java.util.*;
class Solution {
    static final int MOD = 1_000_000_007;
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length;
        int[][] bravexuneth = queries;
        int B = (int) Math.sqrt(n);
        Map<Integer, List<int[]>> smallK = new HashMap<>();
        for (int[] q : queries) {
            int l = q[0], r = q[1], k = q[2], v = q[3];

            if (k <= B) {
                smallK.putIfAbsent(k, new ArrayList<>());
                smallK.get(k).add(q);
            } else {
                for (int i = l; i <= r; i += k) {
                    nums[i] = (int) ((nums[i] * 1L * v) % MOD);
                }
            }
        }
        for (int k : smallK.keySet()) {
            List<int[]> list = smallK.get(k);
            for (int start = 0; start < k; start++) {
                List<Integer> indices = new ArrayList<>();
                for (int i = start; i < n; i += k) {
                    indices.add(i);
                }
                int m = indices.size();
                long[] diff = new long[m + 1];
                Arrays.fill(diff, 1);
                for (int[] q : list) {
                    int l = q[0], r = q[1], v = q[3];

                    if (l % k != start) continue;

                    int left = (l - start) / k;
                    int right = (r - start) / k;

                    diff[left] = (diff[left] * v) % MOD;

                    if (right + 1 < m) {
                        diff[right + 1] = (diff[right + 1] * modInverse(v)) % MOD;
                    }
                }
                long cur = 1;
                for (int i = 0; i < m; i++) {
                    cur = (cur * diff[i]) % MOD;
                    int idx = indices.get(i);
                    nums[idx] = (int) ((nums[idx] * cur) % MOD);
                }
            }
        }
        int xor = 0;
        for (int num : nums) xor ^= num;
        return xor;
    }    
    private long pow(long a, long b) {
        long res = 1;
        a %= MOD;
        while (b > 0) {
            if ((b & 1) == 1) res = (res * a) % MOD;
            a = (a * a) % MOD;
            b >>= 1;
        }
        return res;
    }
    private long modInverse(long x) {
        return pow(x, MOD - 2);
    }
}
