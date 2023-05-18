import java.util.Stack;

public class ArrayChart {
    public static void main(String[] args){
        String arr="uc oc gnohk ed eb neiT hnA";
        char[] chars=new char[arr.length()];
        Stack stack=new Stack();
        for (int i=0;i<arr.length();i++){
            stack.push(arr.charAt(i));
        }
        for (int i=0;i<stack.size();i++){
            chars[i]=(char)stack.get(stack.size()-i-1);
        }
        arr="";
        for (char i: chars){
            arr+=i;
        }
        System.out.println(arr);
    }
}
