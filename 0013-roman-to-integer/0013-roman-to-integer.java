class Solution {
    public int romanToInt(String s) {
        int num=0;
        int tempnum;
        if(s.length()==1){
            return romIntVal(s.charAt(0));
        }
        for(int i=0 ; i<s.length()-1 ; i++){
            char ch=s.charAt(i);
            char ch1=s.charAt(i+1);
            int val1=romIntVal(ch);
            int val2=romIntVal(ch1);
            if(val1<val2){
                tempnum=val2-val1;
                num=num+tempnum;
                i++;
                tempnum=0;
            }
            else{
                num=num+val1;
            }
        }
        char lastChar=s.charAt(s.length()-1);
        char lastSecChar = s.charAt(s.length()-2);
        if(romIntVal(lastChar)<=romIntVal(lastSecChar)){
             num=num+romIntVal(lastChar);
            
        }
        return num;
       

        
    }
    
    public static int romIntVal(char ch){
        if(ch=='I'){
            return 1;
        }
        else if(ch=='V'){
            return 5;
        }
        else if(ch=='X'){
            return 10;
        }
        else if (ch=='L'){
            return 50;
        }
        else if(ch=='C'){
            return 100;
        }
        else if(ch=='D'){
            return 500;
        }
        else {
            return 1000;
        }

    }
   
}