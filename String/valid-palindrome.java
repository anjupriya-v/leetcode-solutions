class Solution {
    public boolean isPalindrome(String s) {

       s=s.replaceAll("[^a-zA-Z0-9]", "");
             String temp=s,result="";
        System.out.println(s);
    for(int i=s.length()-1;i>=0;i--){
 
            result+=s.charAt(i);
            
        
    }
        System.out.println(result);
      if(temp.equalsIgnoreCase(result)){
          return true;
      } 
        return false;
       
    
       
       
    }
}
