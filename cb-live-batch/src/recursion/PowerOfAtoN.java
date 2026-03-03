package recursion;

import java.util.Scanner;

public class PowerOfAtoN {

    private static int pow(int a, int n){
        // base
        if(n==0)
            return 1;
        // smaller problem
        //int smallerAns = pow(a,n-1);
        // lager problem
        //int largerAns = a * pow(a,n-1);
        // return
        return  a * pow(a,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(pow(a, n));



    }
}
