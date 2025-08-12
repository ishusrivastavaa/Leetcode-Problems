class Solution {
    public String frequencySort(String s) {
       
        StringBuilder sb= new StringBuilder();
        HashMap <Character , Integer> map =new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int i=0 ; i<s.length() ; i++)
        {
            char ch=s.charAt(i);
            if(map.containsKey(ch))
            {
                
                map.put(ch ,map.get(ch)+1 );
            }
            else{
                map.put(ch,1);
            }
           
        }
        
       for(Map.Entry<Character,Integer> e: map.entrySet()){
        max=Math.max(max,e.getValue());
      }
        while (max != 0) {
            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                if (e.getValue() == max) {
                    for (int i = 0; i < max; i++) {
                        sb.append(e.getKey());
                    }
                }
            }
            max--;
            
        }
        return sb.toString();

    }
}