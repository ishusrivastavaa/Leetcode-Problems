class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list = new ArrayList<>();
        int start=0 , end=0;
        int maxcount=0;
        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                maxcount=Math.max(list.size(),maxcount);
            }
            else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
           
        }
        return maxcount;

    }
}