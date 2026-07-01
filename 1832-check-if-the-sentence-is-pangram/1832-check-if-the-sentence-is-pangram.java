class Solution {
    public boolean checkIfPangram(String sentence) {
        
       char[] al = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for( int i = 0 ; i< al.length ; i++ ){
            if(!sentence.contains(al[i]+"")){
                return false;
            }
        }
        return true;
    }
}