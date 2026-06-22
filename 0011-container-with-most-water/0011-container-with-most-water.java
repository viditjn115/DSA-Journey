class Solution {
    public int maxArea(int[] height) {
        int l=height.length;
        int s=0;
        int e=l-1;
        int max_ar=0;
        while(s<e){
            int width=e-s;
            int h=Math.min(height[s],height[e]);
            int ar=h*width;
            max_ar=Math.max(ar,max_ar);
            if(height[s]>height[e])
            e--;
            else 
            s++;
        }
        return max_ar;
    }
}