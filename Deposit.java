package atmsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;

public class Deposit extends JFrame implements ActionListener
{
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1,b2,b3;
    
    
    Deposit()
    {
        
        super("ATM SYSTEM - DEPOSIT");
   
        setLayout(null);
        
        l1 = new JLabel("Enter Your Amount You Want to Deposit");
        l1.setBounds(65,100,500,30);
        l1.setFont(new Font("Raleway",Font.BOLD,25));
        l1.setForeground(Color.BLACK);
        l1.setBackground(Color.WHITE);
        add(l1);
        
        l2 = new JLabel("Enter Pin");
        l2.setBounds(420,20,100,15);
        l2.setFont(new Font("Raleway",Font.BOLD,15));
        l2.setForeground(Color.BLACK);
        l2.setBackground(Color.WHITE);
        add(l2);
        
        t1 = new JTextField();
        t1.setBounds(152,170,300,30);
        t1.setFont(new Font("Raleway",Font.BOLD,20));
        t1.setForeground(Color.BLACK);
        t1.setBackground(Color.WHITE);
        add(t1);
        
        t2 = new JTextField();
        t2.setBounds(500,20,40,20);
        t2.setFont(new Font("Raleway",Font.BOLD,15));
        t2.setForeground(Color.BLACK);
        t2.setBackground(Color.WHITE);
        add(t2);
        
        
        
        b1 = new JButton("DEPOSIT");
        b1.setBounds(152,230,130,30);
        b1.setFont(new Font("Raleway",Font.BOLD,20));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        add(b1);
        
        b2 = new JButton("CLEAR");
        b2.setBounds(320,230,130,30);
        b2.setFont(new Font("Raleway",Font.BOLD,20));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        add(b2);
        
        b3 = new JButton("EXIT");
        b3.setBounds(152,300,300,30);
        b3.setFont(new Font("Ralway",Font.BOLD,20));
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        add(b3);
        
        setSize(600,600);
        setLocation(380,60);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e3)
    {
        try
        {
            String pin = t2.getText();
            String deposit = t1.getText();
            
            Conn c1 = new Conn();
            String q10 = "select *from login where pin='"+pin+"'";
            String q11 = "insert into deposit values('"+pin+"','"+deposit+"')";
            ResultSet r1 = c1.s.executeUpdate(q10);
            
            if(e3.getSource()==b1)
            {
                
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args)
    {
        Deposit obj = new Deposit();
       
        
        
    }
}