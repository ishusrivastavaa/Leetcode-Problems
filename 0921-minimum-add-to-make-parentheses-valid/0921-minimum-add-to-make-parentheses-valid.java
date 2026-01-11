class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count=0;
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            
            if(ch == '('){
                stack.push('(');
            }
            if(ch == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
                else{
                    stack.push(')');
                }
                
            }
        }
        while(!stack.isEmpty()){
            
            count++;
            stack.pop();
            
        }
        return count;
    }
}