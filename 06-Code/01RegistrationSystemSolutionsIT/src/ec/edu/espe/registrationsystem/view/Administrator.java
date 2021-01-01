/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystem.view;

/**
 *
 * @author KAREN VELASCO, NATALIA VIVAS, CHARLES ZAMBRANO
 */
public class Administrator {
    
    private Integer idCard;
    private String name;
    private String lastName;
    private String email;
    private String nickname;
    private Integer password;

    public Administrator(Integer idCard, String name, String lastName, String email, String nickname, Integer password) {
        this.idCard = idCard;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.nickname = nickname;
        this.password = password;
    }

    public Integer getIdCard() {
        return idCard;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
