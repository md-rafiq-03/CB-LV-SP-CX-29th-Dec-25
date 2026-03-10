package recursion;

public class NoWaysToReachBottomRightCell {
    private static int solve(int row, int col, int n,int m){
        // base cases
        if(row>n || col>m)
            return 0;

        if(row==n-1 && col==m-1)
            return 1;

        int right = solve(row, col+1, n, m);
        int down = solve(row+1, col, n,m);
        return right+down;
    }

    public static void main(String[] args) {
        int n = 2, m = 2;
        System.out.println(solve(0,0,n,m));
    }
}
