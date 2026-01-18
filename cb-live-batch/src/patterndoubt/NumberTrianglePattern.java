package patterndoubt;

import java.util.Scanner;

public class NumberTrianglePattern {

    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();

        int rows = 0;
        int stars =  1;
        int spaces = n-1;

        while(rows<n){

            // space
            int space = 0;
            while(space<spaces){
                System.out.print("\t");
                space++;
            }

            // stars
            int num = rows+1;
            while(num<=stars){
                System.out.print(num + "\t");
                num++;
            }

            num = stars-1;
            while(num>=rows+1){
                System.out.print(num + "\t");
                num--;
            }
            System.out.println();
            spaces--;
            stars+=2;
            rows++;
        }


    }
}
