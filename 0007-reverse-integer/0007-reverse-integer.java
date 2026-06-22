class Solution {
    public int reverse(int x) {
       long rev=0;
       while(x!=0){
        long rem=x%10;
        rev=rev*10+rem;
        x=x/10;
       }
       if(rev<=(Math.pow(2,31)-1) && rev >=(-1*Math.pow(2,31))){
        return (int)rev; 
       }
       else{
        return 0;
       }
    }
}