/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.models;

/**
 *
 * @author Sandali
 */
public class Aries {
    	private String AriesId;
	private String Payment_no ;
	private double Aries_Amount;
	private double Aries_Charge;

    public Aries() {
    }

    public Aries(String AriesId, String Payment_no, double Aries_Amount, double Aries_Charge) {
        this.AriesId = AriesId;
        this.Payment_no = Payment_no;
        this.Aries_Amount = Aries_Amount;
        this.Aries_Charge = Aries_Charge;
    }

    /**
     * @return the AriesId
     */
    public String getAriesId() {
        return AriesId;
    }

    /**
     * @param AriesId the AriesId to set
     */
    public void setAriesId(String AriesId) {
        this.AriesId = AriesId;
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
     * @return the Aries_Amount
     */
    public double getAries_Amount() {
        return Aries_Amount;
    }

    /**
     * @param Aries_Amount the Aries_Amount to set
     */
    public void setAries_Amount(double Aries_Amount) {
        this.Aries_Amount = Aries_Amount;
    }

    /**
     * @return the Aries_Charge
     */
    public double getAries_Charge() {
        return Aries_Charge;
    }

    /**
     * @param Aries_Charge the Aries_Charge to set
     */
    public void setAries_Charge(double Aries_Charge) {
        this.Aries_Charge = Aries_Charge;
    }
        
}
