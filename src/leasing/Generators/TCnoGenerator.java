/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.Generators;

import java.sql.SQLException;
import java.text.NumberFormat;
import leasing.Controllers.TCnoController;

/**
 *
 * @author Pubodha
 */
public class TCnoGenerator {

    public static String getnewTCno(String tablename, String colomnname, String prefix) throws ClassNotFoundException, SQLException {
        String LastTCno = TCnoController.getLastTCno(tablename, colomnname);
        if (LastTCno != null) {
            int TCno = Integer.parseInt(LastTCno.split(prefix)[2]);
            TCno++;
            NumberFormat nf = NumberFormat.getIntegerInstance();
            nf.setMaximumIntegerDigits(9);
            nf.setGroupingUsed(false);
            String formatNewLeaseID = nf.format(TCno);
            return prefix + formatNewLeaseID;
        } else {
            return prefix + "000000001";
        }
    }
}
