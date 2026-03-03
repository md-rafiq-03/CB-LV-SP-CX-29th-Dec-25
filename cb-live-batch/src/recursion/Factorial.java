package recursion;

public class Factorial {

    public static int factorial(int n){
        // base case -> you can say ans
         // 2=2!=2
        // 1!=1
        //0!=0
        if(n==0)
            return 1;
        // smaller sub problem
        int smallerAns = factorial(n-1);
        // larger problem
        int largerAns = n * smallerAns;

        //return
        return largerAns;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}
