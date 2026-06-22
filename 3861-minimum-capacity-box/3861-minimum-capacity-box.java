class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int min_cap=Integer.MAX_VALUE;
        for(int i:capacity){
            if(i>=itemSize){
                min_cap=Math.min(min_cap,(i-itemSize));
            }
        }
        int cap= min_cap+itemSize;
        for (int i=0;i<capacity.length;i++){
            if(capacity[i]==cap){
            return i;
            }
        }
        return -1;
    }
}