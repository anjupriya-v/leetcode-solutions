class Solution {
    public boolean isPalindrome(int x) {
  int temp=x,r=0,sum=0;    
  while(x>0){    
   r=x%10;  //getting remainder  
   sum=(sum*10)+r;    
   x=x/10;    
  }    
  if(temp==sum)    
   return true;   
  else    
return false;
      }    
    
}
