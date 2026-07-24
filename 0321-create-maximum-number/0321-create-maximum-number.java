class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] res = new int[k];
        int s = Math.max(0,k-nums2.length);
        int e=Math.min(k,nums1.length);
        for (int i=s; i<=e; i++) {
            int[] a =maxSubsequence(nums1,i);
            int[] b =maxSubsequence(nums2,k-i);
            int[]candidate=merge(a, b);
            if (greater(candidate, 0, res, 0)) {
                res = candidate;
            }
        }
        return res;
    }
    public int [] maxSubsequence(int [] nums ,int k ){
        Deque<Integer> dq = new ArrayDeque<>();
        int drop=nums.length-k;
        for(int i =0;i<nums.length;i++){
            while(!dq.isEmpty() && (nums[i]>dq.peek() && drop>0)){
                dq.pop();
                drop--;
            }
            if(dq.size()<k){
                dq.push(nums[i]);
            }
            else{
                if(drop>0)
                drop--;
            }
        }
        int [] res = new int [k];
        int i =k-1;
        while(!dq.isEmpty()){
            res[i]=dq.pop();
            i--;
        }
        return res;
    }
    private int[] merge(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int idx = 0;
        while (i < a.length || j < b.length) {
            if (greater(a, i, b, j)) {
                res[idx++] = a[i++];
            } else {
                res[idx++] = b[j++];
            }
        }
        return res;
    }

    private boolean greater(int[] a, int i, int[] b, int j) {
        while (i < a.length && j < b.length && a[i] == b[j]) {
            i++;
            j++;
        }
        if (j == b.length)
            return true;
        if (i == a.length)
            return false;
        return a[i] > b[j];
    }
}