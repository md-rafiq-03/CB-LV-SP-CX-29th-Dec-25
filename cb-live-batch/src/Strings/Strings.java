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
        // s1 == s2
        System.out.println(s1.compareTo(s2));
        String a = "bat";
        String b = "ball";
        // a>b
        System.out.println(a.compareTo(b));

        // b<a
        System.out.println(b.compareTo(a));


        s4 = new String("abc");
        String s5 = new String("abc");
        if(compareTo(s1, s2)==0){
            System.out.println("String s4 & s5 are Equal");
        }

        s4 = new String("abcdef");
        s5 = new String("abcdfe");
        System.out.println(compareTo(s4,s5));

        String t1 = "ABC";
        String t2 = "abc";
        System.out.println(t1.compareTo(t2));

        // substring
        System.out.println(s1.substring(1,4)); // ell
        System.out.println(s1.substring(1));
    }

    // TC = O(MIN(n,m))
    public static int compareTo(String s1, String s2){
        if(s1.equals(s2))
            return 0;

        int n = Math.min(s1.length(), s2.length());
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        // appppppl
        // apppp
        return s1.length()-s2.length();
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
