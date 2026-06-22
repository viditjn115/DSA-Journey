import java.util.*;
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> letter_comb=new ArrayList<>();
        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz"); 
        
        if(digits.length()!=0){
            letter_comb.add("");
            for(int i=0;i<digits.length();i++){
                String letters=map.get(digits.charAt(i));
                List<String> temp=new ArrayList<>();
                for (int j = 0; j < letter_comb.size(); j++) {
                    String existing = letter_comb.get(j);
                    for (int k = 0; k < letters.length(); k++) {
                        char letter = letters.charAt(k);
                        temp.add(existing + letter);
                    }
                }
                letter_comb=temp;
            }
        }
        return letter_comb;
    }
}