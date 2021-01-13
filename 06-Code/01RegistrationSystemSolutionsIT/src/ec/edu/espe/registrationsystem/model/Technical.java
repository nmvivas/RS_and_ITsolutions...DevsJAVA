/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystem.model;

import java.util.Scanner;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class Technical {
    
    private Integer idCard;
    private String firstnames;
    private String surnames;
    private Integer telephone;
    private String email;
    private String role;
    private String professionalCategory;
    
    public Technical(){
        
    }

    public Technical(Integer idCard, String firstnames, String surnames, 
            Integer telephone, String email, String role, 
            String professionalCategory) {
        this.idCard = idCard;
        this.firstnames = firstnames;
        this.surnames = surnames;
        this.telephone = telephone;
        this.email = email;
        this.role = role;
        this.professionalCategory = professionalCategory;
    }
    
    public void registechnical(){
       
        Scanner enterData = new Scanner(System.in);
        System.out.println(" Regist Technicial \n");
        System.out.println(" Enter your Id Card: ");
        idCard = enterData.nextInt();
        System.out.println(" Enter your Firt Names:  ");
        firstnames = enterData.nextLine();
        System.out.println(" Enter your Surnames:  ");
        surnames = enterData.nextLine();
        System.out.println(" Enter your telephone:  ");
        telephone = enterData.nextInt();
        System.out.println(" Enter your email:  ");
        email = enterData.nextLine();
        System.out.println(" Enter your role:  ");
        role = enterData.nextLine();
        System.out.println(" Enter your professional category:  ");
        professionalCategory = enterData.nextLine();
        
    }
    @Override
    public String toString() {
        return "Technical{" + "idCard=" + idCard + ", firstnames=" + firstnames +
                ", surnames=" + surnames + ", telephone=" + telephone +
                ", email=" + email + ", role=" + role + ", professionalCategory=" + 
                professionalCategory + '}';
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

    public String getFirstnames() {
        return firstnames;
    }

    public void setFirstnames(String firstnames) {
        this.firstnames = firstnames;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
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
