/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.data;

import com.mongodb.BasicDBObject;
import ec.edu.espe.filemanager.utils.Data;
import java.util.Scanner;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class Fellow {

    int idCard;
    String name;
    String surname;
    int telephone;

    public Fellow(int idCard, String names, String surnames, int telephone) {
        this.idCard = idCard;
        this.name = names;
        this.surname = surnames;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Fellow{" + "idCard=" + idCard + ", names=" + name
                + ", surnames=" + surname + ", telephone=" + telephone + '}';
    }


    /**
     * @return the idCard
     */
    public int getIdCard() {
        return idCard;
    }

    /**
     * @param idCard the idCard to set
     */
    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

}
