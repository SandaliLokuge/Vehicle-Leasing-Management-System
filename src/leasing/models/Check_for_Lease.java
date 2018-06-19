/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.models;

/**
 *
 * @author Sandali
 */
public class Check_for_Lease {
    	private String Cheque_no;
	private String LeaseId ;
	private String Bank ;
	private String Issued_by ;
	private String Issued_Date ;
	private double Amount;

    public Check_for_Lease() {
    }

    public Check_for_Lease(String Cheque_no, String LeaseId, String Bank, String Issued_by, String Issued_Date, double Amount) {
        this.Cheque_no = Cheque_no;
        this.LeaseId = LeaseId;
        this.Bank = Bank;
        this.Issued_by = Issued_by;
        this.Issued_Date = Issued_Date;
        this.Amount = Amount;
    }

    /**
     * @return the Cheque_no
     */
    public String getCheque_no() {
        return Cheque_no;
    }

    /**
     * @param Cheque_no the Cheque_no to set
     */
    public void setCheque_no(String Cheque_no) {
        this.Cheque_no = Cheque_no;
    }

    /**
     * @return the LeaseId
     */
    public String getLeaseId() {
        return LeaseId;
    }

    /**
     * @param LeaseId the LeaseId to set
     */
    public void setLeaseId(String LeaseId) {
        this.LeaseId = LeaseId;
    }

    /**
     * @return the Bank
     */
    public String getBank() {
        return Bank;
    }

    /**
     * @param Bank the Bank to set
     */
    public void setBank(String Bank) {
        this.Bank = Bank;
    }

    /**
     * @return the Issued_by
     */
    public String getIssued_by() {
        return Issued_by;
    }

    /**
     * @param Issued_by the Issued_by to set
     */
    public void setIssued_by(String Issued_by) {
        this.Issued_by = Issued_by;
    }

    /**
     * @return the Issued_Date
     */
    public String getIssued_Date() {
        return Issued_Date;
    }

    /**
     * @param Issued_Date the Issued_Date to set
     */
    public void setIssued_Date(String Issued_Date) {
        this.Issued_Date = Issued_Date;
    }

    /**
     * @return the Amount
     */
    public double getAmount() {
        return Amount;
    }

    /**
     * @param Amount the Amount to set
     */
    public void setAmount(double Amount) {
        this.Amount = Amount;
    }
        
}
