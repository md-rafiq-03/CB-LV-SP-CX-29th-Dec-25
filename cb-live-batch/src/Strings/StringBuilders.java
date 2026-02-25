package Strings;


public class StringBuilders {
    public static void main(String[] args) {
        //String s = new String("Hello");

        StringBuilder sb = new StringBuilder("Hello");
        sb.setCharAt(0, 'z'); // TC = O(1)
        System.out.println(sb);
       // append
        // String
        sb.append(" world");
        sb.append('!');
        sb.append(100);

        System.out.println(sb);

        int len = sb.length();
        System.out.println(len);

        // Acces at ith index -> .charAt(index)
        System.out.println(sb.charAt(0)); // Tc = O(1

        // update at index
        int index = 0;
        sb.setCharAt(index, 'z'); // TC =O(n)
        System.out.println(sb);
        // Delete
        sb.deleteCharAt(2); // Tc
        // sb = "bacdedjdjjd", start ->end
        sb.delete(2,6); // 2,3,4,5

        // insert()
        sb.insert(2, "abc"); // 2,3,4

        // reverse
        sb.reverse();

        // String -> Array
        String s = "Hello";
        char[] arr  = s.toCharArray();

        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.append('a');

    }
}
