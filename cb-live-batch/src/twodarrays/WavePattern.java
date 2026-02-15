package twodarrays;

public class WavePattern {

    public static void main(String[] args) {
        int[][] matrix= {{1,2,3}, {4,5,6},{7,8,9}};
        int n = matrix.length;
        int m = matrix[0].length;
        for(int col=0;col<m;col++){
            if(col%2 ==0){
                for(int row=0;row<n;row++){
                    System.out.print(matrix[row][col] + ", ");
                }
            }else{
                for(int row=n-1;row>=0;row--){
                    System.out.print(matrix[row][col] + ", ");
                }
            }
        }
    }
}
