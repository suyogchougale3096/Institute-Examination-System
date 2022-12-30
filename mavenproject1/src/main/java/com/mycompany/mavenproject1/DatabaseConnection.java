
package com.mycompany.mavenproject1;

import java.sql.*;
import javax.swing.*;

public class DatabaseConnection 
{
   public static Connection connection()
   {
       try 
       {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/std","root","");
        return conn;
       }catch(Exception e)
       
       {
           System.out.println(e);
           return null;
       }
       
       
       
   }
}
