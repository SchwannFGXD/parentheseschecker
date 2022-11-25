import java.util.ArrayList;
import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        ParenthesesChecker checker = new ParenthesesChecker();
        String xd = "(()<><><>{})";
        System.out.println(checker.printStack(xd));

        System.out.println(checker.checkParentheses(xd));

    }
}
