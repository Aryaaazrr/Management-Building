package tokobangunan;

import java.sql.Connection;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Aryaaazr_
 */
public class config {
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:/management_building"; // Url database
            String user = "root"; // user database
            String pass = ""; // password database
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.err.println("Koneksi Gagal " + e.getMessage());
        } 
        return mysqlconfig;
    } 
    public static boolean isConnected() {
        try {
            config.configDB();
            System.out.println("Database terkoneksi");
            return true;
        } catch (Exception e) {
           java.util.logging.Logger.getLogger(config.class.getName()).log(Level.SEVERE,null,e);
           System.err.println("Koneksi gagal");
           return false;
        }
    }
    public static void main(String[] args) {
       System.out.println("Cek");
       isConnected();
    }
}
