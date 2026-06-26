class Solution {
    List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrack(nums , new ArrayList<>() ,used);
        return res;
    }
    public void backtrack(int [] nums , List<Integer> list , boolean[] used ){
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
        }
        for(int i=0 ; i<nums.length ; i++){
            if(used [i]==true){
                continue;
            }if(i>0 && nums[i-1]==nums[i] && used[i]==false && used[i-1]==false){
                continue;
            }
            list.add(nums[i]);
            used[i]=true;
            backtrack(nums , list ,used );
            list.remove(list.size() -1);
            used[i]=false;

        }
    }
}