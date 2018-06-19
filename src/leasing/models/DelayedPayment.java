/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.models;

/**
 *
 * @author Sandali
 */
public class DelayedPayment {
    	private String DP_Id ;
	private String Payment_no;
	private int No_of_late_days;
	private String Delay_Charge;
	private double Payable_Amount;

    public DelayedPayment() {
    }

    public DelayedPayment(String DP_Id, String Payment_no, int No_of_late_days, String Delay_Charge, double Payable_Amount) {
        this.DP_Id = DP_Id;
        this.Payment_no = Payment_no;
        this.No_of_late_days = No_of_late_days;
        this.Delay_Charge = Delay_Charge;
        this.Payable_Amount = Payable_Amount;
    }

    /**
     * @return the DP_Id
     */
    public String getDP_Id() {
        return DP_Id;
    }

    /**
     * @param DP_Id the DP_Id to set
     */
    public void setDP_Id(String DP_Id) {
        this.DP_Id = DP_Id;
    }

    /**
     * @return the Payment_no
     */
    public String getPayment_no() {
        return Payment_no;
    }

    /**
     * @param Payment_no the Payment_no to set
     */
    public void setPayment_no(String Payment_no) {
        this.Payment_no = Payment_no;
    }

    /**
     * @return the No_of_late_days
     */
    public int getNo_of_late_days() {
        return No_of_late_days;
    }

    /**
     * @param No_of_late_days the No_of_late_days to set
     */
    public void setNo_of_late_days(int No_of_late_days) {
        this.No_of_late_days = No_of_late_days;
    }

    /**
     * @return the Delay_Charge
     */
    public String getDelay_Charge() {
        return Delay_Charge;
    }

    /**
     * @param Delay_Charge the Delay_Charge to set
     */
    public void setDelay_Charge(String Delay_Charge) {
        this.Delay_Charge = Delay_Charge;
    }

    /**
     * @return the Payable_Amount
     */
    public double getPayable_Amount() {
        return Payable_Amount;
    }

    /**
     * @param Payable_Amount the Payable_Amount to set
     */
    public void setPayable_Amount(double Payable_Amount) {
        this.Payable_Amount = Payable_Amount;
    }
        
}
