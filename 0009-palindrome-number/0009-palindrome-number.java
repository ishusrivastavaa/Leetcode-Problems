class Solution {
    public boolean isPalindrome(int x) {
        int target=x;
        int reversedNumber=0;
        while (x>0) 
        {
            int  digit = x % 10; 
            x /= 10;
            reversedNumber = reversedNumber * 10 + digit; 
             
        }
        return reversedNumber==target;
    }
}
