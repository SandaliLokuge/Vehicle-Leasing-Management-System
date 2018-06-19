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

/**
 *
 * @author Sandali
 */
public class CustomerController {

    public static int addCustomer(Customer customer) throws ClassNotFoundException, SQLException {
        String sql = "Insert into Customer values(?,?,?,?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, customer.getClientcode());
        stm.setObject(2, customer.getNIC());
        stm.setObject(3, customer.getFirstName());
        stm.setObject(4, customer.getLastName());
        stm.setObject(5, customer.getDateofBirth());
        stm.setObject(6, customer.getTel_Home());
        stm.setObject(7, customer.getTel_Office());
        stm.setObject(8, customer.getAddress_Home());
        stm.setObject(9, customer.getAddress_Office());
        stm.setObject(10, customer.getBusiness_Occupation());
        stm.setObject(11, customer.getGender());
        return stm.executeUpdate();
    }

    public static ArrayList<Customer> viewAllCustomers() throws ClassNotFoundException, SQLException {
        String sql = "select * from Customer";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Customer> customerlist = new ArrayList<>();
        while (rst.next()) {
            customerlist.add(new Customer(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11)));
        }
        return customerlist;
    }

    public static Customer searchCustomer(String NIC) throws ClassNotFoundException, SQLException {
        String sql = "Select * From Customer where NIC='" + NIC + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Customer customer = null;
        if (rst.next()) {
           customer=new Customer(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11));
        }
        return customer;
    }
}
