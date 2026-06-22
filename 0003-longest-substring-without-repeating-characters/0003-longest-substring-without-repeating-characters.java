import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set= new HashSet<>();
        int i_1=0;
        int i_2=0;
        int l=s.length();
        int max_length=0;
        for(int i=0;i<l;i++){
            if(!set.contains(s.charAt(i))){
                i_2++;
                set.add(s.charAt(i));
            }
            else{
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(i_1));
                    i_1++;
                }
                i_2++;
                set.add(s.charAt(i));
            }
            max_length=Math.max((i_2-i_1),max_length);
        }
        return max_length;        
    }
}