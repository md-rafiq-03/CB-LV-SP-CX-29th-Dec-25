package recursion;

public class LexographicalOrderOfNumbers {

    private static void printLexo(int curr, int n){
        if(curr>n)
            return ;
        System.out.println(curr);
        for(int dig=0;dig<10;dig++){
            if(curr*10+dig>n) break;
            printLexo(curr*10+dig, n);
        }
    }

    public static void main(String[] args) {
        int n = 49;
        System.out.println(0);
        for(int i=1;i<10;i++){
            printLexo(i, n);
        }
    }
}
