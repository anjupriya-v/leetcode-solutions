class Solution {
    public int romanToInt(String s) {
        int n=0,sum=0,i=0,temp=0;
        int len=s.length();
        while(i<len){
            n=s.charAt(i);
            switch(n){
                case 'I':
                    if( i<len-1 && s.charAt(i+1)=='V'){
                        sum+=4;
                        i++;
                    }
                    else if( i<len-1 && s.charAt(i+1)== 'X' ){
                        sum+=9;
                        i++;
                    }
                    else{
                        sum+=1;
   
                    }
                    break;
                case 'V':
                    sum+=5;
                    break;
                case 'X':
                     if( i<len-1 && s.charAt(i+1)=='L'){
                        sum+=40;
                        i++;
                    }
                    else if(i<len-1 && s.charAt(i+1)== 'C'){
                        sum+=90;
                        i++;
                    }
                    else{
                        sum+=10;

                    }
                    break;
                case 'L':
                    sum+=50;
                    break;
                case 'C':
                      if(  i<len-1 && s.charAt(i+1)=='D'){
                        sum+=400;
                        i++;
                    }
                    else if(  i<len-1 && s.charAt(i+1)== 'M'){
                        sum+=900;
                        i++;
                    }
                    else{
                      sum+=100;

                    }
                    break;
                case 'D':
                    sum+=500;
                    break;
                case 'M':
                    sum+=1000;
                    break;
                
            }
            i++;
            
        }
        return sum;
    }
}
