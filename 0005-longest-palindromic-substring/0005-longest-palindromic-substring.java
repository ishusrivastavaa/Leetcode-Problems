class Solution {
    public String longestPalindrome(String s) {
       String mainsub="";
       if(s.length()==1){
        return s;
       }
       int max=Integer.MIN_VALUE;
        
        for(int i=0 ; i<s.length() ; i++){
            for(int j=i ; j<s.length() ; j++){
                String sub=s.substring(i,j+1);
               
                if(isPalindrome(sub)){
                    if(sub.length()>max){
                        max=sub.length();
                        mainsub=sub;
                    }
                }
            }
        }

        return mainsub;
    }

        public  boolean isPalindrome(String s1){
            int st=0;
            int end=s1.length()-1;

            while(st<end){
                if(s1.charAt(st)!=s1.charAt(end)){
                    return false;
                }
                st++;
                end--;

            }
            return true;
        }
    
}

// class Solution {
//     public String longestPalindrome(String s) {
//         int max=Integer.MIN_VALUE;
//         String ans="";
//         for(int i=0;i<s.length();i++){
//             for(int k=i;k<s.length();k++){
//             String c=s.substring(i,k+1);
//            if(palindrome(c)){
//            {
//                 if(c.length()>max){
//                     max=c.length();
//                     ans=c;
//                 }
//             }
//            }
//         }
//         }
//         return ans;
//     }
//     public boolean palindrome(String c){
//         int left=0;
//         int right=c.length()-1;
//         while(left<right){
//         if(c.charAt(left)!=c.charAt(right)){
//            return false;
//         }
//         left++;
//         right--;
//         }
//         return true;
//     }

// }
