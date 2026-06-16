class Solution {
    public static void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> res){
        res.add(new ArrayList<>(current));
        for(int i=start;i<nums.length;i++){
            current.add(nums[i]);
            backtrack(i+1,nums,current,res);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0,nums,new ArrayList<>(),res);
        return res;
    }
}
