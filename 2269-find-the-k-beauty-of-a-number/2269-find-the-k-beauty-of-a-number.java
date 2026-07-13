class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = Integer.toString(num);
        int count=0;
        for(int left=0 ; left<=s.length()-k ; left++){
            String sub = s.substring(left , left+k);
            int num1 = Integer.parseInt(sub);
            if(num1!=0 && num%num1==0){
                count++;
            }
            
        }
        return count;
    }
}