package TreeBinarySearch;

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

        while (true){
            System.out.print("Masukkan angka yang dicari = ");
            int cari = in.nextInt();

            TreeNode kunci = data.getNode(cari);
            System.out.println("\ndata yang dicari = " + cari);

            if (kunci != null) {
                System.out.println("data ditemukan");
            } else {
                System.out.println("data tidak ditemukan");
            }
            System.out.print("Ulangi pencarian? (ya / tidak)");
            String pilihan = in.next();

            if (pilihan.equalsIgnoreCase("tidak")) {
                break;
            }
        }
    }
}
