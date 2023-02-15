class Solution {
    public int climbStairs(int n) {
        int first=1,second=2,temp=0;
        if(n==1){
            return first;
        }
        if(n==2){
            return second;
        }
        for(int i=3;i<=n;i++){
            temp=second;
            second+=first;
            first=temp;
        }
        return second;
    }
}
