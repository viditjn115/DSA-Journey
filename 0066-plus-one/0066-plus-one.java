class Solution {
    public int[] plusOne(int[] digits) {
        int l = digits.length;
        if(digits[(l-1)]!=9){
            digits[l-1]++;
            return digits;
        }
        else{
            int ind=-1;
            for(int i=(l-1);i>=0;i--){
                if(digits[i]!=9){
                    ind=i;
                    break;
                }
            }
            if(ind==-1){
            int[] res=new int[l+1];
            res[0]=1;
            return res;}
            else{
                digits[ind]++;
                for(int i = ind+1; i < l; i++){
                digits[i] = 0;
        }return digits;
            }
        }
    }
}