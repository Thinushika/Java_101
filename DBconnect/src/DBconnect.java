import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DBconnect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    try {
        String host = "jdbc:derby://localhost:1527/ST_Info_Sys [User1 on USER1]";
   
        String uName="usre1";
        String uPass= "user1";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        
        Statement stmt = con.createStatement();
        String sql = "SELECT * FROM APP.UNTITLED FETCH FIRST 100 ROWS ONLY";
        ResultSet rs = stmt.executeQuery(sql);
        
        while (rs.next()){
            int id_col = rs.getInt("INDEX");
            String name = rs.getString("FIRST_NAME");
            System.out.println(id_col+""+name);
           
        }    
    }
    catch(SQLException err){
        System.out.println(err.getMessage());   
    }
    }
}
    

