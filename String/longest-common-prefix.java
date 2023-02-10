class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str="";
        int flag=0;
        int len=strs[0].length();
        for(int i=1;i<strs.length;i++){
            if(len>strs[i].length()){
                len=strs[i].length();
            }
        }
       for(int i=0;i<len;i++){
          
               for(int k=0;k<1;k++){
                   for(int l=0;l<strs.length;l++){
                       if(strs[k].charAt(i)==strs[l].charAt(i)){
                           flag=1; 
                          }
                       else{
                           flag=0;
                           break;   
                       }
                   }
                   if(flag==1){
                        str+=strs[k].charAt(i);

                   }    
               }
           if(flag==0){
               break;
           }
       }
        return str;
    }
}
