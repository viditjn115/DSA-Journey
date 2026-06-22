class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n!=1){
            int s=sqOfDigits(n);
            if(set.contains(s)){
                return false;
            }
            set.add(s);
            n=s;
        }
        return true;
    }
    public int sqOfDigits(int n){
        int sq=0;
        while(n!=0){
            int rem=n%10;
            sq+= rem*rem;
            n=n/10;
        }
        return sq;
    }
}