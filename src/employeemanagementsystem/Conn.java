package employeemanagementsystem;
import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        
        /*
        JDBC connectivity
        Step 1: Register the driver class
        Step 2: Create the connection string
        Step 3: Create the statement
        Step 4: Exceute MySQL queries
        Step 5: Close the connection
        */
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "rootpass");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}