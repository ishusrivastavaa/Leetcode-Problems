class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
       
        int total =0;
        int count=0;
        int totalreward1=0;
        for(int i=0 ; i<reward2.length ; i++){
            total+=reward2[i];
            totalreward1+=reward1[i];
           
        }
        if(k==reward2.length){
            return totalreward1;
        }
        int diff[] = new int[reward1.length];
        for(int i=0 ; i<reward1.length ; i++){
            int n= reward2[i] - reward1[i];
            diff[i]=n;
        }
        Arrays.sort(diff);
        for(int i=0; i<reward1.length ; i++){
            if(count==k){
                return total;
            }
            diff[i] = -diff[i];
            total+=diff[i];
            count++;
        }
        
        return total;
    }
}