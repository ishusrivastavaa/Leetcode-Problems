class Solution {
    public boolean isStrictlyPalindromic(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 2 ; i<= n-2 ; i++){
            int num = n;
            while(num>0){
                int rem = num % i;
                list.add(rem);
                num = (num-rem)/i;
            }
            boolean isflag=isPalindrome(list);
            if(!isflag){
                return false;
            }
            list.clear();
        }
        return true;
    }
    public static boolean isPalindrome(List<Integer> list){
        int i;
        int j = list.size()-1;
        for(i=0 ; i<=j ; i++){
            if(list.get(i)!=list.get(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}