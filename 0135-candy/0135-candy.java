class Solution {
    public int candy(int[] ratings) {
        int[] temp = new int[ratings.length];
        temp[0]=1;
        for(int i =1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                temp[i]=temp[i-1]+1;
            }
            else{
                temp[i]++;
            }
        }
        int[] res = new int [ratings.length];
        res[ratings.length-1]++;
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                res[i]=res[i+1]+1;
            }
            else{
                res[i]++;
            }
        }
        int sum=0;
        for(int i =0;i<ratings.length;i++){
            sum+=Math.max(res[i],temp[i]);
        }
        return sum;
    }
}