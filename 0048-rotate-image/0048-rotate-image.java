class Solution {
    public void rotate(int[][] matrix) {
        int rows=matrix.length;
        int cols=rows;
        for(int row=0;row<rows-1;row++ ){
            for(int col=row+1;col<cols;col++){
                int temp = matrix[row][col];
                matrix[row][col]=matrix[col][row];
                matrix[col][row]=temp;
            }
        }
        for(int row=0;row<rows;row++){
            for(int col=0;col<cols/2;col++){
                int temp=matrix[row][col];
                matrix[row][col]=matrix[row][cols-col-1];
                matrix[row][cols-col-1]=temp;           
                }
        }
    }
}