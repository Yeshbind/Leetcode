class Solution {
    public long sumAndMultiply(int n) {

        String s = String.valueOf(n);

        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for (char ch : s.toCharArray()) {

            int digit = ch - '0';
            sum += digit;

            if (digit != 0) {
                sb.append(ch);
            }
        }

        long num = (sb.length() == 0) ? 0 : Long.parseLong(sb.toString());

        return num * sum;
    }
}