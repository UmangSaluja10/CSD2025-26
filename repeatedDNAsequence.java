class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> seen = new HashSet<>();
        HashSet<String> result = new HashSet<>();
        for(int i=0;i<=s.length()-10;i++){
            String sub = s.substring(i,10+i);
            if(seen.contains(sub)){
                result.add(sub);
            }else{
                seen.add(sub);
            }
        }
        List<String> res  = new ArrayList<>(result);
        return res;
    }
}