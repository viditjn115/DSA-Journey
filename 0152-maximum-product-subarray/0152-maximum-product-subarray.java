class Solution {
    public int maxProduct(int[] nums) {
        int maxEnding = nums[0];
        int minEnding = nums[0];
        int answer = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            int prevMax = maxEnding;
            int prevMin = minEnding;

            maxEnding = Math.max(curr,Math.max(curr * prevMax, curr * prevMin));

            minEnding = Math.min(curr,Math.min(curr * prevMax, curr * prevMin));

            answer = Math.max(answer, maxEnding);
        }
        return answer;
    }
}