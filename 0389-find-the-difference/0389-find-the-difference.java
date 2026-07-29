class Solution {
    public char findTheDifference(String s, String t) {

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();

        for(Character word : s1){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(Character word : s2){
            map.put(word,map.getOrDefault(word,0)-1);
        }
        

        for(Character key : map.keySet()){

            if(map.get(key)==-1){
               return key;
            }
        }

        return ' ';

    }
}