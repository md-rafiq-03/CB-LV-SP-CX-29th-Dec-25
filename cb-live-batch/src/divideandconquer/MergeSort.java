package divideandconquer;

public class MergeSort {
    static void merge(int[] arr, int left, int mid, int right){
        int n1 = (mid-left+1);
        int n2 = (right-mid);

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0;i<n1;i++){
            L[i] = arr[left+i];
        }

        for(int i=0;i<n2;i++){
            R[i] = arr[mid+1+i];
        }

        int i=0,j=0, k=left;
        while(i<n1 && j<n2){
            if(L[i]<R[j]){
                arr[k++] = L[i++];
            }else{
                arr[k++] = R[j++];
            }
        }

        while(i<n1){
            arr[k++] = L[i++];
        }

        while(i<n1){
            arr[k++] = R[j++];
        }
    }
    static void mergeSort(int[] arr, int left,int right){
        //no elements
        if(left>=right){
            return ;
        }

        int mid = (left+right)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left , mid, right);
    }

    public static void main(String[] args) {
        int[] arr = {4,3,5,1,10,9,0,8};
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+", ");
        }
    }
}
