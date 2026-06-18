class Solution {
    public static boolean isValid(String s){
        if(s.length()>3)return false;
        if(Integer.parseInt(s)>255)return false;
        if(s.charAt(0)=='0' && s.length()>1)return false;
        return true;
    }
    public static void backtrack(String s, int index, List<String> parts, List<String> res){
        if(parts.size()==4){
            if(index==s.length()){
                String result="";
                for(int i=0;i<parts.size();i++){
                    result+=parts.get(i);
                    if(i!=parts.size()-1){
                        result+=".";
                    }
                }
                res.add(result);
                return;
            }
        }
        for(int i=1;i<=3;i++){
            if(index+i>s.length()){
                break;
            }
            String segment = s.substring(index,i+index);
            if(isValid(segment)){
                parts.add(segment);
                backtrack(s,index+i,parts,res);
                parts.remove(parts.size()-1);
            }
        }
    }
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        backtrack(s,0,new ArrayList<>(),res);
        return res;
    }
}
