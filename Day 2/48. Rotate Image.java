// 48. Rotate Image

class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] =temp;
            }  
        }   
        
        for(int row=0; row<matrix.length; row++){
            int i = 0, j = matrix[0].length-1;
            while(i<j){
                int temp = matrix[row][i];
                matrix[row][i] = matrix[row][j];
                matrix[row][j] = temp;
                i++;
                j--;
            }
        }
        
    }
    
    // Approach 1 : create a new 2D matrix take the first row from matrix and put it column wise in the new matrix similarly for all rows put them as column in new matrix ----> O(n^2) O(n^2)
    
    //Approach 2 : Optimal solution => Transpose matrix and reverse it
}
