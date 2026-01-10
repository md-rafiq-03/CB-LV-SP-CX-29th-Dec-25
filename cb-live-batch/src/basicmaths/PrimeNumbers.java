package basicmaths;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int isPrime = 1;
        for(int i = 2 ;i < n ; i++){
            if(n%i == 0){
                isPrime = 0;
                break;
            }
        }
        // condition -> boolean if(int)
        if(isPrime == 1){
            System.out.printf("Number is a prime");
        }else{
            System.out.printf("Number is not a prime");
        }
    }
}
