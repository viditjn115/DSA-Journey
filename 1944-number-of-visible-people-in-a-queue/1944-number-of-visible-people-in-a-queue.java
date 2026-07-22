class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n=heights.length;
        int[] res = new int[n];
        res[n-1]=0;
        for(int i=n-1;i>=0;i--){
            while(!dq.isEmpty()){
                if(heights[i]>heights[dq.peek()]){    
                int ele = dq.pop();
                res[i]++;
                }
                else{
                    res[i]++;
                    break;
                }
            }
            dq.push(i);
        }
        return res;
    }
}