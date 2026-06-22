class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l=nums.length;
        int[] res= new int[l];
        int pos=0;
        int neg=1;
        for(int i:nums){
            if(i<0){
                res[neg]=i;
                neg+=2;
            }
            else{
                res[pos]=i;
                pos+=2;
            }
        }
        return res;
    }
}