class Solution {
    public static String expand(String s, int i1, int i2){
        int left = i1;
        int right = i2;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
    public String longestPalindrome(String s) {
        if(s.length()==1)return s;
        String res1 = "", res2 = "", maxRes = "";
        for(int i=0;i<s.length();i++){
            res1 = expand(s,i,i+1);
            res2 = expand(s,i,i);
            if(res1.length()>maxRes.length()){
                maxRes = res1;
            }
            if(res2.length()>maxRes.length()){
                maxRes = res2;
            }
        }
        return maxRes;
    }
}
