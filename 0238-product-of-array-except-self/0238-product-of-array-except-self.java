    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int l=nums.length;
            int[] answer = new int[l];
            int[] p_p = new int[l];
            for (int i=0;i<l;i++){
                p_p[i]=1;
            }
            int[] s_p = new int[l];
            for (int i=0;i<l;i++){
                s_p[i]=1;
            }
            for(int i=1;i<l;i++){
                int p=1;
                p=p*nums[i-1]*p_p[i-1];
                p_p[i]=p;
            }
            for(int i=l-2;i>=0;i--){
                int p=1;
                p=p*nums[i+1]*s_p[i+1];
                s_p[i]=p;
            }
            for(int i=0;i<l;i++){
                answer[i]=p_p[i]*s_p[i];
            }
            return answer;
        }
    }