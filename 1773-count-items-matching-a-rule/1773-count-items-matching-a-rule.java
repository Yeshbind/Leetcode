class Solution {
    public int countMatches(List<List<String>> items, String rulekey, String ruleValue) {
       
       int rk = 0;

       if(rulekey.equals("color")){
        rk =1;
       }
       else if(rulekey.equals("name")){
        rk =2;
       }

        int count = 0;

        for( List<String> i : items){

            if(i.get(rk).equals(ruleValue)){
                count++;
            }
        }

        
       

        return count;
    }
}