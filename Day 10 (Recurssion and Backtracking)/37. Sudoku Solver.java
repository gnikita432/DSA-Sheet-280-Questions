// 37. Sudoku Solver

class Solution {
    public void solveSudoku(char[][] board) {

        char[][] newboard = new char[board.length][board.length];
        solveSudokuHelper(newboard, board, 0, 0);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = newboard[i][j];
            }
        }

        return;

    }


    public void solveSudokuHelper(char[][] newboard, char[][] helperboard, int row, int col) {
          
        if (row == helperboard.length) {
            saveboard(newboard, helperboard);
            return;
        }

        int ncol = 0, nrow = 0;
        if (col >= helperboard[0].length - 1) {
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = row;
            ncol = col + 1;
        }


        if (helperboard[row][col] != '.') {
            //if the block already contains a number then move ahead
            solveSudokuHelper(newboard, helperboard, nrow, ncol);

        } else {
            for (int pos = 1; pos <= 9; pos++) {
                if (isvalid(helperboard, row, col, ("" + pos).charAt(0))) {
                    //add
                    helperboard[row][col] = ("" + pos).charAt(0);
                    //call
                    solveSudokuHelper(newboard, helperboard, nrow, ncol);

                    //remove
                    helperboard[row][col] = ("" + '.').charAt(0);
                }
            }
        }

    }

    //isvalid
    public boolean isvalid(char[][] helperboard, int row, int col, int pos) {
        //row
        for (int i = 0; i < helperboard.length; i++) {
            if (helperboard[i][col] == pos) {
                return false;
            }
        }

        //col
        for (int i = 0; i < helperboard.length; i++) {
            if (helperboard[row][i] == pos) {
                return false;
            }
        }

        //3*3 block
        int si = 3 * (row / 3);
        int sj = 3 * (col / 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (helperboard[si + i][sj + j] == pos) {
                    return false;
                }
            }
        }
        return true;
    }

    //saveboard
    public void saveboard(char[][] newboard, char[][] helperboard) {
        for (int i = 0; i < helperboard.length; i++) {
            for (int j = 0; j < helperboard[0].length; j++) {
                newboard[i][j] = helperboard[i][j];
            }
        }
    }
}
