/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.db;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sandali
 */
public class DBConnection {

    private static DBConnection dBConnection;
    private Connection conn;

    private DBConnection() throws ClassNotFoundException, SQLException {
        if (conn == null) {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/Leasing", "root", "SANDALI");
        }
    }

    public static DBConnection getDBConnection() throws ClassNotFoundException, SQLException {
        if (dBConnection == null) {
            dBConnection = new DBConnection();
        }
        return dBConnection;

    }

    public Connection getConnection() {
        return conn;

    }
}
