package Stacks;

import java.util.Stack;

public class NextGreaterElementToRight {

    static private int[] nextGreaterElementToRight(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }

            ans[i] = stack.isEmpty()?-1: stack.peek();
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {8,2,0,4,6};
        int n= arr.length;
        int[] ans = nextGreaterElementToRight(arr);
        for (int an : ans) {
            if(an==-1) {
                System.out.print(-1 + " ,");
                continue;
            }
            System.out.print(arr[an] + ", ");
        }
    }
}
