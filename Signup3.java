package atmsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Signup3 extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JTextField t1;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JRadioButton r1,r2,r3,r4;
    JButton b1,b2;
    
    
    
    Signup3()
    {
        super("ATM SYSTEM - SIGNUP FORM 3");
    
    
    
        
        
        l1 = new JLabel("Form No:");
        l2 = new JLabel("Page 3 : Account Details");
        l3 = new JLabel("Account Type :");
        l4 = new JLabel("Card Number :");
        l5 = new JLabel("(Your 16-Digit Card Number)");
        l6 = new JLabel("PIN :");
        l7 = new JLabel("(4-Digit Password)");
        l8 = new JLabel("XXXX-XXXX-XXXX-XXXX");
        l9 = new JLabel("It would appear on ATM CardCheque Book and Statement");
        l10 = new JLabel("XXXX");
        l11 = new JLabel("Services Required :");
        
        
        r1 = new JRadioButton("Saving Account");
        r2 = new JRadioButton("Fixed Deposit Account");
        r3 = new JRadioButton("Current Account");
        r4 = new JRadioButton("Recurring Deposit Account");
       
        
        setLayout(null);
        
        
        b1 = new JButton("Submit");
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.setBounds(200,600,100,35);
        b1.setFont(new Font("Raleway",Font.BOLD,16));
        add(b1);
        
        b2 = new JButton("Cancel");
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setBounds(400,600,100,35);
        b2.setFont(new Font("Raleway",Font.BOLD,16));
        add(b2);
        
        l4.setBounds(100,230,200,20);
        add(l4);
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setForeground(Color.BLACK);
        l4.setBackground(Color.WHITE);
        
        l5.setBounds(100,260,200,15);
        add(l5);
        l5.setFont(new Font("Raleway",Font.BOLD,10));
        l5.setForeground(Color.BLACK);
        l5.setBackground(Color.WHITE);
       
        l6.setBounds(100,300,100,20);
        add(l6);
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setForeground(Color.BLACK);
        l6.setBackground(Color.WHITE);
        
        l7.setBounds(100,330,200,15);
        add(l7);
        l7.setFont(new Font("Raleway",Font.BOLD,10));
        l7.setForeground(Color.BLACK);
        l7.setBackground(Color.WHITE);
        
        l8.setBounds(330,230,300,20);
        add(l8);
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setForeground(Color.BLACK);
        l8.setBackground(Color.WHITE);
        
        l9.setBounds(330,260,400,15);
        l9.setFont(new Font("Raleway",Font.BOLD,10));
        l9.setForeground(Color.BLACK);
        l9.setBackground(Color.WHITE);
        add(l9);
        
        l10.setBounds(330,300,100,20);
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setForeground(Color.BLACK);
        l10.setBackground(Color.WHITE);
        add(l10);
        
        l11.setBounds(100,360,200,20);
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setForeground(Color.BLACK);
        l11.setBackground(Color.WHITE);
        add(l11);
        
        r4.setBounds(330,180,300,20);
        add(r4);
        r4.setFont(new Font("Raleway",Font.BOLD,15));
        r4.setForeground(Color.BLACK);
        r4.setBackground(Color.WHITE);
        
        
        l2.setBounds(230,40,200,20);
        l2.setFont(new Font("Raleway",Font.BOLD,16));
        l2.setForeground(Color.BLACK);
        l2.setBackground(Color.WHITE);
        add(l2);
        
        l3.setBounds(100,100,200,20);
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setForeground(Color.BLACK);
        l3.setBackground(Color.WHITE);
        add(l3);
        
        
        
        
        
        r1.setBounds(120,140,150,20);
        r1.setFont(new Font("Raleway",Font.BOLD,15));
        r1.setForeground(Color.BLACK);
        r1.setBackground(Color.WHITE);
        add(r1);
        
        r2.setBounds(330,140,250,20);
        r2.setFont(new Font("Raleway",Font.BOLD,15));
        r2.setForeground(Color.BLACK);
        r2.setBackground(Color.WHITE);
        add(r2);
        
        r3.setBounds(120,180,250,20);
        r3.setFont(new Font("Raleway",Font.BOLD,15));
        r3.setForeground(Color.BLACK);
        r3.setBackground(Color.WHITE);
        add(r3);
        
        c1 = new JCheckBox("ATM Card");
        c1.setBounds(120,400,200,20);
        c1.setFont(new Font("Raleway",Font.BOLD,15));
        c1.setForeground(Color.BLACK);
        c1.setBackground(Color.WHITE);
        add(c1);
        
        c2 = new JCheckBox("Mobile Banking");
        c2.setBounds(120,440,200,20);
        c2.setFont(new Font("Raleway",Font.BOLD,15));
        c2.setForeground(Color.BLACK);
        c2.setBackground(Color.WHITE);
        add(c2);
        
       
        
        c3 = new JCheckBox("Cheque Book");
        c3.setBounds(120,480,200,20);
        c3.setFont(new Font("Raleway",Font.BOLD,15));
        c3.setForeground(Color.BLACK);
        c3.setBackground(Color.WHITE);
        add(c3);
        
        c4 = new JCheckBox("Internet Banking");
        c4.setBounds(330,400,200,20);
        c4.setFont(new Font("Raleway",Font.BOLD,15));
        c4.setForeground(Color.BLACK);
        c4.setBackground(Color.WHITE);
        add(c4);
        
        c5 = new JCheckBox("E-mail Alerts");
        c5.setBounds(330,440,200,20);
        c5.setFont(new Font("Raleway",Font.BOLD,15));
        c5.setForeground(Color.BLACK);
        c5.setBackground(Color.WHITE);
        add(c5);
        
        
        
        c6 = new JCheckBox("E-Statements");
        c6.setBounds(330,480,200,20);
        c6.setFont(new Font("Raleway",Font.BOLD,15));
        c6.setForeground(Color.BLACK);
        c6.setBackground(Color.WHITE);
        add(c6);
        
        c7 = new JCheckBox("I hereby Declares that the above entered details correct to best my knowledge");
        c7.setBounds(140,570,600,15);
        c7.setFont(new Font("Raleway",Font.BOLD,10));
        c7.setForeground(Color.BLACK);
        c7.setBackground(Color.WHITE);
        add(c7);
        
        l1.setBounds(530,20,100,15);
        l1.setFont(new Font("Raleway",Font.BOLD,15));
        l1.setForeground(Color.BLACK);
        l1.setBackground(Color.WHITE);
        add(l1);
        
        t1 = new JTextField(4);
        t1.setBounds(610,20,40,20);
        t1.setFont(new Font("Raleway",Font.BOLD,15));
        t1.setForeground(Color.BLACK);
        t1.setBackground(Color.WHITE);
        add(t1);
        
        
       
        setSize(700,700);
        setLocation(350,30);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
       
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
                
    }
    
    public  void actionPerformed(ActionEvent e3)
    {
        String id = t1.getText();
        
        String a_type =null;
        
        if(r1.isSelected())
        {
            a_type = "Saving Account";
        }
        else if(r2.isSelected())
        {
            a_type = "Fixed Deposit Account";
        }
        else if(r3.isSelected())
        {
            a_type = "Current Account";
        }
        else if(r4.isSelected())
        {
            a_type = "Recurring Deposit Account";
        }
        
        String service = "";
        if(c1.isSelected())
        {
            service = service + "ATM Card";
        }
        if(c2.isSelected())
        {
            service = service + "Mobile Banking";
        }
        if(c3.isSelected())
        {
            service = service + "Cheque Book";
        }
        if(c4.isSelected())
        {
            service = service + "Internet Banking";
        }
        if(c5.isSelected())
        {
            service = service + "E-mail";
        }
        if(c6.isSelected())
        {
            service =  service + "E-Statement";
        }
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        long card = Math.abs(first7);
        
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        long pin = Math.abs(first3);
        
        try
        {
            if(e3.getSource()==b1)
            {
                if(t1.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Please Fill all The required details");
                }
                else
                {
                    Conn c1 = new Conn();
                    String q3 = "insert into signup3  values('"+id+"' , '"+a_type+"' ,'"+card+"' ,'"+pin+"','"+service+"')";
                    
                    String q4 = "insert into login values('"+card+"','"+pin+"')";
                    c1.s.executeUpdate(q3);
                    c1.s.executeUpdate(q4);
                    
                    JOptionPane.showMessageDialog(null,"Your Card is :"+card+ "& Pin : "+pin);
                    
                    System.out.println("Query Executed");
                    
                    
                    new Transaction().setVisible(true);
                    setVisible(false);
                    
                    
                }
            }
            else if(e3.getSource()==b2)
            {
                System.exit(0);
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
    public static void main(String[] args)
    {
        Signup3 obj = new Signup3();
       /* obj.setSize(700,700);
        obj.setLocation(350,30);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.getContentPane().setBackground(Color.WHITE); */
       
        
    }
}

// NOTE : Sometimes it was throwing an exception because I haven't initialized an object of Components that declared above....
// If You Declare any components EX. JLabel, JTextField,  etc, You must have to Initialized also , after that You can Use that only