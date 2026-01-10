package basicmaths;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 6;
        int stars = 1;
        int row = 0;
        while(row<n){
            // stars print
            int prev = 1;
            int i = 0;
            while(i<stars){
                System.out.print(prev + "\t");
                // ncr+1 ->
                int next = (prev*(row-i))/(i+1);
                prev = next;
                i++;
            }
            System.out.println();
            stars++;
            row++;
        }
    }
}
