package patterndoubt;

import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rows = 0;
        int leftSpaces = n-1;
        int stars = n;
        while(rows<n){
            // spaces left
            int leftSpace = 0;
            while (leftSpace<leftSpaces){
                System.out.print(" ");
                leftSpace++;
            }

            // stars
            int star = 0;
            while(star<n){
                if(rows ==0 || rows == n-1 || star ==0 || star==n-1) {
                    // if rows = 0 OR rows = n-1
                    // rows = 1
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
                star++;
            }
            System.out.println();
            rows++;
            leftSpaces--;
        }

    }
}
