/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.Generators;

import java.sql.SQLException;
import java.text.NumberFormat;
import leasing.Controllers.Payment_noController;

/**
 *
 * @author Sandali
 */
public class Payment_noGenerator {

    public static String newPayment_no(String tablename, String colomnname, String prefix) throws ClassNotFoundException, SQLException {
        String LastPayment_no = Payment_noController.getLastPayment_no(tablename, colomnname);
        if (LastPayment_no != null) {
            int Payment_no = Integer.parseInt(LastPayment_no.split(prefix)[1]);
            Payment_no++;
            NumberFormat nf = NumberFormat.getIntegerInstance();
            nf.setMaximumIntegerDigits(9);
            nf.setGroupingUsed(false);
            String formatNewPayment_no= nf.format(Payment_no);
            return prefix + formatNewPayment_no;
        } else {
            return prefix + "000000001";
        }
    }
}
