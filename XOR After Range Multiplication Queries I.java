// class Solution {
//     public int xorAfterQueries(int[] nums, int[][] queries) {
//         for(int i=0;i<queries.length;i++){
//             int idx = queries[i][0];
//             while(idx<=queries[i][1]){
//                 nums[idx] = (nums[idx]*queries[i][3])%((int)(Math.pow(10,9)+7));
//                 idx+=queries[i][2];
//             }
//         }
//         int xor=nums[0];
//         for(int i=1;i<nums.length;i++){
//             xor=xor^nums[i];
//         }
//         return xor;
//     }
// }
class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        final int MOD = 1_000_000_007;

        for(int i = 0; i < queries.length; i++){
            int idx = queries[i][0];

            while(idx <= queries[i][1]){
                nums[idx] = (int)((nums[idx] * 1L * queries[i][3]) % MOD);
                idx += queries[i][2];
            }
        }

        int xor = 0;
        for(int num : nums){
            xor ^= num;
        }

        return xor;
    }
}
