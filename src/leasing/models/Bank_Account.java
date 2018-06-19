/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.models;

/**
 *
 * @author Sandali
 */
public class Bank_Account {
    	private String Account_no;
	private String GuarantorId ;
	private String Clientcode;
	private String NameofBank ;
	private String NameofBranch ;
	private String TypeofAccount ;

    public Bank_Account() {
    }

    public Bank_Account(String Account_no, String GuarantorId, String Clientcode, String NameofBank, String NameofBranch, String TypeofAccount) {
        this.Account_no = Account_no;
        this.GuarantorId = GuarantorId;
        this.Clientcode = Clientcode;
        this.NameofBank = NameofBank;
        this.NameofBranch = NameofBranch;
        this.TypeofAccount = TypeofAccount;
    }

    /**
     * @return the Account_no
     */
    public String getAccount_no() {
        return Account_no;
    }

    /**
     * @param Account_no the Account_no to set
     */
    public void setAccount_no(String Account_no) {
        this.Account_no = Account_no;
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
     * @return the NameofBank
     */
    public String getNameofBank() {
        return NameofBank;
    }

    /**
     * @param NameofBank the NameofBank to set
     */
    public void setNameofBank(String NameofBank) {
        this.NameofBank = NameofBank;
    }

    /**
     * @return the NameofBranch
     */
    public String getNameofBranch() {
        return NameofBranch;
    }

    /**
     * @param NameofBranch the NameofBranch to set
     */
    public void setNameofBranch(String NameofBranch) {
        this.NameofBranch = NameofBranch;
    }

    /**
     * @return the TypeofAccount
     */
    public String getTypeofAccount() {
        return TypeofAccount;
    }

    /**
     * @param TypeofAccount the TypeofAccount to set
     */
    public void setTypeofAccount(String TypeofAccount) {
        this.TypeofAccount = TypeofAccount;
    }
        
}
