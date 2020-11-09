package atmsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.util.*;

public class Signup2 extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JTextField t1,t2,t3;
    JComboBox c1,c2,c3,c4,c5;
    JRadioButton r1,r2,r3,r4;
    JButton b1;
    
   
  
    Signup2(){
        
   
      
        super("ATM SYSTEM -  SIGNUP FORM 2");
        
        
        setLayout(null);
        
        //JLabel Initialized
        
        l1 = new JLabel("Page 2 : Addtitional Information");
        l2 = new JLabel("Religion");
        l3 = new JLabel("Category");
        l4 = new JLabel("Income");
        l5 = new JLabel("Education");
        l6 = new JLabel("Occupation");
        l7 = new JLabel("PAN Number");
        l8 = new JLabel("Aadhar Number");
        l9 = new JLabel("Senior Citizen");
        l10 = new JLabel("Exisiting Account");
        l11 = new JLabel("Form No :");

        //JLabel added
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
        
        //JComboBox added
       
        
        

        //JLabels
        l1.setBounds(210,40,300,20);
        l1.setFont(new Font("Raleway",Font.BOLD,15));
        l1.setForeground(Color.BLACK);
        
        l2.setBounds(100,100,100,20);
        l2.setFont(new Font("Raleway",Font.BOLD,17));
        l2.setForeground(Color.BLACK);
        
        l3.setBounds(100,150,100,20);
        l3.setFont(new Font("Raleway",Font.BOLD,17));
        l3.setForeground(Color.BLACK);
        
        l4.setBounds(100,200,100,20);
        l4.setFont(new Font("Raleway",Font.BOLD,17));
        l4.setForeground(Color.BLACK);
        
        l5.setBounds(100,250,100,20);
        l5.setFont(new Font("Raleway",Font.BOLD,17));
        l5.setForeground(Color.BLACK);
        
        l6.setBounds(100,300,100,20);
        l6.setFont(new Font("Raleway",Font.BOLD,17));
        l6.setForeground(Color.BLACK);
        
        l7.setBounds(100,350,200,20);
        l7.setFont(new Font("Raleway",Font.BOLD,17));
        l7.setForeground(Color.BLACK);
        
        l8.setBounds(100,400,200,20);
        l8.setFont(new Font("Raleway",Font.BOLD,17));
        l8.setForeground(Color.BLACK);
        
        l9.setBounds(100,450,200,20);
        l9.setFont(new Font("Raleway",Font.BOLD,17));
        l9.setForeground(Color.BLACK);
        
        l10.setBounds(100,500,200,20);
        l10.setFont(new Font("Raleway",Font.BOLD,17));
        l10.setForeground(Color.BLACK);
        
        String Religion[] = {"Hindu", "Muslim","Sikh","Other"};
        c1 = new JComboBox(Religion);
        c1.setBounds(300,100,350,20);
        c1.setForeground(Color.BLACK);
        c1.setBackground(Color.WHITE);
        add(c1);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        
        String Category[] = {"General","OBC","SC","ST"};
        c2 = new JComboBox (Category);
        c2.setForeground(Color.BLACK);
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        add(c2);
        c2.setBounds(300,150,350,20);
        
        String Income[] = {"Null","<2L","5L to 10L",">25L"};
        c3 = new JComboBox (Income);
        c3.setForeground(Color.BLACK);
        c3.setBackground(Color.WHITE);
        c3.setBounds(300,200,350,20);
        add(c3);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        
        String Education[] = {"Non-Graduate","Graduate","Post-Graduate"};
        c4 = new JComboBox (Education);
        c4.setForeground(Color.BLACK);
        c4.setBackground(Color.WHITE);
        c4.setBounds(300,250,350,20);
        add(c4);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        
        String Occupation[] = {"Salaried","Job","Business","Student"};
        c5 = new JComboBox(Occupation);
        c5.setForeground(Color.BLACK);
        c5.setBackground(Color.WHITE);
        c5.setBounds(300,300,350,20);
        add(c5);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        
        t2 = new JTextField();
        t2.setForeground(Color.BLACK);
        t2.setBackground(Color.WHITE);
        t2.setBounds(300,350,350,25);
        add(t2);
        t2.setFont(new Font("Raleway",Font.BOLD,16));
        
        t3 = new JTextField();
        t3.setForeground(Color.BLACK);
        t3.setBackground(Color.WHITE);
        t3.setBounds(300,400,350,25);
        add(t3);
        t3.setFont(new Font("Raleway",Font.BOLD,16));
        
        r1 = new JRadioButton("Yes");
        r1.setForeground(Color.BLACK);
        r1.setBackground(Color.WHITE);
        r1.setBounds(300,450,100,20);
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        add(r1);
        
        r2 = new JRadioButton("No");
        r2.setForeground(Color.BLACK);
        r2.setBackground(Color.WHITE);
        r2.setBounds(450,450,100,20);
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        add(r2);
        
        r3 = new JRadioButton("Yes");
        r3.setForeground(Color.BLACK);
        r3.setBackground(Color.WHITE);
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBounds(300,500,100,20);
        add(r3);
        
        r4 = new JRadioButton("No");
        r4.setBounds(450,500,100,20);
        r4.setForeground(Color.BLACK);
        r4.setBackground(Color.WHITE);
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        add(r4);
        
        b1 = new JButton("NEXT");
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.setBounds(550,600,100,35);
        b1.setFont(new Font("Raleway",Font.BOLD,16));
        add(b1);
        
        l11.setBounds(530,20,100,15);
        l11.setFont(new Font("Raleway",Font.BOLD,15));
        l11.setForeground(Color.BLACK);
        l11.setBackground(Color.WHITE);
        add(l11);
        
        t1 = new JTextField();
        t1.setBounds(610,20,40,20);
        t1.setFont(new Font("Raleway",Font.BOLD,15));
        t1.setForeground(Color.BLACK);
        t1.setBackground(Color.WHITE);
        add(t1);
        
        
        
        
        
      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,700);
        setLocation(350,30);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        
      
      
        b1.addActionListener(this);
        
        

     
        
        
    }
    
    public void actionPerformed(ActionEvent e2)
    {
        String first = t1.getText();
        
        String religion =       (String)c1.getSelectedItem();
        String category =       (String)c2.getSelectedItem();
        String income =         (String)c3.getSelectedItem();
        String education =      (String)c4.getSelectedItem();
        String occupation =     (String)c5.getSelectedItem();
        String pan =             t2.getText();
        String aadhar =          t3.getText();
        
        
        
        String citizen = null;
        String e_acc = null;
        
        if(r1.isSelected())
        {
            citizen = "Yes";
        }
        else if(r2.isSelected())
        {
            citizen = "No";   
        }
        
        if(r3.isSelected())
        {
            e_acc ="Yes";
        }
        else if(r4.isSelected())
        {
            e_acc = "No";
        }
        
        
        try
        {
            if(t1.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please fill all the required details");
            }
            else
            {
                Conn c1 = new Conn();
                String q2 =  "insert into signup2 values('"+first+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+citizen+"','"+e_acc+"')" ;
                c1.s.executeUpdate(q2);
                
                new Signup3().setVisible(true);
                setVisible(false);
                System.out.println("Query Executed");
            }
            
        }
        catch(Exception e)
                {
                       e.printStackTrace();
                }
        
        
    }   
     
    
    
    public static void main(String[] args)
    {
        Signup2 obj = new Signup2();
        
        
    }
}