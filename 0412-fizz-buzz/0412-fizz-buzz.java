class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> liststr = new ArrayList<>();
        // liststr.add("1");
        // liststr.add("2");
        for(int i=1 ; i<=n ; i++){
            if(i%3 == 0 && i%5==0){
                liststr.add("FizzBuzz");
            }
            else if(i%3 == 0){
                liststr.add("Fizz");
            }
            else if (i%5 == 0){
                liststr.add("Buzz");
            }
            else{
                
                liststr.add(Integer.toString(i));
            }
        }
        return liststr;
    } 
}