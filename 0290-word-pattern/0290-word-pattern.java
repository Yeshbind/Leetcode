class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] p = pattern.toCharArray();
        String[] sa = s.split(" "); 

         if (p.length != sa.length) {
            return false;
        }
        
        HashMap<Character , String> map = new HashMap<>(); 
        
        for(int i = 0 ; i< p.length ; i++){
            char c = p[i];
            String word = sa[i];
                if(map.containsKey(c)){

                    if(!map.get(c).equals(word)){
                        return false;
                    }
                }

                else {

                    if(map.containsValue(word)){
                        return false;
                    }

                    map.put(c,word);
                }
            
                 }
                  return true;

        }

       
    }
