package Stacks;

import java.util.Stack;

public class AsteroidCollision {

    private static int[] solve(int[] arr){
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<n;i++){
            if(stack.empty()){
                stack.push(arr[i]);
            }else{
                boolean flag = true;
                while(!stack.isEmpty() && stack.peek()>0 && arr[i]<0){
                    if(stack.peek()>Math.abs(arr[i])){
                        flag=false;
                        break;
                    }else if(stack.peek()==Math.abs(arr[i])){
                        stack.pop();
                        flag=false;
                        break;
                    }
                    stack.pop();
                }

                if(flag) {
                    stack.push(arr[i]);
                }
            }
        }

        int[] ans = new int[stack.size()];
        int pos = stack.size()-1;
        while(!stack.isEmpty()){
            ans[pos] = stack.pop();
            pos--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10 , -5, -10, 15, 25, -50, -70};
        int[] ans = solve(arr);
        for(int e:ans){
            System.out.print(e+", ");
        }
    }
}
