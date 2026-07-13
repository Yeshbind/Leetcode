class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        List<Integer> ans = new ArrayList<>();

        String Digits = "123456789";

        int lowlen  = String.valueOf(low).length();
        int highlen = String.valueOf(high).length();


        for(int i = lowlen ; i <= highlen ; i++){
            for(int j = 0; j+ i <=9 ; j++){

                int  num = Integer.parseInt(Digits.substring(j , j + i));

                if( num>= low && num<= high){
                    ans.add(num);
                }
            }
        }

        return ans;
    }
}