class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int [2];
        int n= grid.length ;
        long N = (long) n * n;
        long expectedSum = N * (N + 1) / 2;
        long expectedSumSq = N * (N + 1) * (2 * N + 1) / 6;
        long actualSum = 0;
        long actualSumSq = 0;
        for (int[] row : grid) {
            for (int num : row) {
                actualSum += num;
                actualSumSq += (long) num * num;
            }
        }
        long diff = actualSum - expectedSum;
        long sqDiff = actualSumSq - expectedSumSq;
        long sum = sqDiff / diff;    
        long repeated = (diff + sum) / 2;
        long missing = sum - repeated;
        ans[0]= (int)repeated;
        ans[1]= (int)missing;
        return ans;
    }
}