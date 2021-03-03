/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.data;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class Technical extends Fellow{
    
    private String role;
    private String professionalCategory;

    public Technical(String role, String professionalCategory, String idCard, String names, String surnames, int telephone) {
        super(idCard, names, surnames, telephone);
        this.role = role;
        this.professionalCategory = professionalCategory;
    }

    @Override
    public String toString() {
        return "Technical{" + "role=" + role + ", professionalCategory=" + professionalCategory + '}';
    }
    
    

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return the professionalCategory
     */
    public String getProfessionalCategory() {
        return professionalCategory;
    }

    /**
     * @param professionalCategory the professionalCategory to set
     */
    public void setProfessionalCategory(String professionalCategory) {
        this.professionalCategory = professionalCategory;
    }
    
    
}
