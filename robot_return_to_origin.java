class Solution {
    public boolean judgeCircle(String moves) {
        int sumrl=0,sumud=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='R')sumrl+=1;
            if(moves.charAt(i)=='L')sumrl-=1;
            if(moves.charAt(i)=='U')sumud+=1;
            if(moves.charAt(i)=='D')sumud-=1;
        }
        return (sumud == 0 && sumrl == 0);
    }
}
