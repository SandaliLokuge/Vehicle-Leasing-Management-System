/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.Generators;

import java.sql.SQLException;
import java.text.NumberFormat;
import leasing.Controllers.ClientCodeController;

/**
 *
 * @author Sandali
 */
public class ClientCodeGenerator {

    public static String getNewClientcode(String tablename, String colomnname, String prefix) throws ClassNotFoundException, SQLException {
        String Lastclientcode = ClientCodeController.getLastclientcode(tablename, colomnname);
        if (Lastclientcode != null) {
            int clientcode = Integer.parseInt(Lastclientcode.split(prefix)[1]);
            clientcode++;
            NumberFormat nf = NumberFormat.getIntegerInstance();
            nf.setMaximumIntegerDigits(9);
            nf.setGroupingUsed(false);
            String formatnewClientcode = nf.format(clientcode);
            return prefix + formatnewClientcode;
        } else {
            return prefix + "000000001";
        }
    }
}
