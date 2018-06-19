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
import leasing.models.Supplier;
import leasing.models.Vehicle;

/**
 *
 * @author Sandali
 */
public class SupplierController {

    public static int addSupplier(Supplier supplier) throws ClassNotFoundException, SQLException {
        String sql = "Insert into Supplier values(?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, supplier.getSupplierId());
        stm.setObject(2, supplier.getName());
        stm.setObject(3, supplier.getAddress());
        stm.setObject(4, supplier.getBranch());
        stm.setObject(5, supplier.getTel_no());

        return stm.executeUpdate();
    }

    public static Supplier searchSupplier(String VehicleId) throws ClassNotFoundException, SQLException {
        String sql = "Select * From Vehicle v ,Supplier s where v.VehicleId='" + VehicleId + "' AND v.SupplierId=s.SupplierId";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Supplier supplier= null;
        if (rst.next()) {
            supplier = new Supplier(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
        }
        return supplier;
    }
}
