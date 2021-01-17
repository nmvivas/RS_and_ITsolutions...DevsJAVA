/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.model;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class Administrator {
    
    private int idCard;
    private String names;
    private String surnames;
    private String email;
    private String nickname;
    private int password;
    
    public Administrator() {
        this.idCard = 25;
        this.names = "Charles65";
        this.surnames = "Zambrano65";
        this.email = "cdzam@espe65";
        this.nickname = "admin6565";
        this.password = 2525;
    }

    public Administrator(int idCard, String names, String surnames,
            String email, String nickname, int password) {
        this.idCard = idCard;
        this.names = names;
        this.surnames = surnames;
        this.email = email;
        this.nickname = nickname;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Administrator{" + "idCard = " + idCard + ", names = " + names + 
                ", surnames = " + surnames + ", email = " + email + ", nickname = " 
                + nickname + ", password = " + password + '}';
    }
    

    public int getIdCard() {
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

    public int getPassword() {
        return password;
    }

    public void setIdCard(int idCard) {
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

    public void setPassword(int password) {
        this.password = password;
    }
    
    
    
}
