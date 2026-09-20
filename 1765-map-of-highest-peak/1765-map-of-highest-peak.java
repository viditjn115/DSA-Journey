class Solution {
    public int[][] highestPeak(int[][] isWater) {
        Queue<int[]> dq = new LinkedList<>();
        int[][] dist = new int[isWater.length][isWater[0].length];
        for(int row = 0 ; row<isWater.length ; row++){
            for(int col = 0 ; col<isWater[0].length;col++){
                if(isWater[row][col]==1){
                    dq.offer(new int []{row , col});
                }
                else{
                    dist[row][col]=-1;
                }
            }
        }
        int[][] dir = {{-1, 0},{1, 0},{0, -1},{0, 1}};
        while(!dq.isEmpty()){
            int [] curr = dq.poll();
            int row = curr[0];
            int col = curr[1];

            for(int[] d : dir){
                int newRow = row + d[0];
                int newCol = col + d[1];

                if(newRow>=0 && newRow<isWater.length && newCol>=0 && newCol<isWater[0].length){

                    if(dist[newRow][newCol]==-1){
                        dist[newRow][newCol]=dist[row][col]+1;

                        dq.offer(new int[]{newRow , newCol});
                    }   
                }
            }
        }
        return dist;
    }
}