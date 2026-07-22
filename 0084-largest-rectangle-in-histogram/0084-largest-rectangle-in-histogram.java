class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea=0;
        int n = heights.length;
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i =0;i<=n;i++){
            while(!dq.isEmpty()&& (i==n || heights[i]<heights[dq.peek()])){
                int ele =dq.pop();
                int nextSmaller=i;
                int prevSmaller = dq.isEmpty()? -1 : dq.peek();
                int width=nextSmaller-prevSmaller-1;
                int Area = heights[ele]*width;
                maxArea=Math.max(maxArea,Area);
            }
            dq.push(i);
        }
        return maxArea;
    }
}