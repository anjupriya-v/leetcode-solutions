class Solution {
    static int bits(int i){
                int count=0;

          while(i>0){
                 if(i%2==1){
                     count++;
                 }
                 i/=2;
             
         }
        return count;
    }
        public int[] countBits(int n) {
            int[]result=new int[n+1];
     for(int i=0;i<n+1;i++){
           
         
  result[i]=bits(i);
     }

        return result;
    }
}
