package recursion;

public class ClimbingStairs {
    static void print(int[] arr ,int n,String s){
        if(n==0){
            System.out.println(s);
            return ;
        }
        if(n<0) return ;
        for(int i=0;i<arr.length;i++){
            print(arr, n-arr[i], s+arr[i]);
        }
    }

    static int print(int n,String s){
        if(n==0){
            //System.out.println(s);
            return 1;
        }
        if(n<0) return 0;
//        for(int i=1;i<3;i++){
//            print( n-i, s+i);
//        }
        int a = print(n-1, s+1);
        int b = print(n-2, s+2);
        int c = print(n-3, s+3);
        return a+b+c;
    }


    public static void main(String[] args) {
        int n = 4;
        int[] arr = {1, 2, 3};
        print(n, "");
    }
}
