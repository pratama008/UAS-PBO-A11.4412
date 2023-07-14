package pemesananhotel;

import java.sql.DriverManager;
import java.sql.Connection;

public class Koneksi {
    
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/pemesanan_hotel";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;

    public Connection getConnection() {
        
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
}