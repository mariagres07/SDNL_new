package JTree;

import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
import javax.swing.tree.*;

public class JTreeDemo extends JFrame {

    JTree tree;
    JLabel jlab;

    public void init() {
        try {
            SwingUtilities.invokeAndWait(
                    new Runnable() {
                public void run() {
                    makeGUI();//memanggil method makeGUI()
                }
            }
            );
        } catch (Exception exc) {
            System.out.println("Can't create because of " + exc);
        }
    }

    private void makeGUI() {
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");//membuat root bernama options
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        top.add(a);//menambahkan A ke dalam node top
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
        a.add(a1);//menambahkan A1 ke dalam sub node A
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
        a.add(a2);//menambahkan A2 ke dalam sub node A
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        top.add(b);//menambahkan B ke dalam node top
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
        b.add(b1);//menambahkan B1 ke dalam sub node B
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
        b.add(b2);//menambahkan B2 ke dalam sub node B
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");
        b.add(b3);//menambahkan B3 ke dalam sub node B

        tree = new JTree(top);

        //membuat suatu objek bernama jsp dari JScrollPane dengan bentuk pohon
        JScrollPane jsp = new JScrollPane(tree);
        add(jsp);//menambahkan jsp
        
        jlab = new JLabel();//menampilkan teks yang akan berubah sesuai pilihan di pohon
        add(jlab, BorderLayout.SOUTH);

        tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent tse) {
                jlab.setText("Selection is " + tse.getPath());
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JTree Demo");//membuat judul
        setSize(400, 300);//menentukan ukuran
        setLocationRelativeTo(null);//membuat tampilan berada di tengah
        setVisible(true);//menampilkan tampilan
    }

    public static void main(String[] args) {
        JTreeDemo frame = new JTreeDemo();//
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frame.makeGUI();//memanggil method makeGUI() pada objek frame
            }
        });
    }
}
