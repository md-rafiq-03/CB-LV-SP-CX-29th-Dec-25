package numbersystem;

public class DecimalToBinary {

    public static void main(String[] args) {
        int n = 67;
        int binary = 0;
        int mul = 1; // 10^0
        while(n>0){
            int rem = n%2;
            binary = rem * mul + binary;// binary representation calculating
            mul*=10; // 10^1
            n/=2;
        }
        System.out.println(binary);
    }
}
