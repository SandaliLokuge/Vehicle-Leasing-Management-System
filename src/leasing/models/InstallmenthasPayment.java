/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.models;

/**
 *
 * @author Sandali
 */
public class InstallmenthasPayment {
    	private String Payment_no ;
	private String InstallmentId ;
	private String IP_Id ;

    public InstallmenthasPayment() {
    }

    public InstallmenthasPayment(String Payment_no, String InstallmentId, String IP_Id) {
        this.Payment_no = Payment_no;
        this.InstallmentId = InstallmentId;
        this.IP_Id = IP_Id;
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
     * @return the IP_Id
     */
    public String getIP_Id() {
        return IP_Id;
    }

    /**
     * @param IP_Id the IP_Id to set
     */
    public void setIP_Id(String IP_Id) {
        this.IP_Id = IP_Id;
    }
        
        
}
