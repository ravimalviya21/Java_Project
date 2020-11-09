package atmsystem;
import javax.swing.*;
import java.awt.*;

public class Fast extends JFrame
{
    JLabel l1,l2;
    JButton b1,b2,b3,b4,b5,b6,b7;
    JTextField t1;
    
    
    Fast()
    {
        
    
    
   
        setLayout(null);
        
        l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setBounds(90,100,500,30);
        l1.setFont(new Font("Raleway",Font.BOLD,30));
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
        t1.setBounds(500,20,40,20);
        t1.setFont(new Font("Raleway",Font.BOLD,15));
        t1.setForeground(Color.BLACK);
        t1.setBackground(Color.WHITE);
        add(t1);
        
        b1 = new JButton("100");
        b1.setBounds(90,170,200,35);
        b1.setFont(new Font("Raleway",Font.BOLD,15));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        add(b1);
        
        b2 = new JButton("1000");
        b2.setBounds(310,170,200,35);
        b2.setFont(new Font("Raleway",Font.BOLD,15));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        add(b2);
        
        b3 = new JButton("5000");
        b3.setBounds(90,230,200,35);
        b3.setFont(new Font("Raleway",Font.BOLD,15));
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        add(b3);
        
        b4 = new JButton("500");
        b4.setBounds(310,230,200,35);
        b4.setFont(new Font("Raleway",Font.BOLD,15));
        b4.setForeground(Color.WHITE);
        b4.setBackground(Color.BLACK);
        add(b4);
        
        b5 = new JButton("2000");
        b5.setBounds(90,290,200,35);
        b5.setFont(new Font("Raleway",Font.BOLD,15));
        b5.setForeground(Color.WHITE);
        b5.setBackground(Color.BLACK);
        add(b5);
        
        b6 = new JButton("10000");
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
    }
    
    public static void main(String [] args)
    {
        Fast obj = new Fast();
        obj.setVisible(true);
        obj.setSize(600,600);
        obj.setLocation(380,60);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.getContentPane().setBackground(Color.WHITE);
        
        
    }
}