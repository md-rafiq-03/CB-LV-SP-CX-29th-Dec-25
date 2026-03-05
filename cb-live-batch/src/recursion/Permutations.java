package recursion;

public class Permutations {

    private static void print(String input,
                              String output,
                              String used){
        int n = input.length();
        if(output.length()==n){
            System.out.println(output);
            return ;
        }
        for(int i=0;i<n;i++){
            char ch = input.charAt(i);
            if(!isUsed(used, ch)) {
                print(input, output + ch, used + ch);
            }
        }
    }
    private static boolean isUsed(String used, char ch){
        for(int i=0;i<used.length();i++){
            if(used.charAt(i)==ch)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abcd";
        print(s, "", "");
    }

}
