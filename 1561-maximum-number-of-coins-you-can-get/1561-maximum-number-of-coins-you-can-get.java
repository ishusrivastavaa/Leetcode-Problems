class Solution {
    public int maxCoins(int[] piles) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(piles);
        for(int i=0 ; i<piles.length ; i++){
            list.add(piles[i]);
        }
        int sum=0;
        while(list.size()!=0){
            list.remove(list.size()-1);
            sum+=list.get(list.size()-1);
            list.remove(list.size()-1);
            list.remove(0);


        }
        return sum;
    }
}