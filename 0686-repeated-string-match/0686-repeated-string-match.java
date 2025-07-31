class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb= new StringBuilder(a);
        int count=1;
        while(sb.length()<b.length()){
            sb.append(a);
            count++;
        }
        if(sb.toString().contains(b)){
            return count;
        }
        if(sb.append(a).toString().contains(b)){
            return count+1;
        }
        return -1;
    }
}