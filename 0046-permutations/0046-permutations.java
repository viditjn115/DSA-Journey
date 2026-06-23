class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        permutations(nums,new ArrayList<>());
        return res;
    }
    public void permutations(int [] nums , List<Integer> list){
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int num:nums){
            if(list.contains(num)){
                continue;
            }
            list.add(num);
            permutations(nums,list);
            list.remove(list.size()-1);
        }
    }
}