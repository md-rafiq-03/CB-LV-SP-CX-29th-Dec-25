package functions;

public class Functions {

     private static int add(int a, int b){
        int sum = a+b;
        print(sum);
        return sum;
    }

    public static void print(int x){
        System.out.println(x);
        return ;
    }

    public static boolean isEven(int n){
         boolean isEven = false;
         if(n%2==0){
             isEven= true;
         }

         return isEven;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
       int sum = add(a, b);
       // System.out.println(add(a, b));
        print(sum);
        int n = 11;
        if(isEven(11)){
            System.out.println("Even");
        }else{
            System.out.println("Not Even");
        }

    }

}
