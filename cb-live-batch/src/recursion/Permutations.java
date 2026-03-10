package recursion;

public class Permutations {

    private static void print(String input,
                              StringBuilder output,
                              StringBuilder used){
        int n = input.length();
        if(output.length()==n){
            System.out.println(output);
            return ;
        }
        for(int i=0;i<n;i++){
            char ch = input.charAt(i);
            if(!isUsed(used, ch)) {
                // add
                output.append(ch);
                used.append(ch);
                print(input, output, used);
                // remove
                // backtracking
                output.deleteCharAt(output.length()-1);
                used.deleteCharAt(used.length()-1);
            }
        }
    }
    private static boolean isUsed(StringBuilder used, char ch){
        for(int i=0;i<used.length();i++){
            if(used.charAt(i)==ch)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abc";
        StringBuilder output= new StringBuilder("");
        StringBuilder used = new StringBuilder("");
        print(s, output, used);
    }

}
