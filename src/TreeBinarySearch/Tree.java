package TreeBinarySearch;

import java.util.Scanner;
import javax.sound.midi.Track;

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

    public void add(int x) {
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

    public TreeNode getNode(int key) {
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
}
