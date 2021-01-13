/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystem.model;

/**
 *
 * @author NATALIA
 */
public class Technical {
    private Integer idCard;
    private String names;
    private String lastnames;
    private Integer telephone;
    private String email;
    private String role;
    private String professionalCategory;

    public Technical(Integer idCard, String names, String lastnames, Integer telephone, String email, String role, String professionalCategory) {
        this.idCard = idCard;
        this.names = names;
        this.lastnames = lastnames;
        this.telephone = telephone;
        this.email = email;
        this.role = role;
        this.professionalCategory = professionalCategory;
    }

    @Override
    public String toString() {
        return "Technical{" + "idCard=" + getIdCard() + ", names=" + getNames() + ", lastnames=" + getLastnames() + ", telephone=" + getTelephone() + ", email=" + getEmail() + ", role=" + getRole() + ", professionalCategory=" + getProfessionalCategory() + '}';
    }
    
     
    public void saveTechical(){
        
    }
    
    public void assignProblem(){
        
    }

    /**
     * @return the idCard
     */
    public Integer getIdCard() {
        return idCard;
    }

    /**
     * @param idCard the idCard to set
     */
    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    /**
     * @return the names
     */
    public String getNames() {
        return names;
    }

    /**
     * @param names the names to set
     */
    public void setNames(String names) {
        this.names = names;
    }

    /**
     * @return the lastnames
     */
    public String getLastnames() {
        return lastnames;
    }

    /**
     * @param lastnames the lastnames to set
     */
    public void setLastnames(String lastnames) {
        this.lastnames = lastnames;
    }

    /**
     * @return the telephone
     */
    public Integer getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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
