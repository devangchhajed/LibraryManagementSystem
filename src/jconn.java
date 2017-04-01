/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devang Chhajed
 */
import java.sql.*;
import javax.swing.*;

public class jconn {
    
    Connection conn=null;
    public static Connection ConnectDb(){
    try{
    Class.forName("java.sql.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/libpro","root","abc123");

    
    }catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
    }
        return null;
    
    }
    
    
}
