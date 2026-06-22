class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> major = new ArrayList<>();
        int c1 = 0, c2 = 0, e1 = 0, e2 = 0;
        
        for(int num : nums) {
            if(num == e1){
                 c1++;
            }
            else if(num == e2){
                 c2++;
            }
            else if(c1 == 0) { 
                e1 = num; c1 = 1; 
            }
            else if(c2 == 0) { 
                e2 = num; c2 = 1; 
            }
            else { 
                c1--; c2--; 
            }
        }
        
        c1 = c2 = 0;
        for(int num : nums) {
            if(num == e1) c1++;
            else if(num == e2) c2++;
        }
        
        int t = nums.length / 3;
        if(c1 > t) {
            major.add(e1);
        }
        if(c2 > t) {
            major.add(e2);
        }
        return major;
    }
}