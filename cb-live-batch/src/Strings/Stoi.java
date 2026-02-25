package Strings;

public class Stoi {

    public static void main(String[] args) {
        String s = "1234";
        int x= 10;
        double xx = 10.11;
        String y = Integer.toString(x);
        String z = Double.toString(xx);


        int num = Integer.parseInt(s);

        System.out.println(num);

        String ls = "123456787738383838";
        long lnum = Long.parseLong(ls);
        System.out.println(lnum);

        String ds = "123.45";
        double dnum = Double.parseDouble(ds);
        System.out.println(dnum);
    }
}
