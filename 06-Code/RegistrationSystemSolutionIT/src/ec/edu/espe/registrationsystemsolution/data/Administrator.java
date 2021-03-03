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
public class Administrator extends Fellow {

    private String email;

    public Administrator(String email, int idCard, String names, String surnames, int telephone) {
        super(idCard, names, surnames, telephone);
        this.email = email;
    }
    

    @Override
    public String toString() {
        return "Administrator{" + " email= " + getEmail() + '}';
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

}