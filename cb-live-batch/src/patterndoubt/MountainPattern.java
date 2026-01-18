package patterndoubt;

import java.util.Scanner;

public class MountainPattern {
        public static void main(String args[]) {
            int rows = 0;
            int stars = 1;
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int space = 2*n-3; // 8-3 = 5
            while(rows<n){
                int i = 0;
                while(stars>i){
                    System.out.print((i+1)+"\t");
                    i++;
                }
                i = 0;
                while(space>i){
                    System.out.print("\t");
                    i++;
                }

                i = stars;
                if(rows==n-1){
                    i-=1;
                }
                while(i>=1){
                    System.out.print((i)+"\t");
                    i--;
                }
                rows++;
                space = space -2;
                stars = stars+1;
                System.out.println( );
            }
        }
}
