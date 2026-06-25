class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.get(triangle.size()-1).size()];
        for(int i=triangle.size()-1;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                if(i==triangle.size()-1){
                    dp[j] = (triangle.get(i)).get(j);
                }else{
                    dp[j] = (triangle.get(i)).get(j)+Math.min(dp[j],dp[j+1]);
                }
            }
        }
        return dp[0];
    }
}