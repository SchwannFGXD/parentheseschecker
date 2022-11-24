public class Runner {

    public static void main(String[] args) {
        ParenthesesChecker checker = new ParenthesesChecker();
        String xd = "test {multiple} {braces}";
        System.out.println(checker.printStack(xd));

        System.out.println(checker.checkParentheses(xd));

    }
}
