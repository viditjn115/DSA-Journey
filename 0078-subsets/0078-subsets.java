class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        findSubsets(nums , 0 , new ArrayList<>());
        return res;
    }
    public void findSubsets(int [] nums , int index , List<Integer> list){
        if(index==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        findSubsets(nums,index+1 , list);
        list.remove(list.size()-1);
        findSubsets(nums,index+1,list);
    }
}