
package employee;


import java.sql.*;

public class Conn{
  
    public Connection c;
    public Statement s;

    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///emp","root","");
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}