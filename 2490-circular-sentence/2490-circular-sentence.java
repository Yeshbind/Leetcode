class Solution {
    public boolean isCircularSentence(String sentence) {

        int n = sentence.length()-1;
        if(sentence.charAt(0) != sentence.charAt(n) ) {
            return false;
        }


        String[] arr = sentence.split(" ");
        int m = arr.length -1;

        for(int i = 0 ; i<m ; i++ ){

            char c1 = arr[i].charAt(arr[i].length() -1);
            char c2 = arr[i+1].charAt(0);

            if(c1 != c2){
                return false;
            }

        }
        return true;
    }
}