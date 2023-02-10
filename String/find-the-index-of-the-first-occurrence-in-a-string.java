class Solution {
    public int strStr(String haystack, String needle) {
        int i=0,flag=0;
        String temp="";
        if(haystack!="" || needle!=""){
          while(i<haystack.length()||i<needle.length()){

             if(i+needle.length()<=haystack.length()){
                 
               temp=haystack.substring(i,i+needle.length());
            if(temp.equals(needle)){
                                 System.out.println(temp+""+needle);

               flag=i;
                break;
            } 
                  else{
                  flag=-1;
              }
             }
                 
              else{
                  flag=-1;
              }
              i++;  
              }
        }
                else{
                    
                    flag=0;
                }
        return flag;
       
    }
}
