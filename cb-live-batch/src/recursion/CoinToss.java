package recursion;

public class CoinToss {
    private static void print(String output, int i, int n){
        // base case
        if(i==n){
            System.out.println(output);
            return ;
        }
        // Head
        if(output.isEmpty() || output.charAt(output.length()-1)!='H')
            print(output+'H', i+1, n);

        // Tail
        print(output+'T', i+1, n);
    }

    public static void main(String[] args) {
        int n = 3;
        print("", 0, n);
    }
}
