import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();
        int start= intervals[0][0];
        int end= intervals[0][1];
        int rows= intervals .length ;
        for(int row = 1 ; row<rows ; row++){
            if( intervals[row][0]<=end){
                end = Math.max(end ,  intervals[row][1]);
            }
            else{
                res.add(new int[]{start , end});
                start = intervals[row][0];
                end = intervals[row][1];
            }
        }
        res.add(new int[]{start, end});
        return res.toArray(new int[res.size()][]);
    }
}