class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");
        HashMap<Character , String> map = new HashMap<>();
         HashMap<String , Character> map1 = new HashMap<>();
         if(pattern.length()!=words.length){
            return false;
         }
        for(int i=0 ; i<pattern.length() ; i++){
            char key=pattern.charAt(i);
            String value = words[i];
            String key1 = words[i];
            char value1 = pattern.charAt(i);


            if(map.containsKey(key)){
                if(!map.get(key).equals(value)){
                    return false;
                }
            }
            else{
                map.put(key , value);
                
            }
             if(map1.containsKey(value)){
                if(map1.get(value) != key){
                    return false;
                }
            } 
            else {
                map1.put(value, key);
            }
        }
        return true;
    }
}