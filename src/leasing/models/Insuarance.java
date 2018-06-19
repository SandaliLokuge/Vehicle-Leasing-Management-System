/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.models;

/**
 *
 * @author Sandali
 */
public class Insuarance {

        private String InsuaranceID ;
    	private String Policy_no ;			
	private String Insuarance_company ;
        private double InsuredAmount ;
        private String Insuarance_type ;
        private String Start_Date ;
	private String End_Date ;

    public Insuarance() {
    }

    public Insuarance(String InsuaranceID, String Policy_no, String Insuarance_company, double InsuredAmount, String Insuarance_type, String Start_Date, String End_Date) {
        this.InsuaranceID = InsuaranceID;
        this.Policy_no = Policy_no;
        this.Insuarance_company = Insuarance_company;
        this.InsuredAmount = InsuredAmount;
        this.Insuarance_type = Insuarance_type;
        this.Start_Date = Start_Date;
        this.End_Date = End_Date;
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
     * @return the Policy_no
     */
    public String getPolicy_no() {
        return Policy_no;
    }

    /**
     * @param Policy_no the Policy_no to set
     */
    public void setPolicy_no(String Policy_no) {
        this.Policy_no = Policy_no;
    }

    /**
     * @return the Insuarance_company
     */
    public String getInsuarance_company() {
        return Insuarance_company;
    }

    /**
     * @param Insuarance_company the Insuarance_company to set
     */
    public void setInsuarance_company(String Insuarance_company) {
        this.Insuarance_company = Insuarance_company;
    }

    /**
     * @return the InsuredAmount
     */
    public double getInsuredAmount() {
        return InsuredAmount;
    }

    /**
     * @param InsuredAmount the InsuredAmount to set
     */
    public void setInsuredAmount(double InsuredAmount) {
        this.InsuredAmount = InsuredAmount;
    }

    /**
     * @return the Insuarance_type
     */
    public String getInsuarance_type() {
        return Insuarance_type;
    }

    /**
     * @param Insuarance_type the Insuarance_type to set
     */
    public void setInsuarance_type(String Insuarance_type) {
        this.Insuarance_type = Insuarance_type;
    }

    /**
     * @return the Start_Date
     */
    public String getStart_Date() {
        return Start_Date;
    }

    /**
     * @param Start_Date the Start_Date to set
     */
    public void setStart_Date(String Start_Date) {
        this.Start_Date = Start_Date;
    }

    /**
     * @return the End_Date
     */
    public String getEnd_Date() {
        return End_Date;
    }

    /**
     * @param End_Date the End_Date to set
     */
    public void setEnd_Date(String End_Date) {
        this.End_Date = End_Date;
    }


        
}
