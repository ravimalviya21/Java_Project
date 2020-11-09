package atmsystem;
import java.sql.*;

public class Conn
{
    Connection c;
    Statement s;
   
  
    
  Conn()
            {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");   // To register the driver
                    c=DriverManager.getConnection("jdbc:mysql://localhost:3308/atmsystem","root","");// To get Connection
                    
                    s = c.createStatement();     //  To create a statement of the SQL equery
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                
            }
    
}