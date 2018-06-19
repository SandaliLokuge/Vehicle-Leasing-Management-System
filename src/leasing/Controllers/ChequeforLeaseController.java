/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.Controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTextField;
import leasing.db.DBConnection;
import leasing.models.Check_for_Lease;
import leasing.models.Supplier;

/**
 *
 * @author Sandali
 */
public class ChequeforLeaseController {

    public static int addLeaseCheck(Check_for_Lease check) throws SQLException, ClassNotFoundException {
        String sql = "Insert into Check_for_Lease values(?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, check.getCheque_no());
        stm.setObject(2, check.getLeaseId());
        stm.setObject(3, check.getBank());
        stm.setObject(4, check.getIssued_by());
        stm.setObject(5, check.getIssued_Date());
        stm.setObject(5, check.getAmount());

        return stm.executeUpdate();
    }

    public static Check_for_Lease searchchq(JTextField Leaseid) throws ClassNotFoundException, SQLException {
        String sql = "Select * From Check_for_Lease c ,Lease l s where l.LeaseId ='" + Leaseid + "' AND l.LeaseId=c.LeaseId";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Check_for_Lease check = null;
        if (rst.next()) {
            check = new Check_for_Lease(rst.getString("Cheque_no"), rst.getString("LeaseId"), rst.getString("Bank"), rst.getString("Issued_by"), rst.getString("Issued_Date"),rst.getDouble("Amount"));
        }
        return check;
    }
}
