import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 10; i++) {
                sb.append("A");
                try {
                    Thread.sleep(100);
                }catch (Exception ex) {};
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 10; i++) {
                sb.append("B");
                try {
                    Thread.sleep(100);
                }catch (Exception ex) {};
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
        }catch (Exception ex) {};
        try {
            t2.join();
        }catch (Exception ex) {};

        System.out.println(sb.toString());
        System.out.println(sb.length());
    }
}