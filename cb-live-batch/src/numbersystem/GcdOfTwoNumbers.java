package numbersystem;

public class GcdOfTwoNumbers {

    public static void main(String[] args) {
        int a = 36;
        int b = 60;
        int n = (a<b)?a:b;

        int ans = 1;
        int i = 2;
        for( ; i<=n; ){
            if(a%i==0 && b%i==0){
                ans*=i;
                a/=i;
                b/=i;
            }else{
                i++;
            }
        }
        System.out.println("GCD of a & b is: "+ ans) ;
    }
}
