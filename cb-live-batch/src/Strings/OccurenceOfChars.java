package Strings;

public class OccurenceOfChars {
    public static void main(String[] args) {
        String s = "abcdababdcadbbzyxvr";
        int[] freq = new int[26];

        for(int i=0;i<s.length();i++){
            int pos = s.charAt(i) - 'a';
            freq[pos]++;
        }

        for(int i=0;i<26;i++){
            // i =0
            // 'a' = 97
            // 'A' = 65

            System.out.println((char)(i+'a') + " -> " + freq[i]);
        }

        System.out.println((char)('a'-32));
    }
}
