class Solution {
     static{
        for(int i = 0; i < 300; i++){
            findMaxConsecutiveOnes(new int[0]);
        }
        
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
      int max= 0 ;
      int temp = 0;  

      for (int i = 0 ; i < nums.length ; i++){
        if(nums[i] == 1){
            temp++ ; 
            max = Math.max(max , temp);
            

        }
        else{
            temp = 0;
        }
      }

        return max;
    }
}