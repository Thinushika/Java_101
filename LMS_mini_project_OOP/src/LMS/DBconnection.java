/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LMS;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBconnection {
     Connection conn;
public static Connection getConnection(){
          
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mpdb","root","");
             return conn;       
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null,ex);
            return null;
        }
       
    }  
}
