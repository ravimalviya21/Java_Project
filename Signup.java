package atmsystem;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Signup extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JComboBox c1,c2,c3;
    JRadioButton r1,r2,r3,r4,r5;
    JButton b1;
    
    Random ran = new Random();
   long first4 = (ran.nextLong() % 9000L) + 1000L;
   long first = Math.abs(first4);
    
   
    Signup()
    {
        super("ATM SYSTEM -SIGNUP FORM");
         
    
    
        setLayout(null);
        
        
      
        
        //JLabel Initialized
        
        l1 = new JLabel("APPLICATION FORM NO. "+first);
        l2 = new JLabel("Name");
        l3 = new JLabel("Father's Name");
        l4 = new JLabel("Date Of Birth");
        l5 = new JLabel("Date");
        l6 = new JLabel("Month");
        l7 = new JLabel("Year");
        l8 = new JLabel("Gender");
        l9 = new JLabel("Email Address");
        l10 = new JLabel("Maritial Status");
        l11 = new JLabel("Address");
        l12 = new JLabel("City");
        l13 = new JLabel("Pin code");
        l14 = new JLabel("State");
        l15 = new JLabel("Page 1 : Personal Details");
        
        //JTextField Intialized
        
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();
        t7 = new JTextField();
        
        //Jbutton Initialized
        b1 = new JButton("NEXT");
        
        //JComboBox Initialized
        String Date[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        c1 = new JComboBox(Date);
        
        String Month[] = {"January","February","March","April","May","June","July","August","September","October", "November","December"};
        c2 = new JComboBox(Month);
        
        String Year[] = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006"};
        c3 = new JComboBox(Year);
        
        //JRadioButton
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        r3 = new JRadioButton("Married");
        r4 = new JRadioButton("Unmarried");
        r5 = new JRadioButton("Other");
        
        //JLabels added
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(l9);
        add(l10);
        add(l11);
        add(l12);
        add(l13);
        add(l14);
        add(l15);
        
        
        //JTextFields added
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
        add(t7);
        
        //Jbutton added
        add(b1);
        
        //JComboBox added
        add(c1);
        add(c2);
        add(c3);
        
        //JRadioButton
        add(r1);
        add(r2);
        add(r3);
        add(r4);
        add(r5);
                
        
        
        
        
       
        
        l1.setBounds(200,15,350,20);
        l1.setFont(new Font("Raleway",Font.BOLD,20));
        l1.setForeground(Color.BLACK);
        
        l15.setBounds(230,40,200,20);
        l15.setFont(new Font("Raleway",Font.BOLD,15));
        l15.setForeground(Color.BLACK);
        
        l2.setBounds(100,100,100,20);
        l2.setFont(new Font("Raleway",Font.BOLD,17));
        l2.setForeground(Color.BLACK);
        
        l3.setBounds(100,150,150,20);
        l3.setFont(new Font("Raleway",Font.BOLD,17));
        l3.setForeground(Color.BLACK);
        
        l4.setBounds(100,200,150,20);
        l4.setFont(new Font("Raleway",Font.BOLD,17));
        l4.setForeground(Color.BLACK);
        
        l8.setBounds(100,250,100,20);
        l8.setFont(new Font("Raleway",Font.BOLD,17));
        l8.setForeground(Color.BLACK);
        
        l9.setBounds(100,300,180,20);
        l9.setFont(new Font("Raleway",Font.BOLD,17));
        l9.setForeground(Color.BLACK);
        
        l10.setBounds(100,350,180,20);
        l10.setFont(new Font("Raleway",Font.BOLD,17));
        l10.setForeground(Color.BLACK);
        
        l11.setBounds(100,400,150,20);
        l11.setFont(new Font("Raleway",Font.BOLD,17));
        l11.setForeground(Color.BLACK);
        
        l12.setBounds(100,450,100,20);
        l12.setFont(new Font("Raleway",Font.BOLD,17));
        l12.setForeground(Color.BLACK);
        
        l13.setBounds(100,500,100,20);
        l13.setFont(new Font("Raleway",Font.BOLD,17));
        l13.setForeground(Color.BLACK);
        
        l14.setBounds(100,550,100,20);
        l14.setFont(new Font("Raleway",Font.BOLD,17));
        l14.setForeground(Color.BLACK);
        
        //JTExtField
        
       t1.setBounds(300,100,350,26);
       t1.setFont(new Font("Raleway",Font.BOLD,15));
       t1.setForeground(Color.BLACK);
       
       t2.setBounds(300,150,350,26);
       t2.setFont(new Font("Raleway",Font.BOLD,15));
       t1.setForeground(Color.BLACK);
       
       t3.setBounds(300,300,350,26);
       t3.setFont(new Font("Raleway",Font.BOLD,15));
       t3.setForeground(Color.BLACK);
       
       t4.setBounds(300,400,350,26);
       t4.setFont(new Font("Raleway",Font.BOLD,15));
       t4.setForeground(Color.BLACK);
       
       t5.setBounds(300,450,350,26);
       t5.setFont(new Font("Raleway",Font.BOLD,15));
       t5.setForeground(Color.BLACK);
       
       t6.setBounds(300,500,350,26);
       t6.setFont(new Font("Raleway",Font.BOLD,15));
       t6.setForeground(Color.BLACK);
       
       t7.setBounds(300,550,350,26);
       t7.setFont(new Font("Raleway",Font.BOLD,15));
       t7.setForeground(Color.BLACK);
       
       //JButton
       b1.setBounds(550,600,100,35);
       b1.setFont(new Font("Raleway",Font.BOLD,18));
       b1.setForeground(Color.WHITE);
       b1.setBackground(Color.BLACK);
       
       //JLabel For Date
       l5.setBounds(300,200,50,20);
       l5.setFont(new Font("Raleway",Font.BOLD,15));
       l5.setForeground(Color.BLACK);
       
       l6.setBounds(400,200,80,20);
       l6.setFont(new Font("Raleway",Font.BOLD,15));
       l6.setForeground(Color.BLACK);
       
       l7.setBounds(530,200,80,20);
       l7.setFont(new Font("Raleway",Font.BOLD,15));
       l7.setForeground(Color.BLACK);
       
       
       
       //JComboBox
       c1.setBounds(340,200,40,20);
       c1.setFont(new Font("Raleway",Font.BOLD,13));
       c1.setForeground(Color.BLACK);
       c1.setBackground(Color.WHITE);
       
       c2.setBounds(450,200,70,20);
       c2.setFont(new Font("Raleway",Font.BOLD,13));
       c2.setForeground(Color.BLACK);
       c2.setBackground(Color.WHITE);
       
       c3.setBounds(575,200,70,20);
       c3.setFont(new Font("Raleway",Font.BOLD,13));
       c3.setForeground(Color.BLACK);
       c3.setBackground(Color.WHITE);
       
       //JRadioButton
       
       r1.setBounds(300,250,100,20);
       r1.setFont(new Font("Raleway",Font.BOLD,15));
       r1.setForeground(Color.BLACK);
       r1.setBackground(Color.WHITE);
       
       r2.setBounds(450,250,100,20);
       r2.setFont(new Font("Raleway",Font.BOLD,15));
       r2.setForeground(Color.BLACK);
       r2.setBackground(Color.WHITE);
       
       r3.setBounds(300,350,100,20);
       r3.setFont(new Font("Raleway",Font.BOLD,15));
       r3.setForeground(Color.BLACK);
       r3.setBackground(Color.WHITE);
       
       r4.setBounds(400,350,100,20);
       r4.setFont(new Font("Raleway",Font.BOLD,15));
       r4.setForeground(Color.BLACK);
       r4.setBackground(Color.WHITE);
       
       r5.setBounds(550,350,100,20);
       r5.setFont(new Font("Raleway",Font.BOLD,15));
       r5.setForeground(Color.BLACK);
       r5.setBackground(Color.WHITE);
       
       
       
       
       
        setSize(700,700);
        setLocation(350,30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
     
       
        
        
        
        
        
        b1.addActionListener(this);
        
        
      
        
       
        
        
        
        
    }
    
    public void actionPerformed(ActionEvent e1)
    {
        String name = t1.getText();
        String father = t2.getText();
        
        String dc1 =(String)c1.getSelectedItem();  // ComboBox receive the data in the form of object that's why we type cast  it.
        String mc1 =(String)c2.getSelectedItem();
        String yc1 =(String)c3.getSelectedItem();
        
        String gender =null;
        
        if(r1.isSelected())
        {
            gender ="Male";
        }
        else if(r2.isSelected())
        {
            gender ="Female";
        }
        
        
        String email = t3.getText();
        
        String maritial ="null";
        if(r3.isSelected())
        {
            maritial = "Married";
        }
        else if(r4.isSelected())
        {
            maritial = "Unmarried";
        }
        else if(r5.isSelected())
        {
            maritial = "Other";
        }
        
        String Address = t4.getText();
        String City = t5.getText();
        String Pin =  t6.getText();
        String state = t7.getText();
         
        
        try
        {
        if(t1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fill all the details");
            
            
            
        }
        else
        {
            Conn c1 = new Conn();
            String q1 = "insert into signup values('"+first+"', '"+name+"', '"+father+"', '"+dc1+"', '"+mc1+"', '"+yc1+"', '"+gender+"', '"+email+"', '"+maritial+"' ,'"+Address+"', '"+City+"', '"+Pin+"', '"+state+"')";
            c1.s.executeUpdate(q1);
            
            
            
            
            new Signup2().setVisible(true);
            setVisible(false);
            System.out.println("Query Executed");
        }
        
        }
        catch(Exception e)
        {
            System.out.println("Error Occured");
        }
    }
            
    
    
    public static void main(String[] args)
    {
        Signup obj = new Signup();
        obj.setVisible(true);
        
        
        
      
        
    }
    
}