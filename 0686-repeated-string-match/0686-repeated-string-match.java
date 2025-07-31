class Solution {
    public int repeatedStringMatch(String a, String b) {
        String result=a;
        int count=1;
        while(result.length()<b.length()){
            result+=a;
            count++;
        }

        if(result.contains(b)){
            return count;

        }
        else if((result+a).contains(b)){
            count++;
            return count;
        }
        return -1;
        
    }
}