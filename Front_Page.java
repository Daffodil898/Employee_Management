
package employee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Thread;

class Front_Page implements ActionListener{
    JFrame f;
    JLabel id,l1;
    JButton b;

    Front_Page(){

        f=new JFrame("Employee Management System");
        f.setBackground(Color.black);
        f.setLayout(null);
      
        ImageIcon i1;
        i1 = new ImageIcon(getClass().getResource("z.jpg"));
        JLabel l1 = new JLabel(i1);
         l1.setBounds(0,120,1360,500);
        f.add(l1);
        
   
        b = new JButton("CLICK HERE TO CONTINUE");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
      

        b.setBounds(500,630,300,50);
        b.addActionListener(this);

        id=new JLabel();
        id.setBounds(0,0,1360,750);
        id.setLayout(null);
      
 

        JLabel lid=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        lid.setBounds(80,30,1500,100);
        lid.setFont(new Font("serif",Font.PLAIN,70));
        lid.setForeground(Color.red);
        id.add(lid);

        id.add(b);
        f.add(id);
      
      
        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setBounds(200,100,1360,750);
        
        while(true){
            lid.setVisible(true); 
            try{
                Thread.sleep(500);
            }catch(Exception e){}
            lid.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }

    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            f.setVisible(false);
            new Login();  
        }
    }

    public static void main(String[] arg){
        Front_Page f = new Front_Page();
    }
}

