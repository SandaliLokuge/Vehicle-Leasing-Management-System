/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.Generators;

import java.sql.SQLException;
import java.text.NumberFormat;
import leasing.Controllers.LeaseIDController;

/**
 *
 * @author Sandali
 */
public class LeaseIDGenerator {

    public static String getnewLeaseID(String tablename, String colomnname, String prefix) throws ClassNotFoundException, SQLException {
        String LastLeaseID=LeaseIDController.getLastLeaseID(tablename,colomnname);
        if(LastLeaseID != null){
            int leaseId=Integer.parseInt(LastLeaseID.split(prefix)[1]);
            leaseId++;
            NumberFormat nf=NumberFormat.getIntegerInstance();
            nf.setMaximumIntegerDigits(9);
            nf.setGroupingUsed(false);
            String formatNewLeaseID=nf.format(leaseId);
            return prefix+formatNewLeaseID;                      
        }else{
            return prefix+"000000001";
        }
    }
    
}
