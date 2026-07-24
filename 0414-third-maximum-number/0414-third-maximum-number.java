class Solution {
    public int thirdMax(int[] nums) {

        Integer f = null;
        Integer s = null;
        Integer t = null;

        for (int num : nums) {

            if ((f != null && num == f) ||
                (s != null && num == s) ||
                (t != null && num == t))
                continue;

            if (f == null || num > f) {
                t = s;
                s = f;
                f = num;
            } else if (s == null || num > s) {
                t = s;
                s = num;
            } else if (t == null || num > t) {
                t = num;
            }
        }

        if (t == null)
            return f;

        return t;
    }
}