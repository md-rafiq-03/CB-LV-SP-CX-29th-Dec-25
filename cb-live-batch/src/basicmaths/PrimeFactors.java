package basicmaths;

import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {
        // int a = 034;
        // sout(a)
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = n/2;// 12
        while(n%2==0){
            System.out.println(2);
            n/=2;
        }
        // n=30
        for(int i = 3; i<=m ;){
            if(n%i==0){
                System.out.println(i);
                n/=i;
            }else{
                i+=2;
            }
        }
    }

}
