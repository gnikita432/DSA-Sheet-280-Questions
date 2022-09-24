//51. N-Queens

//First Approach
class Solution {
    public List<List<String>> solveNQueens(int n) {
        
       //Levels and options, row will be level and colum will be choices
        
        int[][] board = new int[n][n];
        List<List<String>> res = new ArrayList<>();
        
        NQueens(n, 0, board, res);
        
        return res;
    }
    
    public void NQueens(int n, int row, int[][] board, List<List<String>> res){
        
        if(row == n){
            //creating the 2d board array into arraylist
            res.add(boardList(board));
            return;
        }
        
        for(int col = 0 ; col<n ; col++){ //This loop is over the columns ie. which column can the Queen fit in of this row
            if(queenissafe(board, row, col, n)){
                //Puting queen in this place
                board[row][col] = 1;
                
                //Calling for the next row(for next queen)
                NQueens(n, row+1, board, res);
                
                //Removing queen from that postion after call
                board[row][col] = 0;
            }
        }
        
    }
    
    public boolean queenissafe(int[][] board, int row, int col, int n){
        
        //Checking left diagonally
        for(int i=row, j=col ; i>=0 && j>=0 ; i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        //Checking for the straight up
         for(int i=row, j=col ; i>=0 && j>=0 ; i--){
            if(board[i][j]==1){
                return false;
            }
        }
        //checking right diagonally
         for(int i=row, j=col ; i>=0 && j<n ; i--,j++){
            if(board[i][j]==1){
                return false;
            }
        }
        return true;
    }
    
    public List<String> boardList(int[][] board){
        List<String> li = new ArrayList<>();
        
        for(int row = 0 ; row<board.length ; row++){
            String hli = "";
            for(int col = 0 ; col<board.length ; col++){
                if(board[row][col] == 1){
                    hli+="Q";
                }else{
                    hli+=".";
                }
            }
            li.add(hli);
        }
        return li;
    }
    
}
