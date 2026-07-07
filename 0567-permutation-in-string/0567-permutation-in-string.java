class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] freq = new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s1.length();i++){
            freq[s2.charAt(i)-'a']--;
        }

        for(int j=0;j<26;j++){
            if(freq[j]!=0){
                break;
            }
            else{
                if(j==25)
                return true;
            }
        }

        for(int i=s1.length();i<s2.length();i++){
            freq[s2.charAt(i)-'a']--;
            freq[s2.charAt(i-s1.length())-'a']++;

            for(int j=0;j<26;j++){
                if(freq[j]!=0){
                    break;
                }
                else{
                    if(j==25)
                    return true;
                }
            }
        }
        return false;
    }
}