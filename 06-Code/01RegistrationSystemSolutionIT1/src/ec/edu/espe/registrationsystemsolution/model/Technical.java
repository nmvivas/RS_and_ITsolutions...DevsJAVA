/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.model;

/**
 *
 * @author karen
 */
public class Technical {
    private Integer idCard;
    private String names;
    private String surnames;
    private Integer telephone;
    private String email;
    private String role;
    private String professionalCategory;

    public Technical(Integer idCard, String names, String surnames, Integer telephone, String email, String role, String professionalCategory) {
        this.idCard = idCard;
        this.names = names;
        this.surnames = surnames;
        this.telephone = telephone;
        this.email = email;
        this.role = role;
        this.professionalCategory = professionalCategory;
    }

    @Override
    public String toString() {
        return "Technical{" + "idCard=" + idCard + ", names=" + names + ", surnames=" + surnames + ", telephone=" + telephone + ", email=" + email + ", role=" + role + ", professionalCategory=" + professionalCategory + '}';
    }
    

    public Integer getIdCard() {
        return idCard;
    }

    public String getNames() {
        return names;
    }

    public String getSurnames() {
        return surnames;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public String getProfessionalCategory() {
        return professionalCategory;
    }

    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setProfessionalCategory(String professionalCategory) {
        this.professionalCategory = professionalCategory;
    }
    
    
    
}
