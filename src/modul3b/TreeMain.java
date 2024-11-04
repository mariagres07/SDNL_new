package modul3b;

import java.util.Scanner;

public class TreeMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tree data = new Tree();

        data.add(42);
        data.add(21);
        data.add(38);
        data.add(27);
        data.add(71);
        data.add(82);
        data.add(55);
        data.add(63);
        data.add(6);
        data.add(2);
        data.add(40);
        data.add(12);

        System.out.println("data yang ditambahkan = 42, 21, 38, 27, 71, 82, 55, 63, 6, 2, 40 dan 12");
        
        System.out.print("Preorder = ");
        data.preorderTraversal();
        
        System.out.print("\nInorder = ");
        data.inorderTraversal();
        
        System.out.print("\nPostorder = ");
        data.postorderTraversal();
    }
}
