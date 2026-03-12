package recursion;

import java.util.Scanner;

public class NQueenProblem {
    static void display(char[][] mat,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+", ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void solve(int col,int n,char[][] mat){
        if(col==n){
            display(mat,n);
            return;
        }

        for(int row=0;row<n;row++){
            if(isSafe(row,col,mat, n)){
                mat[row][col] = 'Q';
                solve(col+1, n, mat);
                mat[row][col] = '.';
            }
        }

    }

    static boolean isSafe(int row,int col,char[][] mat, int n){

        for(int i=row,j=col;i>=0 && j>=0 ;i--,j--){
            if(mat[i][j]=='Q')
                return false;
        }

        for(int i=col;i>=0;i--){
            if(mat[row][i]=='Q')
                return false;
        }

        for(int i=row,j=col;i<n && j>=0 ;i++,j--){
            if(mat[i][j]=='Q')
                return false;
        }

        return true;
    }


    static char[][]  input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the value of n: ");
        int n = sc.nextInt();
        char[][] mat= new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = '.';
            }
        }
        return mat;
    }

    public static void main(String[] args) {

//        char[][] mat = {
//                {'.','.','.','.'},
//                {'.','.','.','.'},
//                {'.','.','.','.'},
//                {'.','.','.','.'}
//        };

        char[][] mat = input();
        int n = mat.length;
        solve(0, n, mat);
    }
}
