class Solution {
    public boolean validMountainArray(int[] arr) {

        if(arr.length <3){
            return false;
        }


        int low = 0;
        int high = arr.length -1;


        while(low< high){

            int mid = low + (high-low) /2;

            if(arr[mid] < arr[mid +1]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }

        int peak  = low;


        if(peak == 0 || peak == arr.length-1){
            return false;
        }


        for(int i = 0 ; i < peak ; i++){

            if(arr[i] >=arr[i+1]){
                return false;
            }
        }

         for(int i = peak ; i < arr.length -1 ; i++){

            if(arr[i] <=arr[i+1]){
                return false;
            }
        }


        return true;
        
    }
}