class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int []res=new int[2];
        int s=0;
        int l=numbers.length;
        int e=l-1;
        while(s<e){
            if((numbers[s]+numbers[e])>target){
                e--;
            }
            else if((numbers[s]+numbers[e])<target){
                s++;
            }
            else{
                res[0]=s+1;
                res[1]=e+1;
                return res;
            }
    }
    return res;
}
}