class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals==null || intervals.length==0){
            int[][] x = new int[1][2];
            x[0][0] = newInterval[0];
            x[0][1] = newInterval[1];
            return x;
            }
        List<int[]> res= new ArrayList<>();
        int i=0;
        while(i<intervals.length && intervals[i][1] < newInterval[0]){
            res.add(intervals[i]);
            i++;
        }
        while(i<intervals.length && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
            res.add(newInterval);
        while(i<intervals.length){
            res.add(intervals[i]);
            i++;
        }
        int[][] result = new int[res.size()][2];
        for(int j=0;j<res.size();j++){
            result[j][0] = res.get(j)[0];
            result[j][1] = res.get(j)[1];
        }
        return result;
       
    }
}
