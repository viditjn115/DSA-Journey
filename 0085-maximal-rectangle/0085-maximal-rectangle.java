class Solution {
    public int maximalRectangle(char[][] matrix) {
        int [] hist = new int[matrix[0].length];
        int maxRect=0;
        for(int row =0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                if(matrix[row][col]=='0'){
                    hist[col]=0;
                }
                else{
                    hist[col]+=(int)(matrix[row][col]-'0');
                }
            }
            maxRect=Math.max(maxRect , maxRectInHistogram(hist));
        }
        return maxRect;
    }
    private int maxRectInHistogram(int[] histogram){
        int maxArea=0;
        int n = histogram.length;
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i =0;i<=n;i++){
            while(!dq.isEmpty()&& (i==n || histogram[i]<histogram[dq.peek()])){
                int ele =dq.pop();
                int nextSmaller=i;
                int prevSmaller = dq.isEmpty()? -1 : dq.peek();
                int width=nextSmaller-prevSmaller-1;
                int Area = histogram[ele]*width;
                maxArea=Math.max(maxArea,Area);
            }
            dq.push(i);
        }
        return maxArea;
    }
}