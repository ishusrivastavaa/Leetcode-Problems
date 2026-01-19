class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        String str=s.toUpperCase();
        for(int i=0 ; i<s.length() ; i++){
            char ch = str.charAt(i);
            sum=sum+((i+1)*(91-(int)ch));
            
        }
        return sum;
    }
}