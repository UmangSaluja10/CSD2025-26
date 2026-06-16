class Solution {
    public static void backtrack(int i, int n, int k, List<Integer> current, List<List<Integer>> res){
        if(current.size()==k){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int x=i;x<=n;x++){
            current.add(x);
            backtrack(x+1,n,k,current,res);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(1,n,k,new ArrayList<>(),res);
        return res;
    }
}
