class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int rows=intervals.length ;
        int  i=0;
        while(i<rows && newInterval[0]>intervals[i][1]){
            list.add(intervals[i]);
            i++;
        }
        while(i<rows && newInterval[1]>=intervals[i][0] ){
            newInterval[0] = Math.min(intervals[i][0] , newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1] , newInterval[1]);
            i++;
        }
        list.add(newInterval);
        while(i<rows){
            list.add(intervals[i]);
            i++;
        }
        return list.toArray(new int[list.size()][]);
    }
}