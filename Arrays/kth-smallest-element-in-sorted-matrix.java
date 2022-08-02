class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int result=0;
        int length=matrix.length * matrix[0].length, index=0;
        int [] arr=new int[length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[index]=matrix[i][j];
                index++;
            }
        }
        Arrays.sort(arr);
        result=arr[k-1];
        return result;
    }
}
