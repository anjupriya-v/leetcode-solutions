class Solution {
    public boolean isPowerOfFour(int n) {
        int x=0;
        boolean result=false;
        while(true){
            if(n== Math.pow(4,x)){
                result=true;
                break;
            }
            if( Math.pow(4,x)>n){
                break;
            }
            x++;
        }
        return result;
    }
}
