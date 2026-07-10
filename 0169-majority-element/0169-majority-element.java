class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;

        int count = 0 ; 
        int ce = 0 ; 

        for ( int num : nums){
            if(count == 0){
                ce = num;
            }

            if(num == ce){
                count++;
            }
            else{
                count--;
            }
        }

        return ce;
    }
}