/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.models;

/**
 *
 * @author Sandali
 */
public class Payment {
    	private String Payment_no ;
	private String Receipt_no ;
	private double Total_Amount;
	private double Paid_Amount ;
	private double Balanced_Amount ;
	private String Paid_date ;
        private String type;

    public Payment() {
    }

    public Payment(String Payment_no, String Receipt_no, double Total_Amount, double Paid_Amount, double Balanced_Amount, String Paid_date, String type) {
        this.Payment_no = Payment_no;
        this.Receipt_no = Receipt_no;
        this.Total_Amount = Total_Amount;
        this.Paid_Amount = Paid_Amount;
        this.Balanced_Amount = Balanced_Amount;
        this.Paid_date = Paid_date;
        this.type = type;
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
     * @return the Receipt_no
     */
    public String getReceipt_no() {
        return Receipt_no;
    }

    /**
     * @param Receipt_no the Receipt_no to set
     */
    public void setReceipt_no(String Receipt_no) {
        this.Receipt_no = Receipt_no;
    }

    /**
     * @return the Total_Amount
     */
    public double getTotal_Amount() {
        return Total_Amount;
    }

    /**
     * @param Total_Amount the Total_Amount to set
     */
    public void setTotal_Amount(double Total_Amount) {
        this.Total_Amount = Total_Amount;
    }

    /**
     * @return the Paid_Amount
     */
    public double getPaid_Amount() {
        return Paid_Amount;
    }

    /**
     * @param Paid_Amount the Paid_Amount to set
     */
    public void setPaid_Amount(double Paid_Amount) {
        this.Paid_Amount = Paid_Amount;
    }

    /**
     * @return the Balanced_Amount
     */
    public double getBalanced_Amount() {
        return Balanced_Amount;
    }

    /**
     * @param Balanced_Amount the Balanced_Amount to set
     */
    public void setBalanced_Amount(double Balanced_Amount) {
        this.Balanced_Amount = Balanced_Amount;
    }

    /**
     * @return the Paid_date
     */
    public String getPaid_date() {
        return Paid_date;
    }

    /**
     * @param Paid_date the Paid_date to set
     */
    public void setPaid_date(String Paid_date) {
        this.Paid_date = Paid_date;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
        

        
}
