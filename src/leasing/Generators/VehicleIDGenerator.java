/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.Generators;

import java.sql.SQLException;
import java.text.NumberFormat;
import leasing.Controllers.ClientCodeController;
import leasing.Controllers.VehicleIDController;

/**
 *
 * @author Sandali
 */
public class VehicleIDGenerator {

    public static String getNewVehicleId(String tablename, String colomnname, String prefix) throws ClassNotFoundException, SQLException {
        String LastvehicleId = VehicleIDController.getLastclientcode(tablename, colomnname);
        if (LastvehicleId != null) {
            int vehicleId = Integer.parseInt(LastvehicleId.split(prefix)[1]);
            vehicleId++;
            NumberFormat nf = NumberFormat.getIntegerInstance();
            nf.setMaximumIntegerDigits(9);
            nf.setGroupingUsed(false);
            String formatnewvehicleId = nf.format(vehicleId);
            return prefix + formatnewvehicleId;
        } else {
            return prefix + "000000001";
        }
    }
}
