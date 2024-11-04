package ExpressionTree;

public class TreeNode {

    char data;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode() {
    }

    public TreeNode(char data) {
        this.data = data;
        leftNode = null;
        rightNode = null;
    }

    public char getData() {
        return data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setData(char data) {
        this.data = data;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public boolean isLeaf() {
        if (leftNode == null && rightNode == null) {
            return true;
        } else {
            return false;
        }
    }
}
