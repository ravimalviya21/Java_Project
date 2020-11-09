package atmsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.*;

public class Transaction extends JFrame implements ActionListener
{
    JLabel l1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    
    
    Transaction()
    {
    
    
    
        setLayout(null);
        
        l1 = new JLabel("Please Select Your Transaction");
        l1.setBounds(90,100,500,30);
        l1.setFont(new Font("Raleway",Font.BOLD,30));
        l1.setForeground(Color.BLACK);
        l1.setBackground(Color.WHITE);
        add(l1);
        
        b1 = new JButton("DEPOSIT");
        b1.setBounds(90,170,200,35);
        b1.setFont(new Font("Raleway",Font.BOLD,15));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        add(b1);
        
        b2 = new JButton("CASH WITHDRAWL");
        b2.setBounds(310,170,200,35);
        b2.setFont(new Font("Raleway",Font.BOLD,15));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        add(b2);
        
        b3 = new JButton("FAST CASH");
        b3.setBounds(90,230,200,35);
        b3.setFont(new Font("Raleway",Font.BOLD,15));
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        add(b3);
        
        b4 = new JButton("MINI STATEMENT");
        b4.setBounds(310,230,200,35);
        b4.setFont(new Font("Raleway",Font.BOLD,15));
        b4.setForeground(Color.WHITE);
        b4.setBackground(Color.BLACK);
        add(b4);
        
        b5 = new JButton("PIN CHANGE");
        b5.setBounds(90,290,200,35);
        b5.setFont(new Font("Raleway",Font.BOLD,15));
        b5.setForeground(Color.WHITE);
        b5.setBackground(Color.BLACK);
        add(b5);
        
        b6 = new JButton("BALANCE ENQUIRY");
        b6.setBounds(310,290,200,35);
        b6.setFont(new Font("Raleway",Font.BOLD,15));
        b6.setForeground(Color.WHITE);
        b6.setBackground(Color.BLACK);
        add(b6);
        
        b7 = new JButton("EXIT");
        b7.setBounds(200,400,200,35);
        b7.setFont(new Font("Raleway",Font.BOLD,15));
        b7.setForeground(Color.WHITE);
        b7.setBackground(Color.BLACK);
        add(b7);
        
        setVisible(true);
        setSize(600,600);
        setLocation(380,60);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        
        
        
        
        
    }
    
    public void actionPerformed(ActionEvent e5)
        {
            
            if(e5.getSource()==b1)
            {
                new Deposit().setVisible(true);
                setVisible(false);
            }
            if(e5.getSource()==b3)
            {
                new Fast().setVisible(true);
                setVisible(false);
            }
            if(e5.getSource()==b5)
            {
                new PinC().setVisible(true);
                setVisible(false);
            }
            if(e5.getSource()==b7)
            {
                System.exit(0);
            }
            
            
            
            
            
            
            
        }
    public static void main(String[] args)
    
    {
        Transaction obj = new Transaction();
        
        
        
        
    }
    
}