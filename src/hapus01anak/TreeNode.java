package hapus01anak;

public class TreeNode {

    int data;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode() {
        this(0);
    }

    public TreeNode(int data) {
        this.data = data;
        leftNode = null;
        rightNode = null;
    }

    public int getData() {
        return data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setData(int data) {
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

