class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(candidates , target , 0 ,0 , list);
        return res;
    }
    public void backtracking(int[] candidates , int target , int sum , int index ,List<Integer> list){
        if (sum>target){
            return;
        }
        if(sum== target){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=index ; i<candidates.length ; i++){
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if(candidates[i]>target){
                break;
            }
            list.add(candidates[i]);
            backtracking(candidates , target ,sum+candidates[i] ,i+1  , list);
            list.remove(list.size()-1);
        }
    }
}