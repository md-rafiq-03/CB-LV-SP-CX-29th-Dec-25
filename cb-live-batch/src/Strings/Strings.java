package Strings;

public class Strings {

    public static void main(String[] args) {
        int[] arr = new int[4];
        int n = arr.length;
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        // ==
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);

        System.out.println(s1.toString());

        String x = "hello";
        String y = x + "Bye";
        System.out.println(x == y);

        System.out.println(s1.concat(s2));
        System.out.println(10+"Hello" + 10 + 20 + "Bye"); // X, Hello30Bye ,
        System.out.println(10+"Hello" + (10 + 20) + (10*20) + "Bye");

        System.out.println(s1.equals(s3));
    }

    public static boolean equals(String s1, String s2){
        //"hello" -> HP
        // hello -> SP
        if(s1.length()!=s2.length())
            return false;
        if(s1==s2)
            return true;
        for(int i=0;i< s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }

}
