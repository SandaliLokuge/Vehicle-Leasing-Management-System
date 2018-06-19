/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.Controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import leasing.db.DBConnection;

/**
 *
 * @author Sandali
 */
public class ReceiptNoController {

    public static String getLastReceiptNo(String tablename, String colomnname) throws SQLException, ClassNotFoundException {
        String query = " select " + colomnname + " from " + tablename + " order by 1 desc limit 1 ";
        Statement statement = DBConnection.getDBConnection().getConnection().createStatement();
        ResultSet rst = statement.executeQuery(query);
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;
    }
}
