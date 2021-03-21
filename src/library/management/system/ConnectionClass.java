/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.sql.*;

/**
 *
 * @author akhil
 */
public class ConnectionClass {
    
    public static Connection getConnection(){
        
        Connection con = null;
        
        try{            
//           class.forName("com.mysql.jbdc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management_system","root","");
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return con;        
    }
    
}