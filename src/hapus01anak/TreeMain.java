package hapus01anak;

public class TreeMain {

    public static void main(String[] args) {
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

        TreeNode tes = data.getParent(12);
        System.out.println("\nParent dari 12 adalah = " + tes.getData());
        System.out.println("");

        data.hapus(12);
        System.out.println("Hapus 12");
        System.out.print("Preorder = ");
        data.preorderTraversal();

        data.hapus(27);
        System.out.println("\nHapus 27");
        System.out.print("Preorder = ");
        data.preorderTraversal();

        data.hapus(6);
        System.out.println("\nHapus 6");
        System.out.print("Preorder = ");
        data.preorderTraversal();

        data.hapus(55);
        System.out.println("\nHapus 55");
        System.out.print("Preorder = ");
        data.preorderTraversal();
    }
}

