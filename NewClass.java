/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;
import java.sql.*;
//import com.mysql.jdbc.Connection.*;

/**
 *
 * @author RAVI
 */
public class NewClass {
    
    
    
    public static void main(String[] args)
            
    {
        Connection c=null;
        Statement s=null;
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver Loaded");
        c =  DriverManager.getConnection("jdbc:mysql://localhost:3308/new?autoReconnect=true&useSSL=false","root","");
        s = c.createStatement();
        System.out.println("Connection Established");
        }
        catch(Exception e)
        {
           e.printStackTrace();
            //System.out.println("Error found");
        }
    }
    
    
}
