/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.Generators;

import java.sql.SQLException;
import java.text.NumberFormat;
import leasing.Controllers.GL_IdController;


/**
 *
 * @author Sandali
 */
public class GL_IdGenerator {

    public static String getNewGL_Id(String tablename, String colomnname, String prefix) throws ClassNotFoundException, SQLException {
        String LastGL_Id = GL_IdController.getLastGL_Id(tablename, colomnname);
        if (LastGL_Id != null) {
            int GL_Id = Integer.parseInt(LastGL_Id.split(prefix)[2]);
            GL_Id++;
            NumberFormat nf = NumberFormat.getIntegerInstance();
            nf.setMaximumIntegerDigits(8);
            nf.setGroupingUsed(false);
            String formatnewGuarantorId = nf.format(GL_Id);
            return prefix + formatnewGuarantorId;
        } else {
            return prefix + "00000001";
        }
    }
}
