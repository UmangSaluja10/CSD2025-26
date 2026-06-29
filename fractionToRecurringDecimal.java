class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator==0)return "0";
        int flag=0;
        if(numerator<0 && denominator<0)flag=0;
        else if(numerator<0 || denominator<0)flag=1;
        HashMap<Long, Integer> map = new HashMap<>();
        long deno = (long) denominator;
        long nume = (long) numerator;
        nume = Math.abs(nume);
        deno = Math.abs(deno);
        long integerPart = nume/deno;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(integerPart));
        long remainder = nume%deno;
        if(remainder!=0){
            sb.append(".");
        }else{
            if(flag==1){
                sb.insert(0,"-");
            }
            return sb.toString();
        }
        while(remainder!=0){
            if(map.containsKey(remainder)){
                sb.insert(map.get(remainder),"(");
                sb.append(")");
                break;
            }
            map.put(remainder,sb.length());
            remainder*=10;
            long digit = remainder/deno;
            sb.append(String.valueOf(digit));
            remainder%=deno;
        }
        if(flag==1){
                sb.insert(0,"-");
            }
        return sb.toString();
    }
}