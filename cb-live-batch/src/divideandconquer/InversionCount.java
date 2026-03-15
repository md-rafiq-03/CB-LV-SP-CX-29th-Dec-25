package divideandconquer;

public class InversionCount {
    static int merge(int[] arr, int left, int mid, int right){
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
        int count=0;
        int i=0,j=0, k=left;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k++] = L[i++];
            }else if(L[i]>R[j]){
                if(L[i]>2*R[j])
                    count+=(n1-i);
                arr[k++] = R[j++];
            }
        }

        while(i<n1){
            arr[k++] = L[i++];
        }

        while(i<n1){
            arr[k++] = R[j++];
        }
        return count;
    }
    static int mergeSort(int[] arr, int left,int right){
        //no elements
        if(left>=right){
            return 0;
        }

        int mid = (left+right)/2;
        int leftCount = mergeSort(arr, left, mid);
        //System.out.println(leftCount);
        int rightCount =mergeSort(arr, mid+1, right);
        //System.out.println(rightCount);

        //System.out.println("************");
        return leftCount+rightCount+ merge(arr, left, mid, right);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int n = arr.length;
        int ans = mergeSort(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        System.out.println(ans);
    }
}
