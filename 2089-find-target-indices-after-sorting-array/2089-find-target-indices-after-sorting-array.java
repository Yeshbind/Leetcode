class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        int n =  nums.length;
        List <Integer> l = new ArrayList<>();

        for(int i = 0; i<n ;i++){

            int j = i;
            while(j>0 && nums[j]<nums[j-1]){
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;

                j--;

            }

        }

        for(int i = 0 ; i < n ; i++){
            if(nums[i]==target){
                l.add(i) ;
            }

        }
        return l  ;
     
    }
}