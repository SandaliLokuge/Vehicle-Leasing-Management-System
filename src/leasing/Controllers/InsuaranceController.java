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
import leasing.db.DBConnection;
import leasing.models.Insuarance;
import leasing.models.Supplier;

/**
 *
 * @author Sandali
 */
public class InsuaranceController {

    public static int addInsuarance(Insuarance insuarance) throws SQLException, ClassNotFoundException {
        String sql = "Insert into Insuarance values(?,?,?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, insuarance.getInsuaranceID());
        stm.setObject(2, insuarance.getPolicy_no());
        stm.setObject(3, insuarance.getInsuarance_company());
        stm.setObject(4, insuarance.getInsuredAmount());
        stm.setObject(5, insuarance.getInsuarance_type());
        stm.setObject(6, insuarance.getStart_Date());
        stm.setObject(7, insuarance.getEnd_Date());

        return stm.executeUpdate();
    }

    public static Insuarance searchInsuarance(String VehicleId) throws ClassNotFoundException, SQLException {
        String sql = "Select * From Vehicle v ,Insuarance i where v.VehicleId='" + VehicleId + "' AND v.InsuaranceID=i.InsuaranceID";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Insuarance insuarance = null;
        if (rst.next()) {
            insuarance = new Insuarance(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getString(5),rst.getString(6),rst.getString(7));
        }
        return insuarance;
    }
}
