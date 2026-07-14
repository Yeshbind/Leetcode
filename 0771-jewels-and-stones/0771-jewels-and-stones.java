class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        boolean[] isjewl = new boolean[128];

        for ( char c : jewels.toCharArray()){
            isjewl[c] = true;
        }

        int count= 0;

        for (char c : stones.toCharArray()){
            if(isjewl[c]){
                count++;
            }
        }

        return count;
    }
}