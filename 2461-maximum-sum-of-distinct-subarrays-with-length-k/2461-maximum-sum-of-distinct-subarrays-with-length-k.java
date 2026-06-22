import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        long maxSum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        if (map.size() == k) {
            maxSum = sum;
        }

        for (int i = k; i < n; i++) {
            int remove = nums[i - k];

            sum -= remove;
            map.put(remove, map.get(remove) - 1);

            if (map.get(remove) == 0) {
                map.remove(remove);
            }

            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (map.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}