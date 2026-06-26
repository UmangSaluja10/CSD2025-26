class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[] dp = new int[rowIndex+1];
        dp[0]=1;
        for(int i=1;i<=rowIndex;i++){
            for(int j=i;j>=1;j--){
                dp[j] = dp[j]+dp[j-1];
            }
        }
        List<Integer> list = new ArrayList<>(dp.length);
        for (int num : dp) {
            list.add(num); 
        }
        return list;
    }
}