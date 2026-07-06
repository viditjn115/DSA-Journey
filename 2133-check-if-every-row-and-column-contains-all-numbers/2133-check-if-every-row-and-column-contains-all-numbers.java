class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        HashSet<Integer>[] rows = new HashSet[n];
        HashSet<Integer>[] cols= new HashSet[n];
        for(int i=0;i<n;i++){
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
        }
        for(int row = 0;row<n;row++){
            for(int col=0;col<n;col++){
                int  dgt = matrix[row][col];
                rows[row].add(dgt);
                cols[col].add(dgt);
            }
        }
        for(int i=0;i<n;i++){
            if(rows[i].size()!=n|| cols[i].size()!=n)
            return false;
        }
        return true;
    }
}