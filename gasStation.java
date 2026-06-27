class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalSum = 0;
        for(int i=0;i<gas.length;i++){
            totalSum+=gas[i]-cost[i];
        }
        if(totalSum<0)return -1;
        int currentSum=0, start=0;
        for(int i=0;i<gas.length;i++){
            currentSum+=gas[i]-cost[i];
            if(currentSum<0){
                start=i+1;
                currentSum=0;
            }
        }
        return start;
    }
}