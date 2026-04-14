import inheritence.animal.Dog;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String args[]) {
        int[] a = {10,20,30,40,50};
        int[] b = {2,5,0,8, 10};
        int[] q = new int[5];
        for(int i=0;i<5;i++){
            try {
                q[i] = getQuotient(a[i], b[i]);
                System.out.println(q[i]);
            } catch (Exception xyz) {
                //System.out.println("Exception: " + xyz.getMessage());
                throw xyz;
            }
            finally {
                System.out.println(a[i] + " " + b[i]);
            }
        }
    }

    private static int getQuotient(int a, int b){
        return a/b;
    }

}