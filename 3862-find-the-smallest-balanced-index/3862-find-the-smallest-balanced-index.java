class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int l = nums.length;
        double[] p_p = new double[l];
        double[] p_s = new double[l]; 
        p_p[l-1] = 1;
        for(int i = l-2; i >= 0; i--){
            p_p[i] = (double)nums[i+1] * p_p[i+1];
        }
        p_s[0] = 0;
        for(int i = 1; i < l; i++){
            p_s[i] = p_s[i-1] + nums[i-1];
        }
        for(int i = 0; i < l; i++){
            if(p_s[i] == p_p[i]){
                return i;
            }
        }
        return -1;
    }
}