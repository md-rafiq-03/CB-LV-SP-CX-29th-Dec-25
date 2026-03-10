package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RatInAMaze {
    private static  int n;
    private static int m;
    private static List<String> ans;
    static void solve(int[][] mat, int row, int col, StringBuilder path){
        // base cases
        if(row>=n || col>=m || row<0 || col<0 || mat[row][col]==0 || mat[row][col]==2){
            return ;
        }

        if(row==n-1 && col==m-1){
            //System.out.println(path);
            ans.add(new String(path.toString()));
            return;
        }
        // mat[row][col]==0
        // right
        mat[row][col]=2;
        solve(mat, row, col+1, path.append('R'));
        path.deleteCharAt(path.length()-1);
        mat[row][col]=1;

        // left
        mat[row][col]=2;
        solve(mat, row, col-1, path.append('L'));
        path.deleteCharAt(path.length()-1);
        mat[row][col]=1;

        // up
        mat[row][col]=2;
        solve(mat, row-1, col, path.append('U'));
        path.deleteCharAt(path.length()-1);
        mat[row][col]=1;

        // down
        mat[row][col]=2;
        solve(mat, row+1, col, path.append('D'));
        path.deleteCharAt(path.length()-1);
        mat[row][col]=1;
    }

    public static void main(String[] args) {
        ans = new ArrayList<>();
        int[][] mat = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        n = mat.length;
        m = mat[0].length;
        //StringBuilder sb = new StringBuilder("");
        solve(mat, 0,0, new StringBuilder(""));
        Collections.sort(ans);
        for(String s : ans){
            System.out.println(s);
        }
    }
}
