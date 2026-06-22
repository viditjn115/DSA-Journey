class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String res="11";
        int i=2;
        while(i<n){
            StringBuilder temp = new StringBuilder();
            int j=1;
            int c=1;
            while(j<res.length()){
                if(res.charAt(j)==res.charAt(j-1)){
                    c++;
                }
                else{
                    temp.append(c);
                    temp.append(res.charAt(j-1));
                    c=1;
                }
                j++;
            }
            temp.append(c);
            temp.append(res.charAt(j-1));
            res = temp.toString();
            i++;
        }
        return res;
    }
}