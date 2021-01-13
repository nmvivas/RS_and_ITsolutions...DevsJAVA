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
public class Administrator {

    private Integer idCard;
    private String names;
    private String surnames;
    private String email;
    private String nickname;
    private Integer password;

    public Administrator() {

        Scanner enterData = new Scanner(System.in);

        System.out.println(" ==========================   REGIST ADMINISTRATOR ==========================================  \n");
        System.out.println("\n ---> Enter your number Id: ");
        idCard = enterData.nextInt();
        System.out.println("\n ---> Enter your Names:     ");
        names = enterData.next();
        System.out.println("\n ---> Enter your Surnames:  ");
        surnames = enterData.next();
        System.out.println("\n ---> Enter your email:     ");
        email = enterData.next();
        System.out.println("\n ---> Enter your nickname:  ");
        nickname = enterData.next();
        System.out.println("\n --->Enter your password:   ");
        password = enterData.nextInt();

        String dataToSave = toString();
        Data.save("administrator.csv", dataToSave);
    }

    @Override
    public String toString() {
        return "Administrator{" + "idCard = " + idCard + ", names = " 
                + names + ", surnames = " + surnames + ", email = " + email 
                + ", nickname = " + nickname + ", password = " + password + '}';
    }

    public Administrator(Integer idCard, String names, String surnames,
            String email, String nickname, Integer password) {

        this.idCard = idCard;
        this.names = names;
        this.surnames = surnames;
        this.email = email;
        this.nickname = nickname;
        this.password = password;
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
     * @return the firstnames
     */
    public String getNames() {
        return names;
    }

    /**
     * @param firstnames the firstnames to set
     */
    public void setNames(String firstnames) {
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
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return the password
     */
    public Integer getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(Integer password) {
        this.password = password;
    }

}
