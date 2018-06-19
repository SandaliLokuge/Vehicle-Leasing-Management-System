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
public class InsuaranceIdController {

    public static String getLastInsuaranceId(String tablename, String colomnname) throws ClassNotFoundException, SQLException{
        String query="select " + tablename + " from " + colomnname + " order by 1 desc limit 1";
        Statement statement=DBConnection.getDBConnection().getConnection().createStatement();
        ResultSet rst=statement.executeQuery(query);
        if(rst.next()){
            return rst.getString(1);    
        }
        return null;                     
    }
    
}
