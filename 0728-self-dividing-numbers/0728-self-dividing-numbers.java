class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> ans = new ArrayList<>();

        for(int i = left ; i<= right ; i++){

            int cur = i;

            while(cur > 0){
                int digit = cur % 10;

                if(digit == 0 || i % digit !=0){
                    break;
                }
                cur /=10;

            }

            if(cur == 0){
                ans.add(i);
            }
        }

        return ans;
    }
}