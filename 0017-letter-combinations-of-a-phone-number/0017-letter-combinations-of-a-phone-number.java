class Solution {
    List<String> letter_comb=new ArrayList<>();

    Map<Character,String> map = new HashMap<>();{
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
    }

    public List<String> letterCombinations(String digits) {
        backtrack(0 , digits , new StringBuilder());
        return letter_comb;
    }
    public void backtrack(int ind , String digits , StringBuilder sb ){
        if(sb.length() == digits.length()){
            letter_comb.add(sb.toString());
            return;
        }
        for(char ch:map.get(digits.charAt(ind)).toCharArray()){
            sb.append(ch);
            backtrack(ind+1 , digits, sb);
            sb.deleteCharAt(sb.length()-1); 
        }
    }
}