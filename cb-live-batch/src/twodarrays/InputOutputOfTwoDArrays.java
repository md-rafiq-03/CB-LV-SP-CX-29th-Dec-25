package twodarrays;

import java.util.Scanner;

public class InputOutputOfTwoDArrays {

    public static void print(int[][] grid,int n, int m){

        for(int row =0;row<n;row++){
            for(int col=0;col<m;col++){
                System.out.print(grid[row][col]+", ");
            }
            System.out.println();
        }

    }
    public static int[][] input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                matrix[row][col] = sc.nextInt();
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int numRows = 3;
        int numCols = 3;
        int[][] matrix = new int[numRows][numCols];

        //Access -> row = 2, col =1
        System.out.println(matrix[2][1]);

        // updated-> row = 2, col =1
        matrix[2][1] = 1000;
        System.out.println(matrix[2][1]);
        print(matrix, numRows, numCols);

        int[][] grid = input();
        int n = grid.length;
        int m = grid[0].length;

        print(grid, n, m);

    }

}
