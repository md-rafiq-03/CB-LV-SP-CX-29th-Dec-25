package basicmaths;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 121111;
        int sum =0;
        while(n>0){
            int rem = n%10;
            n/=10;
            sum+=rem;
        }
        System.out.println(sum);
    }
}
