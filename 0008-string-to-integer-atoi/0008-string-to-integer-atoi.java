class Solution {
    public int myAtoi(String s) {
        boolean found = false;
        boolean neg = false;
        long result = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ' && !found) {
                continue;
            }
            else if (c == '+' && !found) {
                found = true;
            }
            else if (c == '-' && !found) {
                neg = true;
                found = true;
            }
            else if (Character.isDigit(c)) {
                found = true;

                int digit = c - '0';

                if (!neg && result > (Integer.MAX_VALUE - digit) / 10) {
                    return Integer.MAX_VALUE;
                }

                if (neg && result > (2147483648L - digit) / 10) {
                    return Integer.MIN_VALUE;
                }

                result = result * 10 + digit;
            }
            else {
                break;
            }
        }

        if (neg) {
            return (int)(-1 * result);
        } else {
            return (int)result;
        }
    }
}