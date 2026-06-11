class Solution {
    public static void backtrack(int[] candidates, int i, int remaining, List<List<Integer>> res, List<Integer> current){
        if(remaining==0){
            List<Integer> copy = new ArrayList<>(current);
            res.add(copy);
            return;
        }
        if(remaining<0)return;
        for(int x=i;x<candidates.length;x++){
            current.add(candidates[x]);
            backtrack(candidates,x,remaining-candidates[x],res,current);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, 0, target, res, new ArrayList<>());
        return res;
    }
}
