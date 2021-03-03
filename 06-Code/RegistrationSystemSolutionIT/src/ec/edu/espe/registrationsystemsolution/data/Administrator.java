/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.data;

import com.mongodb.BasicDBObject;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class Administrator {

    private String email;
    private String idCard;
    private String names;
    private String surnames;
    private int telephone;

    public Administrator(String email, String idCard, String names, String surnames, int telephone) {
        this.email = email;
        this.idCard = idCard;
        this.names = names;
        this.surnames = surnames;
        this.telephone = telephone;
    }
    
    public Administrator(BasicDBObject admin1){
        names = admin1.getString("Names");
        surnames = admin1.getString("surnames");
        idCard = admin1.getString("idCard");
        
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
     * @return the idCard
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * @param idCard the idCard to set
     */
    public void setIdCard(String idCard) {
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
     * @return the surnames
     */
    public String getSurnames() {
        return surnames;
    }

    /**
     * @param surnames the surnames to set
     */
    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}
