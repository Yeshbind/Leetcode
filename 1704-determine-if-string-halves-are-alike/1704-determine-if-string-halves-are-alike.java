class Solution {
    public boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'; 
    } 

    public boolean halvesAreAlike(String s) {
        int n =  s.length();
        int first =0;
        int second =0;

        for(int i = 0 ; i <n/2 ; i++){

            if(isVowel(s.charAt(i))){
                first ++;
            }
        }

        for(int i = n/2 ; i <n ; i++){

            if(isVowel(s.charAt(i))){
                second ++;
            }
        }

        return first == second;
    }
}