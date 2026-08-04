class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        Arrays.sort(nums);
         int min = nums[0];
         int max = nums[nums.length-1];
        Set<Integer> n = new HashSet<>();
        Set<Integer> n2 = new HashSet<>();

        for(int i : nums){
            n.add(i);
        } 

        List<Integer> ans = new ArrayList<>();
        

        for(int i = min ; i< max ; i++){
            n2.add(i);
           
        }

        for(int i : n2){
            if(!n.contains(i)){
                ans.add(i);
            }
        }
         ans.sort(Comparator.naturalOrder());
        
        return ans;
    }
}