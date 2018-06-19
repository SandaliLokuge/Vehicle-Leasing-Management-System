/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.models;

/**
 *
 * @author Sandali
 */
public class LeasingOfficer {
    private String UserId;
    private String FirstName;
     private String LasttName;
      private String NIC;
      private String UserName;     
    private String Password;

    public LeasingOfficer() {
    }

    public LeasingOfficer(String UserId, String FirstName, String LasttName, String NIC, String UserName, String Password) {
        this.UserId = UserId;
        this.FirstName = FirstName;
        this.LasttName = LasttName;
        this.NIC = NIC;
        this.UserName = UserName;
        this.Password = Password;
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
     * @return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * @return the LasttName
     */
    public String getLasttName() {
        return LasttName;
    }

    /**
     * @param LasttName the LasttName to set
     */
    public void setLasttName(String LasttName) {
        this.LasttName = LasttName;
    }

    /**
     * @return the NIC
     */
    public String getNIC() {
        return NIC;
    }

    /**
     * @param NIC the NIC to set
     */
    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    /**
     * @return the UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    

}
