/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitalsystem;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author arpitarai
 */
public class JDBCConnection {

    /**
     * @return
     */
    public static Connection Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_HospitalSchema", "root", "***********");
        } catch (ClassNotFoundException | SQLException exception) {
            return null;
        }
    }
}
