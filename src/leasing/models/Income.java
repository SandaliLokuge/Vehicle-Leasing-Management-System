/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.models;

/**
 *
 * @author Sandali
 */
public class Income {
    	private String IncomeId ;
	private String GuarantorId ;
	private String Clientcode;
	private String Source;
	private double Income_per_month ;

    public Income() {
    }

    public Income(String IncomeId, String GuarantorId, String Clientcode, String Source, double Income_per_month) {
        this.IncomeId = IncomeId;
        this.GuarantorId = GuarantorId;
        this.Clientcode = Clientcode;
        this.Source = Source;
        this.Income_per_month = Income_per_month;
    }

    /**
     * @return the IncomeId
     */
    public String getIncomeId() {
        return IncomeId;
    }

    /**
     * @param IncomeId the IncomeId to set
     */
    public void setIncomeId(String IncomeId) {
        this.IncomeId = IncomeId;
    }

    /**
     * @return the GuarantorId
     */
    public String getGuarantorId() {
        return GuarantorId;
    }

    /**
     * @param GuarantorId the GuarantorId to set
     */
    public void setGuarantorId(String GuarantorId) {
        this.GuarantorId = GuarantorId;
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
     * @return the Source
     */
    public String getSource() {
        return Source;
    }

    /**
     * @param Source the Source to set
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * @return the Income_per_month
     */
    public double getIncome_per_month() {
        return Income_per_month;
    }

    /**
     * @param Income_per_month the Income_per_month to set
     */
    public void setIncome_per_month(double Income_per_month) {
        this.Income_per_month = Income_per_month;
    }
        
}
