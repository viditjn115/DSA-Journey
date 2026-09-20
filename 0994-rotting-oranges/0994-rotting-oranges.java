class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> dq = new LinkedList<>();
        int fresh = 0;
        for(int row = 0 ; row<grid.length ; row++){
            for(int col = 0 ; col<grid[0].length;col++){
                if(grid[row][col]==2){
                    dq.offer(new int []{row , col});
                }
                else if(grid[row][col]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0){
            return 0;
        }
        int[][] dir = {{-1, 0},{1, 0},{0, -1},{0, 1}};
        int min=-1;
        while(!dq.isEmpty()){
            int size = dq.size();
            for(int i =0 ;i<size ; i++){
                int [] curr = dq.poll();
                int row = curr[0];
                int col = curr[1];
                
                for(int[] d : dir){
                int newRow = row + d[0];
                int newCol = col + d[1];

                if(newRow>=0 && newRow<grid.length && newCol>=0 && newCol<grid[0].length){

                    if(grid[newRow][newCol]==1){

                        grid[newRow][newCol]=2;
                        fresh--;
                        dq.offer(new int[]{newRow , newCol});
                    }   
                }}
            }
            min++;
        }
        return fresh==0?min:-1;
    }
}