package employee;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Remove_Employee implements ActionListener {

    JFrame f;
    JTextField t;
    JLabel l1, l2, l3;
    JButton b, b1, b2, b3;

    Remove_Employee() {
        f = new JFrame("Remove Employee");
        f.setBackground(Color.green);
        f.setLayout(null);

        l1 = new JLabel("Employee Id");
        l1.setBounds(50, 100, 250, 30);
        l1.setForeground(Color.black);
        Font f2 = new Font("serif", Font.BOLD, 25);
        l1.setFont(f2);
        f.add(l1);

        t = new JTextField();
        t.setBounds(220, 100, 150, 30);
        f.add(t);

        System.out.println(t);
        b = new JButton("Delete");
        b.setBounds(170, 150, 100, 30);
        b.addActionListener(this);
        f.add(b);
        
        b3=new JButton("back");
        b3.setBounds(310,150,100,30);  
        b3.addActionListener(this);
        f.add(b3);

         

        f.setVisible(true);
        f.setSize(550, 500);
        f.setLocation(400, 100);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b) {
            try {
                Conn con = new Conn();
                String str = "delete from employee where k = '" + t.getText() + "'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "deleted successfully");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Exception occured while delting record " + ex);
            }
        }
        
        
        
        
        if(ae.getSource()==b3){
            f.setVisible(false);
            details d=new details();

    }
    }
    public static void main(String[] args) {
        new Remove_Employee();
    }
}
