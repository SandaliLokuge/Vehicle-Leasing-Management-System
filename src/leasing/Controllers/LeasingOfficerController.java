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
import leasing.models.LeasingOfficer;

/**
 *
 * @author Sandali
 */
public class LeasingOfficerController {

    public static int addLeasingOfficer(LeasingOfficer leasingOfficer) throws ClassNotFoundException, SQLException {
        String sql = "Insert into LeasingOfficer values(?,?,?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, leasingOfficer.getUserId());
        stm.setObject(2, leasingOfficer.getFirstName());
        stm.setObject(3, leasingOfficer.getLasttName());
        stm.setObject(4, leasingOfficer.getNIC());
        stm.setObject(5, leasingOfficer.getUserName());
        stm.setObject(6, leasingOfficer.getPassword());

        return stm.executeUpdate();
    }

    public static ArrayList<LeasingOfficer> viewAllUser() throws ClassNotFoundException, SQLException {
        String sql = "select * from LeasingOfficer";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<LeasingOfficer> userlist = new ArrayList<>();
        while (rst.next()) {
            userlist.add(new LeasingOfficer(rst.getString("UserId"), rst.getString("FirstName"), rst.getString("LasttName"), rst.getString("NIC"), rst.getString("UserName"), rst.getString("Password")));
        }
        return userlist;
    }

    public static LeasingOfficer viewAllUser(String userid) throws ClassNotFoundException, SQLException {
        String sql = "select * from LeasingOfficer where UserId ='" + userid + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return new LeasingOfficer(rst.getString("UserId"), rst.getString("FirstName"), rst.getString("LastName"), rst.getString("NIC"), rst.getString("UserName"), rst.getString("Password"));
        } else {
            return null;
        }
    }

    public static LeasingOfficer searchOfficer(Object UserName) throws ClassNotFoundException, SQLException {
        String sql = "Select * From LeasingOfficer where UserName=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, UserName);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new LeasingOfficer(rst.getString("UserId"), rst.getString("FirstName"), rst.getString("LastName"), rst.getString("NIC"),rst.getString("UserName"),rst.getString("Password"));
        } else {
            return null;
        }


    }
}
