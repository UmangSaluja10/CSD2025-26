class Solution {
    static class Interval{
        int start, end;
        Interval(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    public int[][] merge(int[][] intervals) {
        if(intervals==null || intervals.length==0)return new int[0][0];
        Interval[] arr = new Interval[intervals.length];
        for(int i=0;i<intervals.length;i++){
            arr[i] = new Interval(intervals[i][0], intervals[i][1]);
        }
        Arrays.sort(arr, (a,b) -> Integer.compare(a.start,b.start));
        List<Interval> mergedIntervals = new ArrayList<>();
        Interval current = arr[0];
        mergedIntervals.add(current);
        for(int i=1;i<arr.length;i++){
            Interval next = arr[i];
            if(next.start<=current.end){
                current.end = Math.max(current.end,next.end);
            }else{
                current = next;
                mergedIntervals.add(current);
            }
        }
        int[][] res = new int[mergedIntervals.size()][2];
        for(int i=0;i<mergedIntervals.size();i++){
            res[i][0] = mergedIntervals.get(i).start;
            res[i][1] = mergedIntervals.get(i).end;
        }
        return res;
    }
}
