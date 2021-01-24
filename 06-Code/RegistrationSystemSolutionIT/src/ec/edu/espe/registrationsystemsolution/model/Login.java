/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.model;

/**
 *The methods described in the class diagram are missing
 * @author DEVS_JAVA_KND
 */
public class Login {
    
    private String nickname;
    private String password;

    @Override
    public String toString() {
        return "Login{" + "nickname = " + getNickname() + ", password = " +
                getPassword() + '}';
    }

    public Login(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
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
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    } 


    
}
