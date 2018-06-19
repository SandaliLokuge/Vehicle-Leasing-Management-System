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
import leasing.models.Vehicle;

/**
 *
 * @author Sandali
 */
public class GuarantorController {

    public static int addGuarantor(Guarantor guarantor) throws SQLException, ClassNotFoundException {
        String sql = "Insert into Guarantor values(?,?,?,?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, guarantor.getGuarantorId());
        stm.setObject(2, guarantor.getNIC());
        stm.setObject(3, guarantor.getFirstName());
        stm.setObject(4, guarantor.getLastName());
        stm.setObject(5, guarantor.getDateofBirth());
        stm.setObject(6, guarantor.getTel_Home());
        stm.setObject(7, guarantor.getTel_Office());
        stm.setObject(8, guarantor.getAddress_Home());
        stm.setObject(9, guarantor.getAddress_Office());
        stm.setObject(10, guarantor.getBussiness_Occupation());
        stm.setObject(11, guarantor.getGender());
        return stm.executeUpdate();
    }

    public static ArrayList<Guarantor> viewAllGuarantors() throws ClassNotFoundException, SQLException {
        String sql = "select * from Guarantor";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Guarantor> guarantorlist = new ArrayList<>();
        while (rst.next()) {
            guarantorlist.add(new Guarantor(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11)));
        }
        return guarantorlist;
    }

    public static Guarantor viewAllGuarantors(String guarantorId) throws ClassNotFoundException, SQLException {
        String sql = "Select * From Guarantor where GuarantorId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, guarantorId);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new Guarantor(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11));
        } else {
            return null;
        }
    }

    public static ArrayList<Guarantor> searchGuarantor(String Clientcode) throws ClassNotFoundException, SQLException {
        String sql = "Select g.GuarantorId From Guarantor g,GuarantorsinLeasing gl,Lease l,Customer c where c.Clientcode='" + Clientcode + "' AND c.Clientcode=l.Clientcode AND l.LeaseId=gl.LeaseId AND gl.GuarantorId=g.GuarantorId";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Guarantor> guarantorlist = new ArrayList<>();
        if (rst.next()) {
            guarantorlist.add(new Guarantor(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11)));
        }
        return guarantorlist;
    }
}
