class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l = 0;
        int r = 0;
        int u = 0;

        for(char ch : moves.toCharArray()){
            if(ch == 'L') l++;
            else if(ch ==  'R') r++;
            else u++;
        }

        int m1 = (l+u -r);
        int m2 = (r+u -l);

        return Math.max(m1,m2);
    }
}