package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int n = s.length();
        int i = 0, j = n-1;
        boolean flag = true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(flag);
    }
}
