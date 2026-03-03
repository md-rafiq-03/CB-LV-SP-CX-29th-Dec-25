package recursion;

public class Subsequences {
    //private static int count;
    private static void print(String s, int i, int n,String output){
        // base case
        if(i==n){
            System.out.println(output);
            return ;
        }
        // take
        print(s, i+1, n, output+s.charAt(i));
        // not take
        print(s, i+1, n, output);
    }

    private static int subCount(String s, int i, int n){
        // base case
        if(i==n){
            //count++;
            //System.out.println(output);
            return 1;
        }
        // take
        int take = subCount(s, i+1, n);
        // not take
        int notTake = subCount(s, i+1, n);
        return take + notTake;
    }

    public static void main(String[] args) {
        //count =0;
        String s = "abc";
        int n = s.length();
        print(s, 0, n, "");
        System.out.println(subCount(s,0,n));
    }
}
