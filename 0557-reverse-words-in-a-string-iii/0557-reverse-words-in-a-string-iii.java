class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();

        int start = 0;

        while (start < arr.length) {

            int end = start;

            while (end < arr.length && arr[end] != ' ') {
                end++;
            }
            reverse(arr, start, end - 1);
            start = end + 1;
        }

        return new String(arr);
    }

    private void reverse(char[] arr, int left, int right) {

        while (left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}