package App;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseConnection {
    Connection conn;
    public static Connection getConnection(){
          
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/lms","root","");
             return conn;       
        } catch (Exception ex) {
           //JOptionPane.showMessageDialog(null,ex);
            return null;
        }
       
    }
}
