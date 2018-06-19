/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.Generators;

import java.sql.SQLException;
import java.text.NumberFormat;
import leasing.Controllers.GuarantorController;
import leasing.Controllers.GuarantorIDController;

/**
 *
 * @author Sandali
 */
public class GuarantorIDGenerator {

    public static String getNewGuarantorId(String tablename, String colomnname, String prefix) throws ClassNotFoundException, SQLException {
        String LastGuarantorId = GuarantorIDController.getLastGuarantorId(tablename, colomnname);
        if (LastGuarantorId != null) {
            int GuarantorId = Integer.parseInt(LastGuarantorId.split(prefix)[1]);
            GuarantorId++;
            NumberFormat nf = NumberFormat.getIntegerInstance();
            nf.setMaximumIntegerDigits(9);
            nf.setGroupingUsed(false);
            String formatnewGuarantorId = nf.format(GuarantorId);
            return prefix + formatnewGuarantorId;
        } else {
            return prefix + "000000001";
        }
    }
}
