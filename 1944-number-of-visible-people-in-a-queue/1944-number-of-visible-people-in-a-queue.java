class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n=heights.length;
        int[] res = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!dq.isEmpty()){
                if(heights[i]>heights[dq.peek()]){    
                dq.pop();
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