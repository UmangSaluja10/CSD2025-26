class Solution {
    public String multiply(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();
        int[] res = new int[n+m];
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                int p1 = i+j;
                int p2 = i+j+1;
                int d1 = num1.charAt(i)-'0';
                int d2 = num2.charAt(j)-'0';
                int product = d1*d2;
                int sum = product+res[p2];
                res[p2] = sum%10;
                res[p1] += sum/10;
            }
        }
        String rawString = Arrays.stream(res)
                                 .mapToObj(String::valueOf)
                                 .collect(Collectors.joining(""));
        String result = rawString.replaceFirst("^0+", "");
        if(result.length()==0)return "0";
        return result;
    }
}
