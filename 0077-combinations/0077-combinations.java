class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtrack(n , k ,new ArrayList<>() ,1);
        return res;
    }
    public void backtrack(int n , int k , List<Integer> list ,int index){
        if(list.size()==k){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=index ;i<=n ;i++){
            list.add(i);
            backtrack(n , k , list , i+1);
            list.remove(list.size()-1);
        }
    }
}