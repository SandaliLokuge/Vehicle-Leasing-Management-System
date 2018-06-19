/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.models;

/**
 *
 * @author Sandali
 */
public class Vehicle {
    	private String VehicleId ;
        private String SupplierId ;
        private String InsuaranceID ;
        private String Make ;
        private String Model ;
        private double Valuation ;
        private double SellingPrice ;
        private String Manufactureyear ;
        private String Chasis_no ;
	private String RegNo ;	
	private String Engine_no ;	
	private String Nature;

    public Vehicle() {
    }

    public Vehicle(String VehicleId, String SupplierId, String InsuaranceID, String Make, String Model, double Valuation, double SellingPrice, String Manufactureyear, String Chasis_no, String RegNo, String Engine_no, String Nature) {
        this.VehicleId = VehicleId;
        this.SupplierId = SupplierId;
        this.InsuaranceID = InsuaranceID;
        this.Make = Make;
        this.Model = Model;
        this.Valuation = Valuation;
        this.SellingPrice = SellingPrice;
        this.Manufactureyear = Manufactureyear;
        this.Chasis_no = Chasis_no;
        this.RegNo = RegNo;
        this.Engine_no = Engine_no;
        this.Nature = Nature;
    }

    /**
     * @return the VehicleId
     */
    public String getVehicleId() {
        return VehicleId;
    }

    /**
     * @param VehicleId the VehicleId to set
     */
    public void setVehicleId(String VehicleId) {
        this.VehicleId = VehicleId;
    }

    /**
     * @return the SupplierId
     */
    public String getSupplierId() {
        return SupplierId;
    }

    /**
     * @param SupplierId the SupplierId to set
     */
    public void setSupplierId(String SupplierId) {
        this.SupplierId = SupplierId;
    }

    /**
     * @return the InsuaranceID
     */
    public String getInsuaranceID() {
        return InsuaranceID;
    }

    /**
     * @param InsuaranceID the InsuaranceID to set
     */
    public void setInsuaranceID(String InsuaranceID) {
        this.InsuaranceID = InsuaranceID;
    }

    /**
     * @return the Make
     */
    public String getMake() {
        return Make;
    }

    /**
     * @param Make the Make to set
     */
    public void setMake(String Make) {
        this.Make = Make;
    }

    /**
     * @return the Model
     */
    public String getModel() {
        return Model;
    }

    /**
     * @param Model the Model to set
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * @return the Valuation
     */
    public double getValuation() {
        return Valuation;
    }

    /**
     * @param Valuation the Valuation to set
     */
    public void setValuation(double Valuation) {
        this.Valuation = Valuation;
    }

    /**
     * @return the SellingPrice
     */
    public double getSellingPrice() {
        return SellingPrice;
    }

    /**
     * @param SellingPrice the SellingPrice to set
     */
    public void setSellingPrice(double SellingPrice) {
        this.SellingPrice = SellingPrice;
    }

    /**
     * @return the Manufactureyear
     */
    public String getManufactureyear() {
        return Manufactureyear;
    }

    /**
     * @param Manufactureyear the Manufactureyear to set
     */
    public void setManufactureyear(String Manufactureyear) {
        this.Manufactureyear = Manufactureyear;
    }

    /**
     * @return the Chasis_no
     */
    public String getChasis_no() {
        return Chasis_no;
    }

    /**
     * @param Chasis_no the Chasis_no to set
     */
    public void setChasis_no(String Chasis_no) {
        this.Chasis_no = Chasis_no;
    }

    /**
     * @return the RegNo
     */
    public String getRegNo() {
        return RegNo;
    }

    /**
     * @param RegNo the RegNo to set
     */
    public void setRegNo(String RegNo) {
        this.RegNo = RegNo;
    }

    /**
     * @return the Engine_no
     */
    public String getEngine_no() {
        return Engine_no;
    }

    /**
     * @param Engine_no the Engine_no to set
     */
    public void setEngine_no(String Engine_no) {
        this.Engine_no = Engine_no;
    }

    /**
     * @return the Nature
     */
    public String getNature() {
        return Nature;
    }

    /**
     * @param Nature the Nature to set
     */
    public void setNature(String Nature) {
        this.Nature = Nature;
    }


  
        
}
