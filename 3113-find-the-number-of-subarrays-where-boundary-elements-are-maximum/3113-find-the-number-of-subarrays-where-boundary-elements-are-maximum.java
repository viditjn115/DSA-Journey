class Solution {
    static class Pair{
        int value;
        int count;

        Pair(int val , int count){
            this.value=val;
            this.count=count;
        }
    }
    public long numberOfSubarrays(int[] nums) {
        Deque<Pair> dq = new ArrayDeque<>(); 
        long c =0;
        for(int i =0;i<nums.length ;i++){
            while(!dq.isEmpty() && nums[i]>dq.peek().value){
                dq.pop();
            }
            if(!dq.isEmpty() && nums[i]==dq.peek().value){
                c+=dq.peek().count;
                dq.peek().count++;
            }
            else{
                dq.push(new Pair(nums[i],1));
            }
            c++;
        }
        return c;
    }
}