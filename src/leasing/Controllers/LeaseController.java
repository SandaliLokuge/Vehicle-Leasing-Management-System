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
import java.util.ArrayList;
import leasing.db.DBConnection;
import leasing.models.Customer;
import leasing.models.Guarantor;
import leasing.models.Lease;

/**
 *
 * @author Sandali
 */
public class LeaseController {

    public static int addLease(Lease lease) throws ClassNotFoundException, SQLException {
        String sql = "Insert into Lease values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, lease.getLeaseId());
        stm.setObject(2, lease.getTC_No());
        stm.setObject(3, lease.getClientcode());
        stm.setObject(4, lease.getUserId());
        stm.setObject(5, lease.getVehicleId());
        stm.setObject(6, lease.getDate());
        stm.setObject(7, lease.getLeaseAmount());
        stm.setObject(8, lease.getNo_Installments());
        stm.setObject(9, lease.getInterestAmount());
        stm.setObject(10, lease.getInstallmentAmount());
        stm.setObject(11, lease.getApprovedby());
        stm.setObject(12, lease.getRecoveryOfficer());
        stm.setObject(13, lease.getLeasing_Officer());
        stm.setObject(14, lease.getPrepaidAmount());
        stm.setObject(15, lease.getPeriod());
        return stm.executeUpdate();
    }



    public static Lease viewLease(String Clientcode) throws ClassNotFoundException, SQLException {
        String sql = "select * from Customer c,Lease l,Vehicle v where c.Clientcode='" + Clientcode + "' AND c.Clientcode=l.Clientcode AND l.VehicleId=v.VehicleId";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return new Lease(rst.getString(1), rst.getString(3),rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getDouble(8), rst.getInt(9), rst.getDouble(10), rst.getDouble(11), rst.getString(12), rst.getString(13), rst.getString(14),rst.getDouble(15),rst.getString(16));
        } else {
            return null;
        }

    }
}
