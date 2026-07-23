class Solution {
    public boolean judgeCircle(String moves) {

        HashMap<Character , Integer> map = new HashMap<>();

        for(int i = 0 ; i < moves.length() ; i++ ){

            map.put(moves.charAt(i),map.getOrDefault(moves.charAt(i),0)+1);
        }

        int up = map.getOrDefault('U', 0);
        int down = map.getOrDefault('D', 0);
        int left = map.getOrDefault('L', 0);
        int right = map.getOrDefault('R', 0);

        return (up == down) && (left == right);
        
    }
}