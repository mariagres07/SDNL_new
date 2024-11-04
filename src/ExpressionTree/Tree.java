package ExpressionTree;

import java.util.Stack;

public class Tree {

    private TreeNode root;

    public Tree() {
        root = null;
    }

    public Tree(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void add(char x) {
        TreeNode bantu = root;

        if (isEmpty()) {
            root = new TreeNode(x);
            return;
        }

        while (true) {
            if (x < bantu.getData()) {
                if (bantu.leftNode == null) {
                    bantu.leftNode = new TreeNode(x);
                    return;
                } else {
                    bantu = bantu.leftNode;
                }
            } else if (bantu.rightNode == null) {
                bantu.rightNode = new TreeNode(x);
                return;
            } else {
                bantu = bantu.rightNode;
            }
        }
    }

    public TreeNode getNode(char key) {
        TreeNode bantu = root;

        while (bantu != null) {
            if (key == bantu.getData()) {
                return bantu;
            } else if (key < bantu.getData()) {
                bantu = bantu.getLeftNode();
            } else {
                bantu = bantu.getRightNode();
            }
        }
        return bantu;
    }

    public void preorderTraversal() {
        preorderHelper(root);
    }

    public void inorderTraversal() {
        inorderHelper(root);
    }

    public void postorderTraversal() {
        postorderHelper(root);
    }

    public void preorderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getData() + " ");
            preorderHelper(localRoot.leftNode);
            preorderHelper(localRoot.rightNode);
        }

    }

    public void inorderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            inorderHelper(localRoot.leftNode);
            System.out.print(localRoot.getData() + " ");
            inorderHelper(localRoot.rightNode);
        }
    }

    public void postorderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            postorderHelper(localRoot.leftNode);
            postorderHelper(localRoot.rightNode);
            System.out.print(localRoot.getData() + " ");

        }
    }

    public TreeNode getParent(TreeNode key) {
        TreeNode bantu = root;
        TreeNode parent = null;
        while (bantu != null && bantu != key) {
            parent = bantu;

            if (key.data == bantu.data) {
            } else if (key.data > bantu.data) {
                bantu = bantu.rightNode;
            } else {
                bantu = bantu.leftNode;
            }
        }
        return parent;
    }

    public TreeNode getPredecessor(TreeNode node) {
        TreeNode bantu = node.leftNode;

        while (bantu.rightNode != null) {
            bantu = bantu.rightNode;
        }
        return bantu;
    }

    public boolean hapus(char x) {
        TreeNode bantu = getNode(x);

        if (bantu == null) {
            return false;
        } else {
            if (bantu.data == root.data) {
                if (bantu.isLeaf()) {
                    root = null;
                } else if (bantu.rightNode == null) {
                    root = bantu.leftNode;
                } else if (bantu.leftNode == null) {
                    root = bantu.rightNode;
                } else {
                    TreeNode predecessor = getPredecessor(bantu);
                    TreeNode parentPredecessor = getParent(predecessor);
                    bantu.data = predecessor.data;
                    if (parentPredecessor != bantu) {
                        if (predecessor.leftNode != null) {
                            parentPredecessor.rightNode = predecessor.leftNode;
                        } else {
                            parentPredecessor.rightNode = null;
                        }
                    } else {
                        bantu.leftNode = predecessor.leftNode;
                    }
                }
                return true;

            } else {
                TreeNode parent = getParent(bantu);
                if (x < parent.data) {
                    if (bantu.isLeaf()) {
                        parent.leftNode = null;
                    } else if (bantu.rightNode == null) {
                        parent.leftNode = bantu.leftNode;
                    } else if (bantu.leftNode == null) {
                        parent.leftNode = bantu.rightNode;
                    } else {
                        TreeNode predecessor = getPredecessor(bantu);
                        TreeNode parentPredecessor = getParent(predecessor);
                        bantu.data = predecessor.data;
                        if (parentPredecessor != bantu) {
                            if (parentPredecessor != null) {
                                parentPredecessor.rightNode = predecessor.leftNode;
                            } else {
                                parentPredecessor.rightNode = null;
                            }
                        } else {
                            bantu.leftNode = predecessor.leftNode;
                        }
                    }
                } else {
                    if (bantu.isLeaf()) {
                        parent.rightNode = null;
                    } else if (bantu.rightNode == null) {
                        parent.rightNode = bantu.leftNode;
                    } else if (bantu.leftNode == null) {
                        parent.rightNode = bantu.rightNode;
                    } else {
                        TreeNode predecessor = getPredecessor(bantu);
                        TreeNode parentPredecessor = getParent(predecessor);
                        bantu.data = predecessor.data;
                        if (parentPredecessor != bantu) {
                            if (predecessor.leftNode != null) {
                                parentPredecessor.rightNode = predecessor.leftNode;
                            } else {
                                parentPredecessor.rightNode = null;
                            }
                        } else {
                            bantu.leftNode = predecessor.leftNode;
                        }
                    }
                }
                return true;
            }

        }
    }

    public void prefix() {
        prefixHelper(root);
        System.out.println();
    }

    public void infix() {
        infixHelper(root);
        System.out.println();
    }

    public void postfix() {
        postfixHelper(root);
        System.out.println();
    }

    public void prefixHelper(TreeNode localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getData() + " ");
            prefixHelper(localRoot.getLeftNode());
            prefixHelper(localRoot.getRightNode());
        }
    }

    public void infixHelper(TreeNode localRoot) {
        if (localRoot != null) {
            infixHelper(localRoot.getLeftNode());
            System.out.print(localRoot.getData() + " ");
            infixHelper(localRoot.getRightNode());
        }
    }

    public void postfixHelper(TreeNode localRoot) {
        if (localRoot != null) {
            postfixHelper(localRoot.getLeftNode());
            postfixHelper(localRoot.getRightNode());
            System.out.print(localRoot.getData() + " ");
        }
    }

    public boolean isOperand(char a) {
        String operand ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < operand.length(); i++) {
            if (a == operand.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public boolean isOperator(char a) {
        return a == '*'|| a == '/' || a == '+' || a == '-' || a == '%';
    }

    public void addExpressionInfix(String x) {
        Stack<TreeNode> Operand = new Stack();
        Stack<TreeNode> Operator = new Stack();

        char c;

        for (int i = 0; i < x.length(); i++) {
            c = x.charAt(i);

            if (c == '(') {
                Operator.push(new TreeNode(c));
            } else if (isOperand(c)) {
                Operand.push(new TreeNode(c));
            } else if (isOperator(c)) {
                while (!Operator.isEmpty() && Operator.peek().getData() != '(') {
                    TreeNode operator = Operator.pop();
                    TreeNode rightOperand = Operand.pop();
                    TreeNode leftOperand = Operand.pop();

                    operator.setRightNode(rightOperand);
                    operator.setLeftNode(leftOperand);

                    Operand.push(operator);
                }
                Operator.push(new TreeNode(c));

            } else if (c == ')') {
                while (!Operator.isEmpty() && Operator.peek().getData() != '(') {
                    TreeNode operator = Operator.pop();
                    TreeNode rightOperand = Operand.pop();
                    TreeNode leftOperand = Operand.pop();

                    operator.setRightNode(rightOperand);
                    operator.setLeftNode(leftOperand);

                    Operand.push(operator);
                }
                Operator.pop();
            }
        }
        while (!Operator.isEmpty()) {
            TreeNode operator = Operator.pop();
            TreeNode rightOperand = Operand.pop();
            TreeNode leftOperand = Operand.pop();

            operator.setRightNode(rightOperand);
            operator.setLeftNode(leftOperand);

            Operand.push(operator);
        }
        if (!Operand.isEmpty()) {
            root = Operand.pop();
        }
    }
}


