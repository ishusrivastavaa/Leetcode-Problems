class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // for(int i=0 ; i<words.length ; i++){
        //     String str = words[i];
        //     HashSet<Character> set = new HashSet<>();
        //     StringBuilder sb = new StringBuilder();

        //     for(int j=0 ; j<str.length() ; j++){
        //         if(set.add(str.charAt(j))){
        //             sb.append(str.charAt(j));
        //         }
        //     };
        //     words[i]=sb.toString();
            
        // }
        int count=0;
        for(int i=0 ; i<words.length ; i++){
            boolean isValid=true;
            String str= words[i];

            for(int j=0 ; j<str.length() ; j++){
                if(!allowed.contains(String.valueOf(str.charAt(j)))){
                    isValid=false;
                    break;
                }
            }
            if(isValid){
                count++;
            }
        }
        return count;
    }
}

        // for (int i = 0; i < words.length; i++) {
        //     boolean isConsistent = true;

        //     for (int j = 0; j < words[i].length(); j++) {
        //         if (!allowed.contains(String.valueOf(words[i].charAt(j)))) {
        //             isConsistent = false;
        //             break;
        //         }
        //     }

        //     if (isConsistent) {
        //         count++;
        //     }
        // }

        // return count;
//     }
    
// }
