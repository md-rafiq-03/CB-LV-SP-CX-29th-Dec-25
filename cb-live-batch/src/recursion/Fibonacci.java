package recursion;

public class Fibonacci {
    static int fib(int n){
        if(n==0 || n==1)
            return n;

        int s1 = fib(n-1);
        int s2 = fib(n-2);
        int l = s1+s2;
        return l;

        //return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
    }
}
