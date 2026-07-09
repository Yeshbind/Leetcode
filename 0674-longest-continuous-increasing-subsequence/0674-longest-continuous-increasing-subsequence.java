class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==1) {
            return 1 ;
        }


        int max =1 ;
        int temp = 1;

        for(int i =1 ; i < nums.length ; i++){

            if(nums[i] > nums[i-1] ){
                temp++;
            }
            else{
                temp = 1;
            }

            max = Math.max(max , temp );
        }


        return  max;
    }
}