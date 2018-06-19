/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.Controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import leasing.db.DBConnection;
import leasing.models.Income;

/**
 *
 * @author Sandali
 */
public class IncomeController {

    public static int addIncome(Income income) throws ClassNotFoundException, SQLException {
        String sql = "Insert into Income values(?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, income.getIncomeId());
        stm.setObject(2, income.getGuarantorId());
        stm.setObject(3, income.getClientcode());
        stm.setObject(4, income.getIncome_per_month());
        return stm.executeUpdate();
    }
}
