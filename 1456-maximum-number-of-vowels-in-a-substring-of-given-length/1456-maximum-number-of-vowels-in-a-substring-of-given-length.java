class Solution {
    public int maxVowels(String s, int k) {
        int vw=0;
        int max_vw=0;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                vw++;
            }
        }
        max_vw=vw;
        for(int i=k;i<s.length();i++){
            if(s.charAt(i-k)=='a' || s.charAt(i-k)=='e' || s.charAt(i-k)=='i' || s.charAt(i-k)=='o' || s.charAt(i-k)=='u'){
                vw--;
            }
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                vw++;
            }
            max_vw=Math.max(max_vw,vw);
        }
        return max_vw;
    }
}