/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystem.model;

import ec.edu.espe.filemanager.utils.Data;
import java.util.Scanner;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class Technical {

    private Integer idCard;
    private String names;
    private String surnames;
    private Integer telephone;
    private String email;
    private String role;
    private String professionalCategory;

    public Technical() {

        Scanner enterData = new Scanner(System.in);

        System.out.println(" ===========================  REGISTER TECHNICAL ======================== \n");
        System.out.println(" \n ---> Enter your Id Card: ");
        idCard = enterData.nextInt();
        System.out.println("\n --->  Enter your Names:  ");
        names = enterData.nextLine();
        System.out.println(" \n ---> Enter your Surnames:  ");
        surnames = enterData.nextLine();
        System.out.println(" \n ---> Enter your Telephone:  ");
        telephone = enterData.nextInt();
        System.out.println("\n --->  Enter your Email:  ");
        email = enterData.nextLine();
        System.out.println("\n --->  Enter your Role:  ");
        role = enterData.nextLine();
        System.out.println("\n --->  Enter your professional category:  ");
        professionalCategory = enterData.nextLine();

        String dataToSave = toString();

        Data.save("Technical.csv", dataToSave);

    }
    
    @Override
    public String toString() {
        return "Technical{" + "idCard = " + idCard + ", names = " + names
                + ", surnames = " + surnames + ", telephone = " + telephone
                + ", email = " + email + ", role = " + role + ", professionalCategory = "
                + professionalCategory + '}';
    }

    public Technical(Integer idCard, String names, String surnames, Integer telephone, String email, String role, String professionalCategory) {

        this.idCard = idCard;
        this.names = names;
        this.surnames = surnames;
        this.telephone = telephone;
        this.email = email;
        this.role = role;
        this.professionalCategory = professionalCategory;
    }

    

    public void saveTechical() {

    }

    public void assignProblem() {

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

    public String getNames() {
        return names;
    }

    public void setNames(String firstnames) {
        this.names = names;
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
