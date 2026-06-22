class Solution {
    public int calPoints(String[] ops) {
        int result =0 ;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0 ; i<ops.length ; i++){
            if(ops[i].equals("C")){
                list.remove(list.size()-1);
            }
            else if(ops[i].equals("D")){
                int num = list.get(list.size()-1);
                num = num*2;
                list.add(num);
            }
            else if(ops[i].equals("+")){
                int num = list.get(list.size()-1);
                int num1 = list.get(list.size()-2);
                list.add(num+num1);
            }
            else{
                int num = Integer.parseInt(ops[i]);
                list.add(num);
            }
        }
        for(int i=0; i<list.size() ; i++){
            result+=list.get(i);
        }
        return result;

    }
}