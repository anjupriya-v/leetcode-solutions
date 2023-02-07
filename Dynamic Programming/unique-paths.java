class Solution {
    public int uniquePaths(int m, int n) {
        int[][]arr=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
               arr[i][j]=0; 
            }
        }
        arr[1][n-1]=1;
        for(int i=1;i<m+1;i++){
            for(int j=n-1;j>=0;j--){
                if(arr[i][j]!=1){
                    arr[i][j]=arr[i-1][j]+arr[i][j+1];
                }
            }
        }
        int res=arr[m][0];
        return res;
    }
}
