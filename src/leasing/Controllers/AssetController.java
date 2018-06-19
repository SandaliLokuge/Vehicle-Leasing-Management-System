/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.Controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import leasing.db.DBConnection;
import leasing.models.Asset;

/**
 *
 * @author Sandali
 */
public class AssetController {

    public static int addAsset(Asset asset) throws ClassNotFoundException, SQLException {
        String sql = "Insert into Asset values(?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1,asset.getAssetId());
        stm.setObject(2, asset.getGuarantorId());
        stm.setObject(3, asset.getClientcode());
        stm.setObject(4, asset.getDescription());
        stm.setObject(5, asset.getLocation());
        stm.setObject(6, asset.getValueofasset());
        stm.setObject(7, asset.getMortage_if_());
        return stm.executeUpdate();
    }
}
