class Solution {
    public int maxDepth(String s) {
        Stack <Character> stack = new Stack <>();
        int count=0;
        int max=0;
        for(int i=0 ; i<s.length() ; i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push('(');
                count++;
                max=Math.max(count , max);
            }
            else if (ch==')'){
                stack.pop();
                count--;
            }
        }
        return max;
    }
}