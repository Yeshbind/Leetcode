class Solution {
    public String restoreString(String s, int[] indices) {
        
        char arr[] = new char[indices.length];

        for (int i = 0 ; i < indices.length ; i++){

            int a = indices[i];
            char c = s.charAt(i);

            arr[a] = c;

        }

        
        return new String(arr);
    }
}