// class Solution {
//     public boolean isValid(String s) {
//        Stack<Character> s1= new Stack<>();
//        for(int i=0 ; i<s.length(); i++){
//         char ch=s.charAt(i);
//         if(ch=='(' || ch=='{' || ch=='['){
//             s1.push(ch);
//         }
//         else if(ch==')' || ch=='}' || ch==']'){
//             if(s1.peek()=='(' && ch== ')' ||
//               s1.peek()=='{' && ch== '}' ||s1.peek()=='[' && ch== ']'  ){
//                 s1.pop();
//             }
//             else{
//                 return false;
//             }
//         }
//        }
//        if(s.isEmpty()){
//             return true;
//        }
//        else{
//         return false;
//        }       
//     }
// }

class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s1.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (s1.isEmpty()) return false; // prevent peek() on empty stack
                char top = s1.peek();
                if ((top == '(' && ch == ')') ||
                    (top == '{' && ch == '}') ||
                    (top == '[' && ch == ']')) {
                    s1.pop();
                } else {
                    return false;
                }
            }
        }
        return s1.isEmpty(); // stack should be empty if all matched
    }
}