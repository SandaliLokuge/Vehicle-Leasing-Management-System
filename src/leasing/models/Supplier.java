/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.models;

/**
 *
 * @author Sandali
 */
public class Supplier {
    	private String SupplierId;
	private String Name; 
	private String Address ;
	private String Branch ;
	private String Tel_no ;	

    public Supplier() {
    }

    public Supplier(String SupplierId, String Name, String Address, String Branch, String Tel_no) {
        this.SupplierId = SupplierId;
        this.Name = Name;
        this.Address = Address;
        this.Branch = Branch;
        this.Tel_no = Tel_no;
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
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the Branch
     */
    public String getBranch() {
        return Branch;
    }

    /**
     * @param Branch the Branch to set
     */
    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    /**
     * @return the Tel_no
     */
    public String getTel_no() {
        return Tel_no;
    }

    /**
     * @param Tel_no the Tel_no to set
     */
    public void setTel_no(String Tel_no) {
        this.Tel_no = Tel_no;
    }
        
}
