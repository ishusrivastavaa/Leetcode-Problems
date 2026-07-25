import java.util.*;
class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int num=n;
        while(num>0){
            int rem = num%10;
            list.add(rem);
            num=(num-rem)/10;
        }
        Collections.sort(list);
        int m1= list.get(list.size()-1);
        int m2=list.get(list.size()-2);
        return m1*m2;
        
    }
}