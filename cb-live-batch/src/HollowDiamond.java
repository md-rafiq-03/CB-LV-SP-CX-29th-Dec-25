public class HollowDiamond {

    public static void main(String[] args) {
        int n = 11;
        // row  = 0
        int i = 0;
        while(i<n){
            System.out.print("*\t");
            i++;
        }
        System.out.println();
        int rows = 1;
        int stars = n-1;
        int spaces = 1;
        // from row = 1 to n-2

        while(rows<=n-2){

            // stars
            int leftHalf = stars/2;
            while(leftHalf>0){
                System.out.print("*\t");
                leftHalf--;
            }
            // spaces
            int space = 0;
            while(space<spaces){
                System.out.print("\t");
                space++;
            }
            // stars
            int righthalf = stars/2;
            while(righthalf>0){
                System.out.print("*\t");
                righthalf--;
            }
            System.out.println();

            rows++;
            if(rows>n/2){
                stars+=2;
                spaces-=2;
            }else{
                stars-=2;
                spaces+=2;
            }

        }

        // rows = n-1

        i = 0;
        while(i<n){
            System.out.print("*\t");
            i++;
        }
    }
}
