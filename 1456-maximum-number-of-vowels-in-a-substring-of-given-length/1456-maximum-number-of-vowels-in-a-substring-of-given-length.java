class Solution {
    public int maxVowels(String s, int k) {
        int vw=0;
        int max_vw=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                vw++;
            }
        }
        max_vw=vw;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k))){
                vw--;
            }
            if(isVowel(s.charAt(i))){
                vw++;
            }
            max_vw=Math.max(max_vw,vw);
        }
        return max_vw;
    }
    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}