class Solution {
    public void setZeroes(int[][] matrix) {
        boolean  [][] bool=new boolean[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0 && bool[i][j]==false){
                    //row
                    for(int k=0;k<matrix[0].length;k++){
                    if(matrix[i][k]!=0){
                        
                        matrix[i][k]=0;
                        bool[i][k]=true;
                    }

                    }
                    //column
                    for(int l=0;l<matrix.length;l++){
                        if(matrix[l][j]!=0){
                        matrix[l][j]=0;
                        bool[l][j]=true; 
                        }
                       
                    }
                }
            }
        }
    }
}
