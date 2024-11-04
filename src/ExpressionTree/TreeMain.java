package ExpressionTree;

public class TreeMain {

    public static void main(String[] args) {
        Tree expressionTree = new Tree();

        String expression = "(A+B)";
        expressionTree.addExpressionInfix(expression);

        System.out.println("Prefix : ");
        expressionTree.prefix();

        System.out.println("Infix : ");
        expressionTree.infix();

        System.out.println("Postfix : ");
        expressionTree.postfix();
    }
}
