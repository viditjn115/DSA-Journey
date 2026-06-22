class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int start = 0;
        int end = position[position.length-1]-position[0];
        int ans=0;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(isPossible(position , mid , m)){
                ans = mid;
                start =mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return ans ;
    }
    public boolean isPossible(int [] positions , int mid , int m){
        int pos=positions[0];
        int balls=1;
        for(int i=1;i<positions.length ; i++){
            if(positions[i]-pos>=mid){
                balls++;
                pos=positions[i];
                if(balls>=m){
                    return true;
                }
            }
        }
        return false;
    }
}