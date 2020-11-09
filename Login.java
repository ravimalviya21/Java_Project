package atmsystem;                                            //Made mistakes highlighted comments
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.util.*;

public class Login extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JTextField t1;
    JTextField p1;
    JButton b1,b2,b3;
    
 /*   Login()
    {
        
    }  */
    Login()
    {
        super("ATM SYSTEM - LOGIN");
        
  /*  }
     
    public void setComponentsL()
    {    */
        
        setLayout(null);
        
        l1 = new JLabel("WELCOME TO ATM");
        add(l1);
        l1.setBounds(140,70,300,40);
        l1.setFont(new Font("Raleway", Font.BOLD,30));
        l1.setForeground(Color.BLACK);
        l1.setBackground(Color.WHITE);
        
        l2 = new JLabel("CARD NO :");
        add(l2);
        l2.setBounds(80,160,200,25);
        l2.setFont(new Font("Raleway",Font.BOLD,25));
        l2.setForeground(Color.BLACK);
        l2.setBackground(Color.WHITE);
        
        l3 = new JLabel("PIN :");
        add(l3);
        l3.setBounds(80,220,200,25);
        l3.setFont(new Font("Raleway",Font.BOLD,25));
        l3.setForeground(Color.BLACK);
        l3.setBackground(Color.WHITE);
        
        t1 = new JTextField();
        add(t1);
        t1.setBounds(270,160,250,28);
        t1.setFont(new Font("Raleway",Font.BOLD,20));
        t1.setForeground(Color.BLACK);
        t1.setBackground(Color.WHITE);
        
        
        p1 = new JTextField(4);
        p1.setBounds(270,220,250,28);
        p1.setForeground(Color.BLACK);
        p1.setBackground(Color.WHITE);
        add(p1);
        p1.setFont(new Font("Raleway",Font.BOLD,28));
        
        b1 = new JButton("SIGN IN");
        add(b1);
        b1.setBounds(270,260,120,28);
        b1.setFont(new Font("Raleway",Font.BOLD,20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("CLEAR");
        add(b2);
        b2.setBounds(400,260,120,28);
        b2.setFont(new Font("Raleway",Font.BOLD,20));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3 = new JButton("SIGN UP");
        add(b3);
        b3.setBounds(270,320,250,28);
        b3.setFont(new Font("Raleway", Font.BOLD,20));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        
        setVisible(true);
        setSize(600,600);
        setLocation(380,60);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
      
        
        
        
        
    }
    public void actionPerformed(ActionEvent e)
            
            
    {
        
        
        
                
        
       try{
              Conn c1 = new Conn();
              String card_no = t1.getText();
              String pin = p1.getText();
              String q1 = "select *from login where card_no='"+card_no+"' and pin='"+pin+"'";
              ResultSet rs = c1.s.executeQuery(q1);
                        
              
              
              
              
              
              
              
              
              
           ///   rs =  c1.s.executeQuery(q1);
              
           
               
           if(e.getSource()==b1)
           {
               
               

               if(ss.next())
               {
                   new Transaction().setVisible(true);
                   setVisible(false);
               }
               else
               {
                   JOptionPane.showMessageDialog(null,"Incorrect Card No. OR Pin , Please Try Again");
               }
               
           
           }
            if(e.getSource()==b2)
           {
               t1.setText("");
               p1.setText("");
           }
            if(e.getSource()==b3)
            {
                new Signup().setVisible(true);
                setVisible(false);
                
            }
           
           
           
       }
       catch(Exception w)
       {
           w.printStackTrace();
       }
    }
    
    public static void main(String[] args)
    {
       // new Login().setVisible(true);
       Login obj = new Login();
        obj.setVisible(true);
       /* obj.setSize(600,600);
        obj.setLocation(380,60);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.getContentPane().setBackground(Color.WHITE); */
       
        
       
    }
}