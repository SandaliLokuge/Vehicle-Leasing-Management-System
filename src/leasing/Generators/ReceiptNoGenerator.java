/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.Generators;

import java.sql.SQLException;
import java.text.NumberFormat;
import leasing.Controllers.LeaseIDController;
import leasing.Controllers.ReceiptNoController;

/**
 *
 * @author Sandali
 */
public class ReceiptNoGenerator {

    public static String getNewReceiptNo(String tablename, String colomnname, String prefix) throws ClassNotFoundException, SQLException {
        String LastReceiptNo = ReceiptNoController.getLastReceiptNo(tablename, colomnname);
        if (LastReceiptNo != null) {
            int ReceiptNo = Integer.parseInt(LastReceiptNo.split(prefix)[1]);
            ReceiptNo++;
            NumberFormat nf = NumberFormat.getIntegerInstance();
            nf.setMaximumIntegerDigits(9);
            nf.setGroupingUsed(false);
            String formatNewLeaseID = nf.format(ReceiptNo);
            return prefix + formatNewLeaseID;
        } else {
            return prefix + "000000001";
        }
    }
}
