class Solution {
    public boolean isValid(String s) {

        
        Stack<Character> ans = new Stack<>();

        for(int i = 0 ; i< s.length() ; i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c== '['){
                ans.push(c);
            }
           else{
            if (ans.isEmpty()) { return false;}
            if(c == ')' && ans.peek() != '('){
                return false;
            }
             if(c == ']' && ans.peek() != '['){
                return false;
            }
             if(c == '}' && ans.peek() != '{'){
                return false;
            }
            ans.pop();
        
           }
        }

          return ans.isEmpty();
    }
}