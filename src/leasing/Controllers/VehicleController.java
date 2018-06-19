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
import leasing.models.Vehicle;

/**
 *
 * @author Sandali
 */
public class VehicleController {

    public static int addVehicle(Vehicle vehicle) throws ClassNotFoundException, SQLException {
        String sql = "Insert into Vehicle values(?,?,?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, vehicle.getVehicleId());
        stm.setObject(2, vehicle.getSupplierId());
        stm.setObject(3, vehicle.getInsuaranceID());
        stm.setObject(4, vehicle.getMake());
        stm.setObject(5, vehicle.getModel());
        stm.setObject(6, vehicle.getValuation());
        stm.setObject(7, vehicle.getSellingPrice());
        stm.setObject(8, vehicle.getManufactureyear());
        stm.setObject(9, vehicle.getChasis_no());
        stm.setObject(10, vehicle.getRegNo());
        stm.setObject(11, vehicle.getEngine_no());
        stm.setObject(12, vehicle.getNature());
        return stm.executeUpdate();
    }

    public static ArrayList<Vehicle> viewAllVehicle() throws ClassNotFoundException, SQLException {
        String sql = "select * from Vehicle";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Vehicle> vehiclelist = new ArrayList<>();
        while (rst.next()) {
            vehiclelist.add(new Vehicle(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getDouble(6), rst.getDouble(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getString(12)));
        }
        return vehiclelist;
    }

    public static Vehicle searchVehicle(String RegNo) throws ClassNotFoundException, SQLException {
        String sql = "Select * From Vehicle where RegNo='" + RegNo + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Vehicle vehicle = null;
        if (rst.next()) {
            vehicle = new Vehicle(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getDouble(6), rst.getDouble(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getString(12));
        }
        return vehicle;
    }

    public static Vehicle searchbyVehicleID(String vehicleId) throws ClassNotFoundException, SQLException {
        String sql = "Select * From Vehicle where VehicleId='" + vehicleId + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Vehicle vehicle = null;
        if (rst.next()) {
            vehicle = new Vehicle(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getDouble(6), rst.getDouble(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getString(12));
        }
        return vehicle;

    }

    public static Vehicle searchbyClientNIC(String clientnic) throws ClassNotFoundException, SQLException {
        String sql = "Select * From Vehicle v ,Customer c, Lease l where c.NIC='" + clientnic + "' AND c.Clientcode=l.Clientcode AND l.VehicleId=v.VehicleId";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Vehicle vehicle = null;
        if (rst.next()) {
            vehicle = new Vehicle(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getDouble(6), rst.getDouble(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getString(12));
        }
        return vehicle;
    }
}
