package twodarrays;

public class TransposeOfSquareMatrix {

    public static void print(int[][] grid,int n, int m){

        for(int row =0;row<n;row++){
            for(int col=0;col<m;col++){
                System.out.print(grid[row][col]+", ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{3,4,5},{6,7,8,9}};
        int n = matrix.length;
        int m = matrix[0].length;
        print(matrix,n,m);
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println("After Tranpose");

        print(matrix,n,m);


    }
}
