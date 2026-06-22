class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int s=1;
        int e=x;
            while(e-s!=1){
                long mid=s+(e-s)/2;
                if(mid*mid==x){
                    return (int)mid;
                }
                else if(mid*mid>x){
                    e=(int)mid;
                }
                else{
                    s=(int)mid;
                }       
            }
            return s;
        }
    }
