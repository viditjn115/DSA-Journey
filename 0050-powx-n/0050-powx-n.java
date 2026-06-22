class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        else if(n>0) {
            if((n-1)%2==0){
            return x*myPow(x*x,(n-1)/2);}
            else{
                return (x*x)*myPow(x*x,(n-2)/2);
            }
        }
        else{
            if((n+1)%2==0){
            return myPow(x*x,((n+1)/2))/x;
            }
            else{
                return myPow(x*x,((n+2)/2))/(x*x);
            }
        }
    }
}