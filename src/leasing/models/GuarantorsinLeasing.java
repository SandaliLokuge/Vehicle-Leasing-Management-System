/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.models;

/**
 *
 * @author Sandali
 */
public class GuarantorsinLeasing {
    	private String GL_Id ;
	private String GuarantorId ;
	private String LeaseId ;

    public GuarantorsinLeasing() {
    }

    public GuarantorsinLeasing(String GL_Id, String GuarantorId, String LeaseId) {
        this.GL_Id = GL_Id;
        this.GuarantorId = GuarantorId;
        this.LeaseId = LeaseId;
    }

    /**
     * @return the GL_Id
     */
    public String getGL_Id() {
        return GL_Id;
    }

    /**
     * @param GL_Id the GL_Id to set
     */
    public void setGL_Id(String GL_Id) {
        this.GL_Id = GL_Id;
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
        
}
