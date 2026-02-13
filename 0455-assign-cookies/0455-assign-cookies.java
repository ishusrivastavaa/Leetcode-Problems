class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int i=0;
        int j = 0;
        
        while(j< s.length && i<g.length ){
            if(s[j]>= g[i]){
                i++;
            }
            j++;
        }
       
        return i++;
    }
}