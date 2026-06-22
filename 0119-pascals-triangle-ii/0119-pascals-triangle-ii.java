class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        for(int r=0 ;r<=rowIndex ; r++){
            row.add((int)ncr(rowIndex , r));
        }
        return row;
    }
    public long ncr(int n , int r){
        if(r>n || n<0 || r<0){
            return -1;
        }
        else{
            if(n==r || r==0){
                return 1;
            }
            else{
                return (long) ncr(n-1, r-1) * n / r;
            }
        }
    }
}