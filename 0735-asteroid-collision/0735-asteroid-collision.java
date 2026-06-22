class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> dq = new ArrayDeque<>();
        for(int asteroid:asteroids){
            boolean destroyed = false;
            while (!dq.isEmpty()&& dq.peek() > 0&& asteroid < 0) {
                if (dq.peek() < -asteroid) {
                    dq.pop();
                }
                else if (dq.peek() == -asteroid) {
                    dq.pop();
                    destroyed = true;
                    break;
                }
                else {
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                dq.push(asteroid);
            }
        } 
        int [] res = new int[dq.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i]=dq.pop();
        }
        return res;
    }
}