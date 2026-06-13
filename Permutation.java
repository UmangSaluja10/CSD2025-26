class Solution {
    public static void backtrack(int[] nums, List<Integer> current, boolean[] visited, List<List<Integer>> res){
        if(current.size()==nums.length){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                current.add(nums[i]);
                visited[i]=true;
                backtrack(nums,current,visited,res);
                current.remove(current.size()-1);
                visited[i]=false;
            }
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(nums, new ArrayList<Integer>(), visited, res);
        return res;
    }
}
