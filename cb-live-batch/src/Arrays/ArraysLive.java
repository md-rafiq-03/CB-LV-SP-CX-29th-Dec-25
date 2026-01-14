package Arrays;

public class ArraysLive {

    public static void main(String[] args) {
        //  5 size ka array
        // value store -> int
        int n  = 5;
        int[] studentScore = new int[n];
        System.out.println(studentScore);

        // method to resize array
        studentScore = new int[10];
        //System.out.println(studentScore + 3*4);

        System.out.println(studentScore[4]);
        // put
        studentScore[0] = 90;
        studentScore[1] = 92;
        studentScore[3]  = 95;

        System.out.println(studentScore[0]);
        System.out.println(studentScore[1]);
        // update
        studentScore[0] = 99;
        studentScore[1] = 80;

        // how to access
        int firstStudentScore = studentScore[0];
        int secondStudentScore  = studentScore[1];

        System.out.println(firstStudentScore);
        System.out.println(secondStudentScore);

        // how to print the whole array
        for(int i = 0;i<n;i++){
            //i=0 -> studentScore[0]
            // i=1 -> studentScore[1]
            // i=2 -> studentScore[2]
            System.out.print(studentScore[i]+", ");
        }
        System.out.println();

        int[] arr = studentScore;
        arr[0] = 0;
        System.out.println(arr[0]);
        arr[0] = 12;

        // pass by value or pass by ref ??

    }

}


