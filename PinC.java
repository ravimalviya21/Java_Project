package atmsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinC extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3;
    JButton b1,b2;
    
    
    
    PinC()
    {
        
    
    
   
        setLayout(null);
        
        l1 = new JLabel("CHANGE YOUR PIN");
        l1.setBounds(125,100,500,30);
        l1.setFont(new Font("Raleway",Font.BOLD,30));
        l1.setForeground(Color.BLACK);
        l1.setBackground(Color.WHITE);
        add(l1);
        
        l2 = new JLabel("Current Pin :");
        l2.setBounds(80,180,200,25);
        l2.setFont(new Font("Raleway",Font.BOLD,18));
        l2.setForeground(Color.BLACK);
        l2.setBackground(Color.WHITE);
        add(l2);
        
        l3 = new JLabel("New Pin :");
        l3.setBounds(80,230,200,25);
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setForeground(Color.BLACK);
        l3.setBackground(Color.WHITE);
        add(l3);
        
        l4 = new JLabel("Re-Enter New Pin :");
        l4.setBounds(80,280,200,25);
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setForeground(Color.BLACK);
        l4.setBackground(Color.WHITE);
        add(l4);
        
        t1 = new JTextField();
        t1.setBounds(300,180,250,30);
        t1.setFont(new Font("Raleway",Font.BOLD,15));
        t1.setForeground(Color.BLACK);
        t1.setBackground(Color.WHITE);
        add(t1);
        
        t2 = new JTextField();
        t2.setBounds(300,230,250,30);
        t2.setFont(new Font("Raleway",Font.BOLD,15));
        t2.setForeground(Color.BLACK);
        t2.setBackground(Color.WHITE);
        add(t2);
        
        t3 = new JTextField();
        t3.setBounds(300,280,250,30);
        t3.setFont(new Font("Raleway",Font.BOLD,15));
        t3.setForeground(Color.BLACK);
        t3.setBackground(Color.WHITE);
        add(t3);
        
        b1 = new JButton("SAVE");
        b1.setBounds(120,360,150,30);
        b1.setFont(new Font("Raleway",Font.BOLD,18));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        add(b1);
        
        b2 = new JButton("BACK");
        b2.setBounds(300,360,150,30);
        b2.setFont(new Font("Raleway",Font.BOLD,18));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        add(b2);
        
        b1.addActionListener(this);
        
    }
    
    public void actionPerformed (ActionEvent e)
    {
        if(e.getSource() ==b1 )
        {
           
            
        }
    }
    
    
    public static void main(String [] args)
    {
        PinC obj = new PinC();
        obj.setVisible(true);
        obj.setSize(600,600);
        obj.setLocation(380,60);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.getContentPane().setBackground(Color.WHITE);
        
    }
}