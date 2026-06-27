class Solution {
    public int getMaximumGold(int[][] grid) {
        int maxGold=0;
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                if(grid[row][col]!=0){
                    int gold=maxGoldAlongPath(grid , row , col);
                    maxGold=Math.max(maxGold , gold);
                }
            }
        }
        return maxGold;
    }
    public int maxGoldAlongPath(int[][] grid , int row , int col ){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col]==0){
            return 0;
        }
        int gold=grid[row][col];
        grid[row][col]=0;
        int up = maxGoldAlongPath(grid, row - 1, col);
        int down = maxGoldAlongPath(grid, row + 1, col);
        int left = maxGoldAlongPath(grid, row, col - 1);
        int right = maxGoldAlongPath(grid, row, col + 1);
        grid[row][col]=gold;
        return gold+ Math.max(Math.max(up,down),Math.max(left,right));
    }
}