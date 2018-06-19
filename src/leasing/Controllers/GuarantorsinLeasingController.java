/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.Controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import leasing.db.DBConnection;
import leasing.models.GuarantorsinLeasing;

/**
 *
 * @author Sandali
 */
public class GuarantorsinLeasingController {

    public static int addGuarantorstoLease(GuarantorsinLeasing guarantorsinLeasing) throws ClassNotFoundException, SQLException {
        String sql = "Insert into GuarantorsinLeasing values(?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1,guarantorsinLeasing.getGL_Id());       
        stm.setObject(2, guarantorsinLeasing.getGuarantorId());
        stm.setObject(3, guarantorsinLeasing.getLeaseId());

        return stm.executeUpdate();
    }
}
