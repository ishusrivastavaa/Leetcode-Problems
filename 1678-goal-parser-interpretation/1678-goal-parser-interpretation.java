class Solution {
    public String interpret(String s) {
        Stack<Character>stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        if(s.length()==1) return s;
        for(int i=0 ; i<s.length()-1 ; i++){
            char ch = s.charAt(i);
            char ch1 = s.charAt(i+1);
            if(ch=='(' && ch1==')'){
                sb.append("o");
            }
            else{
                if(ch!='(' && ch!=')') sb.append(ch);
            }

        }
        char ch = s.charAt(s.length()-1);
        if(ch!='(' && ch!=')')sb.append(ch);
        return sb.toString();
    }
}