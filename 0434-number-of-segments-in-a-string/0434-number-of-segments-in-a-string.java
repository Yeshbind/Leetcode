class Solution {
    public int countSegments(String s) {
        int n = s.length();
        int count = 0;
        boolean flag = true;

        for(int i = 0 ; i<n ; i++){
            if(s.charAt(i) == ' ' || s.charAt(i) == '\n' ||  s.charAt(i) == '\t'){
                flag = true;

            }

            else {
                if(flag == true){
                    count++;
                    flag = false;

                }
            }
        }
        return count;
    }
}