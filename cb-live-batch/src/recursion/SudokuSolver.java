package recursion;

public class SudokuSolver {
    boolean solve(int row, int col, char[][] board){
        // all the cells are filled
        if(row==9){
            return true;
        }

        // current row ka kaam ho gya move to next
        if(col==9){
            return solve(row+1, 0, board);
        }

        // current cell is already filled , go to next cell
        if(board[row][col]!='.'){
            return solve(row, col+1, board);
        }

        for(char num = '1';num<='9' ;num++){
            if(isSafe(row, col, board, num)){
                board[row][col] = num;
                if(solve(row, col+1, board)==true) return true;
                board[row][col] = '.';
            }
        }

        return false;

    }

    boolean isSafe(int row, int col, char[][] board, char toFill){
        // same row, same col
        for(int k=0;k<9;k++){
            if(board[row][k]==toFill || board[k][col]==toFill)
                return false;
        }

        int si = row-row%3;
        int sj = col-col%3;

        for(int i=si;i<si+3;i++){
            for(int j=sj;j<sj+3;j++){
                if(board[i][j]==toFill)
                    return false;
            }
        }

        return true;
    }

    public void solveSudoku(char[][] board) {
        solve(0,0,board);
    }
}
