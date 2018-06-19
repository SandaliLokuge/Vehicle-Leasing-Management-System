/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.Controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import leasing.db.DBConnection;
import leasing.models.Bank_Account;

/**
 *
 * @author Sandali
 */
public class BankAccountController {

    public static int addbankaccounts(Bank_Account bankaccount) throws ClassNotFoundException, SQLException {
        String sql = "Insert into Bank_Account values(?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, bankaccount.getAccount_no());
        stm.setObject(2, bankaccount.getGuarantorId());
        stm.setObject(3, bankaccount.getClientcode());
        stm.setObject(4, bankaccount.getNameofBank());
        stm.setObject(5, bankaccount.getNameofBranch());
        stm.setObject(6, bankaccount.getTypeofAccount());

        return stm.executeUpdate();
    }
}
