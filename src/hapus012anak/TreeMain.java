package hapus012anak;

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
        int x = 21;
        TreeNode bantu = data.getNode(x);
        TreeNode lala = data.getPredecessor(bantu);
        System.out.println("Predecessor " + x + " : " + lala.getData());

        int[] angka = {12, 55, 21, 42};
        for (int i = 0; i < angka.length; i++) {
            int angkaHapus = angka[i];
            data.hapus(angkaHapus);
            System.out.print("\nPreorder = ");
            data.preorderTraversal();
        }
    }
}

