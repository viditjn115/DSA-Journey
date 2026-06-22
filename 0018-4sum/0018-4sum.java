class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       Set<List<Integer>> quadruplets = new HashSet<>();
       Arrays.sort(nums);
       for(int i=0 ; i<nums.length -3 ; i++){
            for(int j=i+1 ; j<nums.length -2 ; j++){
                long ni=nums[i];
                long nj = nums[j];
                long new_target = target - (ni+nj);
                int start= j+1;
                int end = nums.length-1;
                while(start<end){
                    long n_start=nums[start];
                    long n_end = nums[end];
                    long s= n_start +n_end;
                    if(s < new_target){
                        start++;
                    }
                    else if( s   > new_target){
                        end--;
                    }
                    else{
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[start]);
                        list.add(nums[end]);
                        quadruplets.add(list);
                        start++;
                        end--;
                    }
                } 
                
            }
        }
        return new ArrayList(quadruplets); 
    }
}