/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.Generators;

import java.sql.SQLException;
import java.text.NumberFormat;
import leasing.Controllers.ClientCodeController;
import leasing.Controllers.InsuaranceIdController;

/**
 *
 * @author Sandali
 */
public class InsuaranceIDGenerator {

    public static String getNewInsuaranceId(String tablename, String colomnname, String prefix) throws ClassNotFoundException, SQLException {
        String LastInsuaranceId = ClientCodeController.getLastclientcode(tablename, colomnname);
        if (LastInsuaranceId != null) {
            int InsuaranceId = Integer.parseInt(LastInsuaranceId.split(prefix)[1]);
            InsuaranceId++;
            NumberFormat nf = NumberFormat.getIntegerInstance();
            nf.setMaximumIntegerDigits(9);
            nf.setGroupingUsed(false);
            String formatnewInsuaranceId = nf.format(InsuaranceId);
            return prefix + formatnewInsuaranceId;
        } else {
            return prefix + "000000001";
        }
    }
}
