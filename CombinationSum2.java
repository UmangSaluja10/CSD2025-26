class Solution {
    public static void backtrack(int[] candidates, int i, int remaining, List<List<Integer>> res, List<Integer> current){
        if(remaining==0){
            List<Integer> copy = new ArrayList<>(current);
            res.add(copy);
            return;
        }
        if(remaining<0)return;
        for(int x=i;x<candidates.length;x++){
            if(x>i && candidates[x-1]==candidates[x])continue;
            if(candidates[x] > remaining)break;
            current.add(candidates[x]);
            backtrack(candidates,x+1,remaining-candidates[x],res,current);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, 0, target, res, new ArrayList<>());
        return res;
    }
}
