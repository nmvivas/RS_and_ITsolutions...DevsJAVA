/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.model;

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
    

    public String getEmail() {
        return email;
    }

   
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getIdCard() {
        return idCard;
    }

   
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    
    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    
    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public int getTelephone() {
        return telephone;
    }

 
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

 
}
