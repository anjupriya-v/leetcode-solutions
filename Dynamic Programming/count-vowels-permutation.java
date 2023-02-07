import java.util.*;
class Solution {
    public int countVowelPermutation(int n) {
        long[][]arr=new long[5][n];
        int mod=1000000007;
        for(int i=0;i<5;i++){
            arr[i][0]=1;
        }
        for(int i=1;i<n;++i){
            arr[0][i]=(arr[1][i-1] +arr[4][i-1]+arr[2][i-1])%mod;
            arr[1][i]=(arr[0][i-1]+arr[2][i-1])%mod;
            arr[2][i]=(arr[1][i-1]+arr[3][i-1])%mod;
            arr[3][i]=arr[2][i-1]%mod;
            arr[4][i]=(arr[2][i-1]+arr[3][i-1])%mod;
        }
        int sum=0;
        for(int i=0;i<5;++i){
            sum+=arr[i][n-1];
            sum%=mod;
        }
        return sum;
    }
}
