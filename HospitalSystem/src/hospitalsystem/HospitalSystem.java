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
public class HospitalSystem {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_HospitalSchema", "root", "9125arpitarai");
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM JDBC_HospitalSchema.PatientTable");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("PatientName"));
            }
        } catch (ClassNotFoundException | SQLException exception) {
            System.out.println("Connection to MySQl failed !!!");
        }
    }

}
