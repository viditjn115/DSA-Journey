class Solution {
    List<List<String>> res =new ArrayList<>();
    public List<List<String>> partition(String s) {
        backtrack(s, new ArrayList<>() , 0);
        return res;
    }

    public void backtrack(String s , List<String> list , int index){
        if(index==s.length()){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=index ; i<s.length();i++){
            if(isPallindrome(s , index , i)){
                list.add(s.substring(index ,i+1));
                backtrack(s , list , i+1);
                list.remove(list.size()-1);
            }
        }
    }

    public boolean isPallindrome(String s , int start , int end){
        while(start<end){
            if (s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}