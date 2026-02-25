import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int i = 0;
        while (i < n) {
            int j = 0;
            int product = 1;
            while (j < n) {
                if (i != j) {
                    product = product * a[j];
                }
                j++;
            }
            System.out.print(product + " ");
            i++;
        }
    }
}