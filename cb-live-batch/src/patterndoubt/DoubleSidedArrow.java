package patterndoubt;

import java.util.Arrays;
import java.util.Scanner;

public class DoubleSidedArrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        int rows = 0;
        int leftSpace  = n-1;
        int stars = 2;
        int innerSpaces = -1;

        while(rows<n){
            // left space
            int ls  =0;
            while(ls<leftSpace){
                System.out.print("\t");
                ls++;
            }
            // left numbers
            int ln = stars/2;
            while(ln>0){
                System.out.print(ln + "\t");
                ln--;
            }
            // innser spaces
            int is  =0;
            while(is<innerSpaces){
                System.out.print("\t");
                is++;
            }
            // right numbers
            int rn = stars/2;
            // rn = 2/2 = 1
            if(rows==0 || rows ==n-1){
                rn -=1;
            }
            int start = 1;
            // 1<0
            while(start<=rn){
                System.out.print(start + "\t");
               start++;
            }

            // mirror
            if(rows<n/2){
                leftSpace-=2;
                stars+=2;
                innerSpaces+=2;
            }else{
                leftSpace+=2;
                stars-=2;
                innerSpaces-=2;
            }
            rows++;
            System.out.println();
        }

    }

    class Pair{
        public int first;
        public int second;

        public Pair(int first, int second){
            this.first=first;
            this.second = second;
        }

    }

    class Solution {
        public int maxCapacity(int[] costs, int[] capacity, int budget) {
            int n = costs.length;
            Pair[] arr = new Pair[n];
            for(int i = 0;i<n;i++){
                arr[i] = new Pair(costs[i], capacity[i]);
            }

            Arrays.sort(arr, (a, b)->a.second-b.first);
            int[] maxi = new int[n];
            for(int i =n-1;i>=0;i--){
                maxi[i] = Math.max(maxi[i], arr[i].second);
            }
            int i = 0;
            int j = n-1;
            int ans = maxi[0]; // maxi[0] = max of this array
            while(i<j){
                if(arr[i].first + arr[j].first < budget){
                    ans= Math.max(ans, arr[i].second + maxi[j]);
                    j--;
                }else{
                    i++;
                }
            }
            return ans;

        }
    }
}
