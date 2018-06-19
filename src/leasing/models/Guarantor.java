/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.models;

/**
 *
 * @author Sandali
 */
public class Guarantor {

    private String GuarantorId ;
    private String NIC;
    private String FirstName;
     private String LastName;
    private String DateofBirth;
    private String Tel_Home;
    private String Tel_Office;
    private String Address_Home;
    private String Address_Office;
    private String Bussiness_Occupation;
    private String Gender;

    public Guarantor() {
    }

    public Guarantor(String GuarantorId, String NIC, String FirstName, String LastName, String DateofBirth, String Tel_Home, String Tel_Office, String Address_Home, String Address_Office, String Bussiness_Occupation, String Gender) {
        this.GuarantorId = GuarantorId;
        this.NIC = NIC;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DateofBirth = DateofBirth;
        this.Tel_Home = Tel_Home;
        this.Tel_Office = Tel_Office;
        this.Address_Home = Address_Home;
        this.Address_Office = Address_Office;
        this.Bussiness_Occupation = Bussiness_Occupation;
        this.Gender = Gender;
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
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the DateofBirth
     */
    public String getDateofBirth() {
        return DateofBirth;
    }

    /**
     * @param DateofBirth the DateofBirth to set
     */
    public void setDateofBirth(String DateofBirth) {
        this.DateofBirth = DateofBirth;
    }

    /**
     * @return the Tel_Home
     */
    public String getTel_Home() {
        return Tel_Home;
    }

    /**
     * @param Tel_Home the Tel_Home to set
     */
    public void setTel_Home(String Tel_Home) {
        this.Tel_Home = Tel_Home;
    }

    /**
     * @return the Tel_Office
     */
    public String getTel_Office() {
        return Tel_Office;
    }

    /**
     * @param Tel_Office the Tel_Office to set
     */
    public void setTel_Office(String Tel_Office) {
        this.Tel_Office = Tel_Office;
    }

    /**
     * @return the Address_Home
     */
    public String getAddress_Home() {
        return Address_Home;
    }

    /**
     * @param Address_Home the Address_Home to set
     */
    public void setAddress_Home(String Address_Home) {
        this.Address_Home = Address_Home;
    }

    /**
     * @return the Address_Office
     */
    public String getAddress_Office() {
        return Address_Office;
    }

    /**
     * @param Address_Office the Address_Office to set
     */
    public void setAddress_Office(String Address_Office) {
        this.Address_Office = Address_Office;
    }

    /**
     * @return the Bussiness_Occupation
     */
    public String getBussiness_Occupation() {
        return Bussiness_Occupation;
    }

    /**
     * @param Bussiness_Occupation the Bussiness_Occupation to set
     */
    public void setBussiness_Occupation(String Bussiness_Occupation) {
        this.Bussiness_Occupation = Bussiness_Occupation;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

  
}
