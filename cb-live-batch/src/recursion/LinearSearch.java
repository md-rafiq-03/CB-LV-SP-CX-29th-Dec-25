package recursion;

public class LinearSearch {

    static boolean linearSearch(int[] arr ,int n,int item){
        // base case
        if(n==0)
            return false;

        // smaller
        //boolean smallerAns = linearSearch(arr,n-1,item);

        // larger
       // boolean largerAns = (arr[n-1]==item) ||  linearSearch(arr,n-1,item);

        //return
        return (arr[n-1]==item) ||  linearSearch(arr,n-1,item);
    }

    static boolean linearSearch(int[] arr ,int n,int item,int i){
        // base case
        // first invalid
        if(i==n)
            return false;

        // smaller
        boolean smallerAns = linearSearch(arr,n,item,i+1);

        // larger
         boolean largerAns = (arr[i]==item) ||  smallerAns;

        //return
        return largerAns;
    }

    public static void main(String[] args) {
        int n= 6;
        int[] arr = {2,3,4,5,6,2};
        int item = 5;
        System.out.println(linearSearch(arr, n, item));
        System.out.println(linearSearch(arr, n, item, 0));
    }

}
