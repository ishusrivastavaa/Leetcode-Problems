class Solution {
    public boolean validPalindrome(String s) {
        int count=0;
        int start=0;
        int end=s.length()-1;

        while(start<end){
            char ch=s.charAt(start);
            char ch1=s.charAt(end);
            if(ch==ch1){
                start++;
                end--;
            }
            else {
                return isPalindrome(start+1 , end , s) || isPalindrome(start , end-1 , s);
            
            }
        }
        return true;
        
        
    }
    public static boolean isPalindrome(int start , int end , String s){
        while(start<end){
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        start++;
        end--;
        }
        return true;

    }
    
}