class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combination(candidates , target , 0 , new ArrayList<>() , 0);
        return res;
    }
    public void combination(int [] candidates , int target , int start ,List<Integer> list ,int sum ){
        if(sum==target){
            res.add(new ArrayList<>(list));
            return;
        }
        else if (sum > target) {
            return;
        }
        for(int i=start ;i<candidates.length ;i++){
            list.add(candidates[i]);
            combination(candidates , target , i , list , sum+candidates[i] );
            list.remove(list.size()-1);
        }
    }
}