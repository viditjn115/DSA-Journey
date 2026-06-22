class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] res = new int[temperatures.length];
        Deque<Integer> s=new ArrayDeque<>();
        s.push(0);
        for(int i=1;i<temperatures.length;i++){
            int curr_temp=temperatures[i];
            while (!s.isEmpty() && curr_temp > temperatures[s.peek()]) {
                int poppedIndex = s.pop();
                res[poppedIndex] = i - poppedIndex;
            }
            s.push(i);
        }
        return res; 
    }
}