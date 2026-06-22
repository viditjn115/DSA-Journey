class Solution {
    public String reverseWords(String s) {
        s = s.trim();

        char[] arr = s.toCharArray();

        reverse(arr, 0, arr.length - 1);

        int n = arr.length;
        int start = 0;
        int idx = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != ' ') {
                if (idx != 0) {
                    arr[idx++] = ' ';
                }

                start = idx;

                while (i < n && arr[i] != ' ') {
                    arr[idx++] = arr[i++];
                }

                reverse(arr, start, idx - 1);
            }
        }

        return new String(arr, 0, idx);
    }

    public void reverse(char[] arr, int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}