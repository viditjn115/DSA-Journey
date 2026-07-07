class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int [] freq = new int[26];
        if(s.length()<p.length()){
            return res;
        }
        for(int i=0;i<p.length();i++){
            char ch = p.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<p.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']--;
        }
        if(chq(freq)){
            res.add(0);
        }
        for(int i=p.length();i<s.length();i++){
            char ch= s.charAt(i);
            freq[ch-'a']--;
            freq[s.charAt(i-p.length())-'a']++;
            if(chq(freq)){
                res.add(i-p.length()+1);
            }
        }
        return res;
    }
    public boolean chq(int[] freq){
        for(int f:freq){
            if(f!=0){
                return false;
            }
        }
        return true;
    }
}