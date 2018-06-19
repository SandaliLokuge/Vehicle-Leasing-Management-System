/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.Controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import leasing.db.DBConnection;
import leasing.models.Payment;

/**
 *
 * @author Sandali
 */
public class PaymentController {

    public static int addPayment(Payment payment) throws SQLException, ClassNotFoundException {
        String sql = "Insert into Payment values(?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, payment.getPayment_no());
        stm.setObject(2, payment.getReceipt_no());
        stm.setObject(3, payment.getTotal_Amount());
        stm.setObject(4, payment.getPaid_Amount());
        stm.setObject(5, payment.getBalanced_Amount());
        stm.setObject(6, payment.getPaid_date());
        stm.setObject(7, payment.getType());
        return stm.executeUpdate();
    }
}
