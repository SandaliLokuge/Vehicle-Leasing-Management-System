/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.models;

/**
 *
 * @author Sandali
 */
public class Installment {
    	private String InstallmentId ;
	private int No_of_Installment;
	private String LeaseId ;
	private double Amount;
	private String Date;

    public Installment() {
    }

    public Installment(String InstallmentId, int No_of_Installment, String LeaseId, double Amount, String Date) {
        this.InstallmentId = InstallmentId;
        this.No_of_Installment = No_of_Installment;
        this.LeaseId = LeaseId;
        this.Amount = Amount;
        this.Date = Date;
    }

    /**
     * @return the InstallmentId
     */
    public String getInstallmentId() {
        return InstallmentId;
    }

    /**
     * @param InstallmentId the InstallmentId to set
     */
    public void setInstallmentId(String InstallmentId) {
        this.InstallmentId = InstallmentId;
    }

    /**
     * @return the No_of_Installment
     */
    public int getNo_of_Installment() {
        return No_of_Installment;
    }

    /**
     * @param No_of_Installment the No_of_Installment to set
     */
    public void setNo_of_Installment(int No_of_Installment) {
        this.No_of_Installment = No_of_Installment;
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

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }
        
}
