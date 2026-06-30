class Solution {
    public String largestNumber(int[] nums) {
        String[] num = Arrays.stream(nums)
                             .mapToObj(String::valueOf)
                             .toArray(String[]::new);
        Arrays.sort(num,(a,b)->(b+a).compareTo(a+b));
        if (num[0].equals("0")) {
            return "0";
        }
        return String.join("", num);
    }
}