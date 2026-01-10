package basicmaths;

public class GcdOfTwoNumbersUsingEuclidAlgo {

    public static void main(String[] args) {
        int a = 36;
        int b = 60;

        int dividend = a;
        int divisor = b;
        int rem = dividend % divisor;
        while(rem>0){
            dividend = divisor;
            divisor = rem;
            rem = dividend%divisor; // tell me
        }

        System.out.println(divisor);
    }
}
