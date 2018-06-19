/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.models;

/**
 *
 * @author Sandali
 */
public class Lease {
    	private String LeaseId ;
        private String TC_No ;
	private String Clientcode ;
	private String UserId ;
	private String VehicleId ;
	private String Date ;
	private double LeaseAmount ;
	private int No_Installments ;
	private double InterestAmount ;
	private double InstallmentAmount ;
	private String Approvedby ;
	private String RecoveryOfficer ;
        private String Leasing_Officer ;
	private double PrepaidAmount ;
	private String Period ;

    public Lease() {
    }

    public Lease(String LeaseId, String TC_No, String Clientcode, String UserId, String VehicleId, String Date, double LeaseAmount, int No_Installments, double InterestAmount, double InstallmentAmount, String Approvedby, String RecoveryOfficer, String Leasing_Officer, double PrepaidAmount, String Period) {
        this.LeaseId = LeaseId;
        this.TC_No = TC_No;
        this.Clientcode = Clientcode;
        this.UserId = UserId;
        this.VehicleId = VehicleId;
        this.Date = Date;
        this.LeaseAmount = LeaseAmount;
        this.No_Installments = No_Installments;
        this.InterestAmount = InterestAmount;
        this.InstallmentAmount = InstallmentAmount;
        this.Approvedby = Approvedby;
        this.RecoveryOfficer = RecoveryOfficer;
        this.Leasing_Officer = Leasing_Officer;
        this.PrepaidAmount = PrepaidAmount;
        this.Period = Period;
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
     * @return the TC_No
     */
    public String getTC_No() {
        return TC_No;
    }

    /**
     * @param TC_No the TC_No to set
     */
    public void setTC_No(String TC_No) {
        this.TC_No = TC_No;
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
     * @return the UserId
     */
    public String getUserId() {
        return UserId;
    }

    /**
     * @param UserId the UserId to set
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
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

    /**
     * @return the LeaseAmount
     */
    public double getLeaseAmount() {
        return LeaseAmount;
    }

    /**
     * @param LeaseAmount the LeaseAmount to set
     */
    public void setLeaseAmount(double LeaseAmount) {
        this.LeaseAmount = LeaseAmount;
    }

    /**
     * @return the No_Installments
     */
    public int getNo_Installments() {
        return No_Installments;
    }

    /**
     * @param No_Installments the No_Installments to set
     */
    public void setNo_Installments(int No_Installments) {
        this.No_Installments = No_Installments;
    }

    /**
     * @return the InterestAmount
     */
    public double getInterestAmount() {
        return InterestAmount;
    }

    /**
     * @param InterestAmount the InterestAmount to set
     */
    public void setInterestAmount(double InterestAmount) {
        this.InterestAmount = InterestAmount;
    }

    /**
     * @return the InstallmentAmount
     */
    public double getInstallmentAmount() {
        return InstallmentAmount;
    }

    /**
     * @param InstallmentAmount the InstallmentAmount to set
     */
    public void setInstallmentAmount(double InstallmentAmount) {
        this.InstallmentAmount = InstallmentAmount;
    }

    /**
     * @return the Approvedby
     */
    public String getApprovedby() {
        return Approvedby;
    }

    /**
     * @param Approvedby the Approvedby to set
     */
    public void setApprovedby(String Approvedby) {
        this.Approvedby = Approvedby;
    }

    /**
     * @return the RecoveryOfficer
     */
    public String getRecoveryOfficer() {
        return RecoveryOfficer;
    }

    /**
     * @param RecoveryOfficer the RecoveryOfficer to set
     */
    public void setRecoveryOfficer(String RecoveryOfficer) {
        this.RecoveryOfficer = RecoveryOfficer;
    }

    /**
     * @return the Leasing_Officer
     */
    public String getLeasing_Officer() {
        return Leasing_Officer;
    }

    /**
     * @param Leasing_Officer the Leasing_Officer to set
     */
    public void setLeasing_Officer(String Leasing_Officer) {
        this.Leasing_Officer = Leasing_Officer;
    }

    /**
     * @return the PrepaidAmount
     */
    public double getPrepaidAmount() {
        return PrepaidAmount;
    }

    /**
     * @param PrepaidAmount the PrepaidAmount to set
     */
    public void setPrepaidAmount(double PrepaidAmount) {
        this.PrepaidAmount = PrepaidAmount;
    }

    /**
     * @return the Period
     */
    public String getPeriod() {
        return Period;
    }

    /**
     * @param Period the Period to set
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    
   
}
