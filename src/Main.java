import java.util.Stack;

public class Main{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        Stack stack=new Stack<>();
        for (int i=0;i<arr.length;i++){
            stack.push(arr[i]);
            arr[i]=0;
        }
        for (int i=0;i<stack.size();i++){
            arr[i]=(int)stack.get(stack.size()-i-1);
        }
        for (int i: arr){
            System.out.println(i);
        }

    }
}