class Solution {
    public boolean isGood(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums.length-1){
                j++;
            }
            set.add(nums[i]);
        }
        for(int i=1;i<nums.length;i++){
            if(j==2 && set.contains(i)){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
