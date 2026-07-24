class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<Integer>list = new ArrayList<>();
        List<String>result = new ArrayList<>();
        Stack<Integer>stack = new Stack<>();
        for(int i=0 ; i<target.length ; i++){
            list.add(target[i]);
        }
        for(int i=1 ; i<=n ; i++){
            if(list.contains(i)){
                result.add("Push");
                stack.push(i);
                if(stack.peek()==target[target.length-1])break;
            }
            else{
                result.add("Push");
                result.add("Pop");
            }
        }
        return result;
    }
}