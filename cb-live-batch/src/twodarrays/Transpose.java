package twodarrays;

public class Transpose {

    public static void print(int[][] grid,int n, int m){

        for(int row =0;row<n;row++){
            for(int col=0;col<m;col++){
                System.out.print(grid[row][col]+", ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
                {2,3,4},
                {6,5,3}
        };

        int n = matrix.length;
        int m = matrix[0].length;

        int[][] transpose = new int[m][n];
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                transpose[col][row] = matrix[row][col];
            }
        }
        print(matrix, n, m);
        System.out.println("Tranpose");
        print(transpose, m,n);

    }
}
