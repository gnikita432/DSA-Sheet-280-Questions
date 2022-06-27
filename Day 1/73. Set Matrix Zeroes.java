// 73. Set Matrix Zeroes

//Approach 2 - optimal solution
class Solution {
    public void setZeroes(int[][] matrix) {
        
        int col0=1;
        
        for(int i=0; i<matrix.length; i++){
             if(matrix[i][0]==0) col0 = 0;
            
            for(int j=1; j<matrix[i].length; j++){
                   if(matrix[i][j]==0){
                        matrix[i][0]=0;
                        matrix[0][j]=0;
                }
            }
        }
        for(int i=matrix.length-1; i>=0; i--){
            for(int j=matrix[i].length-1; j>=1; j--){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j]=0;
                }
            }
            if(col0 == 0){
                matrix[i][0]=0;
            }
        }
    }
}
// Time complexity : O(n*m)
// Space complexity : O(1)



// Approach 1 - Brute force
class Solution {
    public void setZeroes(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] column = new int[matrix[0].length];
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=-1;
                    column[j]=-1;
                }
            }
        }
        
          for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i]==-1||column[j]==-1){
                   matrix[i][j]=0;
                }
            }
        }
        
        
    }
}
// Time complexity : O(n*m)
// Space complexity : O(n+m)
