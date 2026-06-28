class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int max = Integer.MIN_VALUE;
        HashSet<String> set = new HashSet<>();
        for(String str: wordDict){
            if(str.length()>max)max=str.length();
            set.add(str);
        }
        boolean[] dp = new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}