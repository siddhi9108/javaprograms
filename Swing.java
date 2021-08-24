package javaapplication1;

import javax.swing.*;

public class Swing {

    Swing() {
        JFrame f = new JFrame("Request Information App");
        f.setSize(400, 600);
        JLabel l, l1, l2, l3, l4, l5;
        JTextField t1, t2, t3;

        l = new JLabel("Request Information");
        l.setBounds(120, 10, 350, 40);
        f.add(l);

        l1 = new JLabel("First Name");
        l1.setBounds(50, 100, 100, 30);
        f.add(l1);

        t1 = new JTextField();
        t1.setBounds(150, 100, 200, 30);
        f.add(t1);

        l2 = new JLabel("Last Name");
        l2.setBounds(50, 150, 100, 30);
        f.add(l2);

        t2 = new JTextField();
        t2.setBounds(150, 150, 200, 30);
        f.add(t2);

        l3 = new JLabel("Email Address");
        l3.setBounds(50, 200, 100, 30);
        f.add(l3);

        t3 = new JTextField();
        t3.setBounds(150, 200, 200, 30);
        f.add(t3);

        l4 = new JLabel("Please keep me informed ");
        l4.setBounds(50, 250, 200, 30);
        f.add(l4);

        JCheckBox c = new JCheckBox();
        c.setBounds(50, 300, 15, 15);
        f.add(c);

        l5 = new JLabel("I would like to have communic ");
        l5.setBounds(80, 300, 200, 30);
        f.add(l5);

        JButton b = new JButton("Send Request");
        b.setBounds(150, 350, 150, 40);
        f.add(b);

        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Swing();
            }
        });

    }
}
