class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int mat[][]=new int[n][n];
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            mat[i][j]=matrix[j][i];
        }
       } 
       for(int i=0;i<n;i++){
        int left=0;
        int right=n-1;
        while(left<right){
            int temp=mat[i][left];
            mat[i][left]=mat[i][right];
            mat[i][right]=temp;
            left++;
            right--;
        }
       }
         for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            matrix[i][j]=mat[i][j];
        }
       } 
    }
}
