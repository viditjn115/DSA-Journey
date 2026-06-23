import java.util.*;

class Solution {
    int maxLength(int[] arr) {
        Map<Long, Integer> firstOccurrence = new HashMap<>();
        firstOccurrence.put(0L, -1);

        long prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (firstOccurrence.containsKey(prefixSum)) {
                maxLen = Math.max(maxLen, i - firstOccurrence.get(prefixSum));
            } else {
                firstOccurrence.put(prefixSum, i);
            }
        }

        return maxLen;
    }
}