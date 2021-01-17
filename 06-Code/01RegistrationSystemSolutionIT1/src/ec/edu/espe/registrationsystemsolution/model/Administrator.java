/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.model;

/**
 *
 * @author Devs Java KND
 */
public class Administrator {
    private Integer idCard;
    private String names;
    private String surnames;
    private String email;
    private String nickname;
    private Integer password;

    public Administrator(Integer idCard, String names, String surnames, String email, String nickname, Integer password) {
        this.idCard = idCard;
        this.names = names;
        this.surnames = surnames;
        this.email = email;
        this.nickname = nickname;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Administrator{" + "idCard=" + idCard + ", names=" + names + ", surnames=" + surnames + ", email=" + email + ", nickname=" + nickname + ", password=" + password + '}';
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

    public String getEmail() {
        return email;
    }

    public String getNickname() {
        return nickname;
    }

    public Integer getPassword() {
        return password;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }
    
    
    
}
