class Solution {
    public int calPoints(String[] ops) {
        int result=0;
        Stack<Integer>stack = new Stack<>();
        for(int i=0 ; i<ops.length ; i++){
            if(ops[i].equals("C")){
                stack.pop();
            }
            else if(ops[i].equals("D")){
                int num = stack.peek();
                stack.push(num*2);
            }
            else if(ops[i].equals("+")){
                int num = stack.pop();
                int num1 = stack.peek();
                stack.push(num);
                stack.push(num+num1);
            }
            else{
                int num= Integer.parseInt(ops[i]);
                stack.push(num);
            }

        }
        while(!stack.isEmpty()){
            result+=stack.pop();
        }
        return result;
    }
}