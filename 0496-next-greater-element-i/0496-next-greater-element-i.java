class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer ,Integer> map= new HashMap<>();
        Stack<Integer> s= new Stack<>();
        s.push(nums2[0]);
        int[] res = new int[nums1.length];
        for(int i=1;i<nums2.length;i++){
            while (!s.isEmpty() && nums2[i]>s.peek()) {
                map.put(s.pop(), nums2[i]);
            }
            s.push(nums2[i]);
        }
        while(!s.isEmpty()) {
            map.put(s.pop(), -1);
        }
        for(int i=0;i<nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }
        return res;
    }
}