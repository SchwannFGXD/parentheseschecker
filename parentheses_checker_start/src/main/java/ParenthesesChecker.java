import java.util.Arrays;
import java.util.Stack;

public class ParenthesesChecker {

    private char[] list= new char[]{'(',')','{','}','<','>','[',']'};

    public ParenthesesChecker(){

    }

    public char[] getList() {
        return list;
    }

    public void setList(char[] list) {
        this.list = list;
    }



    //puts only parentheses, brackets etc in a stack in order.
    public Stack<String> printStack(String text ){
        //space complexity O(1)
        Stack<String> stack = new Stack<>();
        //time complexity O(n^2)
        for (int i=0; i<text.length();i++){
            for(char element: list){
                if(element == text.charAt(i)){
                    stack.push(Character.toString(element));
                }
            }
        }
        return stack;
    }

    //attempt1
    //space complexity O(1)
    //time complexity O(n^2)
    public boolean checkParentheses(String text) {
        //space complexity O(1)
        //time complexity O(n^2)
        Stack<String> stack = printStack(text);

        //time complexity O(n)
        for (int i = 0; i < stack.size()+1; i++) {
            //if stack empty
            if(stack.size()==0){
                return true;
            }
            //if stack has single
            if(stack.size()==1 || i ==stack.size()-1){
                return false;
            }
            //if index goes below 0, reset.
            if(i<0){
                i=0;
            }
            //check for parentheses
            if (stack.get(i).charAt(0) == '(' && stack.get(i+1).charAt(0) ==')') {
                stack.remove(i+1);
                stack.remove(i);
                i=i-2;
            }
            //check for brackets
            else if (stack.get(i).charAt(0) == '[' && stack.get(i+1).charAt(0) ==']') {
                stack.remove(i+1);
                stack.remove(i);
                i=i-2;
            }
            //check for angle brackets
            else if (stack.get(i).charAt(0) == '<' && stack.get(i+1).charAt(0) =='>') {
                stack.remove(i+1);
                stack.remove(i);
                i=i-2;
            }
            //check for braces
            else if (stack.get(i).charAt(0) == '{' && stack.get(i+1).charAt(0) =='}') {
                stack.remove(i+1);
                stack.remove(i);
                i=i-2;
            }
        }
        return false;
    }
}
