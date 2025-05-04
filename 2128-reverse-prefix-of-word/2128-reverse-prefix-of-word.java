class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack= new Stack<>();
        boolean found=false;
        String str1="";
        int count=0;
        for(int i=0  ; i<word.length() ; i++){
            if(word.charAt(i)==ch){
                stack.push(word.charAt(i));
                found=true;
                count++;
                break;
            }
            else{
                
                stack.push(word.charAt(i));
                count++;
             }
        }
        if(!found){
            return word;
            
        }
        while(!stack.isEmpty())
        {
            str1+=stack.pop();
        }
        for(int i=count ; i<word.length() ; i++){
            str1+=word.charAt(i);
        }
            
        return str1;
        
    }
}