/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.Generators;

import java.sql.SQLException;
import java.text.NumberFormat;

import leasing.Controllers.UserIdController;

/**
 *
 * @author Pubodha
 */
public class UserIdGenerator {

    public static String getNewUserID(String tablename, String colomnname, String prefix) throws SQLException, ClassNotFoundException {
        String LastUserID = UserIdController.getLastUserID(tablename, colomnname);
        if (LastUserID != null) {
            int UserID = Integer.parseInt(LastUserID.split(prefix)[1]);
            UserID++;
            NumberFormat nf = NumberFormat.getIntegerInstance();
            nf.setMaximumIntegerDigits(9);
            nf.setGroupingUsed(false);
            String formatNewUserID = nf.format(UserID);
            return prefix + formatNewUserID;
        } else {
            return prefix + "000000001";
        }
    }
}
