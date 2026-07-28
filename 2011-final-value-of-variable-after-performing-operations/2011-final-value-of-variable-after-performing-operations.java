class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int x = 0 ;

        for(String s : operations){
            if(s.contains("--X") || s.contains("X--")){
                x--;
            }
            else{
                x++;
            }
        }

        return x;
    }
}