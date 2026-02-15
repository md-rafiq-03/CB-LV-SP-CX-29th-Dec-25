package twodarrays;

public class SearchIn2DArrays {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int lo = 0, hi = n-1;
        int row = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int first = matrix[mid][0];
            int last = matrix[mid][m-1];
            if(target>=first && target <= last){
                row = mid;
                break;
            }else if(target<first){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        if(row==-1){
            return false;
        }
        //System.out.println(row);
        int s = 0, e = m-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(matrix[row][mid]==target){
                return true;
            }else if(matrix[row][mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return false;
    }
}
