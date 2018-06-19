/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.models;

/**
 *
 * @author Sandali
 */
public class Asset {
    	private String AssetId; 
	private String GuarantorId;
	private String Clientcode;
	private String Description;
	private String Location;
	private double Valueofasset ;
	private String Mortage_if_;

    public Asset() {
    }

    public Asset(String AssetId, String GuarantorId, String Clientcode, String Description, String Location, double Valueofasset, String Mortage_if_) {
        this.AssetId = AssetId;
        this.GuarantorId = GuarantorId;
        this.Clientcode = Clientcode;
        this.Description = Description;
        this.Location = Location;
        this.Valueofasset = Valueofasset;
        this.Mortage_if_ = Mortage_if_;
    }

    /**
     * @return the AssetId
     */
    public String getAssetId() {
        return AssetId;
    }

    /**
     * @param AssetId the AssetId to set
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * @return the GuarantorId
     */
    public String getGuarantorId() {
        return GuarantorId;
    }

    /**
     * @param GuarantorId the GuarantorId to set
     */
    public void setGuarantorId(String GuarantorId) {
        this.GuarantorId = GuarantorId;
    }

    /**
     * @return the Clientcode
     */
    public String getClientcode() {
        return Clientcode;
    }

    /**
     * @param Clientcode the Clientcode to set
     */
    public void setClientcode(String Clientcode) {
        this.Clientcode = Clientcode;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * @return the Location
     */
    public String getLocation() {
        return Location;
    }

    /**
     * @param Location the Location to set
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * @return the Valueofasset
     */
    public double getValueofasset() {
        return Valueofasset;
    }

    /**
     * @param Valueofasset the Valueofasset to set
     */
    public void setValueofasset(double Valueofasset) {
        this.Valueofasset = Valueofasset;
    }

    /**
     * @return the Mortage_if_
     */
    public String getMortage_if_() {
        return Mortage_if_;
    }

    /**
     * @param Mortage_if_ the Mortage_if_ to set
     */
    public void setMortage_if_(String Mortage_if_) {
        this.Mortage_if_ = Mortage_if_;
    }

        

  
}
