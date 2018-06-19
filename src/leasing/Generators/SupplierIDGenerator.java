/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.Generators;

import java.sql.SQLException;
import java.text.NumberFormat;
import leasing.Controllers.SupplierIdController;
import leasing.Controllers.VehicleIDController;

/**
 *
 * @author Sandali
 */
public class SupplierIDGenerator {

    public static String getNewSupplierId(String tablename, String colomnname, String prefix) throws ClassNotFoundException, SQLException {
        String LastsupplierId = SupplierIdController.getLastsupplierId(tablename, colomnname);
        if (LastsupplierId != null) {
            int supplierId = Integer.parseInt(LastsupplierId.split(prefix)[1]);
            supplierId++;
            NumberFormat nf = NumberFormat.getIntegerInstance();
            nf.setMaximumIntegerDigits(9);
            nf.setGroupingUsed(false);
            String formatnewsupplierId = nf.format(supplierId);
            return prefix + formatnewsupplierId;
        } else {
            return prefix + "000000001";
        }
    }
}
