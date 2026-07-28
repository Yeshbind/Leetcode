class Solution {
    public int distributeCandies(int[] candyType) {

        Set<Integer> s = new HashSet<>();

        for(int i : candyType){
            s.add(i);
        }
        int ans =0;

        if(s.size()<=(candyType.length/2)){
            ans = s.size();
        }
        else{
            ans= candyType.length/2;
        }
        
        return ans;
    }
}