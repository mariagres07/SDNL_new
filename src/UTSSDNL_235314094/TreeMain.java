package UTSSDNL_235314094;

public class TreeMain {

    public static void main(String[] args) {
        Tree data = new Tree();

        data.add(5);
        data.add(4);
        data.add(1);
        data.add(11);
        data.add(3);
        data.add(6);

        System.out.println("data yang ditambahkan = 5, 4, 1, 11, 3, 6");
        int x = 5;

        System.out.print("\nPreorder sebelum penghapusan = ");
        data.preorderTraversal();

        TreeNode bantu = data.getNode(x);
        TreeNode lala = data.getPredecessor(bantu);
        System.out.println("\nPredecessor " + x + " : " + lala.getData());

        int[] angka = {3, 5};
        for (int i = 0; i < angka.length; i++) {
            int angkaHapus = angka[i];
            data.hapus(angkaHapus);
            System.out.print("\nPreorder setelah penghapusan " + angkaHapus + " = ");
            data.preorderTraversal();
        }
    }
}
