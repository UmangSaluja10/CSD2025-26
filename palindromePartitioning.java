class Solution {
    public static boolean palin(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
    public static void backtrack(String s, int start,List<String> current, List<List<String>> res){
        if(start==s.length()){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int end = start; end<s.length();end++){
            String sub = s.substring(start,end+1);
            if(palin(sub)){
                current.add(sub);
                backtrack(s,end+1,current,res);
                current.remove(current.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(s,0,new ArrayList<>(),res);
        return res;
    }
}