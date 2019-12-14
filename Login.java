package employee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class Login  implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;

    Login(){

        f=new JFrame("Login");

        f.setBackground(Color.white);
        f.setLayout(null);

        l1 = new JLabel("Username");
        l1.setForeground(Color.blue);
        l1.setBackground(Color.white);
         l1.setFont(new Font("serif",Font.BOLD,25));
        l1.setBounds(150,120,150,30);
        f.add(l1);
       
        l2 = new JLabel("Password");
        l2.setForeground(Color.blue);
         l2.setFont(new Font("serif",Font.BOLD,25));
        l2.setBounds(150,160,250,70);
        f.add(l2);

        t1=new JTextField();
        t1.setBounds(290,120,170,40);
        f.add(t1);

        t2=new JPasswordField();
        t2.setBounds(290,180,170,40);
        f.add(t2);


        b1 = new JButton("Login");
        b1.setBounds(200,250,130,40);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        f.add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(350,250,130,40);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        f.add(b2);

        b2.addActionListener(this);
       
        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(700,500);
        f.setLocation(400,300);

    }

    public void actionPerformed(ActionEvent ae){

        try{
            Conn c1 = new Conn();
            String u = t1.getText();
            String v = t2.getText();
           
            String q = "select * from login where u='"+u+"' and v='"+v+"'";
           
            ResultSet rs = c1.s.executeQuery(q);
            if(rs.next()){
                new details().f.setVisible(true);
                f.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid login");
                f.setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] arg){
        Login l=new Login();
    }
}
