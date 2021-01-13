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
public class Administrator {
    
    private Integer idCard;
    private String firstnames;
    private String surnames;
    private String email;
    private String nickname;
    private Integer password;

    public Administrator(Integer idCard, String firstnames, String surnames, 
            String email, String nickname, Integer password) {
        
        this.idCard = idCard;
        this.firstnames = firstnames;
        this.surnames = surnames;
        this.email = email;
        this.nickname = nickname;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Administrator{" + "idCard=" + getIdCard() + ", firstnames=" 
                + getFirstnames() + ", surnames=" + getSurnames() + ", email=" + 
                getEmail() + ", nickname=" + getNickname() + ", password=" + 
                getPassword() + '}';
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
    public String getFirstnames() {
        return firstnames;
    }

    /**
     * @param firstnames the firstnames to set
     */
    public void setFirstnames(String firstnames) {
        this.firstnames = firstnames;
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
