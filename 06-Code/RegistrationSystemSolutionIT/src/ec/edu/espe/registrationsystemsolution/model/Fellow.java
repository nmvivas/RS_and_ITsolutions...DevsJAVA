/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.model;

import ec.edu.espe.filemanager.utils.Data;
import java.util.Scanner;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class Fellow {

    private int idCard;
    private String names;
    private String surnames;
    private int telephone;


    public Fellow(int idCard, String names, String surnames, int telephone) {
        this.idCard = idCard;
        this.names = names;
        this.surnames = surnames;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Fellow{" + "idCard=" + idCard + ", names=" + names
                + ", surnames=" + surnames + ", telephone=" + telephone + '}';
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

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
}
