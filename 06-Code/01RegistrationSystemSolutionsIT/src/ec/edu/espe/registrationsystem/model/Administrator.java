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

    public Administrator(Integer idCard, String firstnames, String surnames, String email, String nickname, Integer password) {
        
        this.idCard = idCard;
        this.firstnames = firstnames;
        this.surnames = surnames;
        this.email = email;
        this.nickname = nickname;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Administrator{" + "cedula=" + getCedula() + ", nombres=" 
                + getNombres() + ", apellidos=" + getApellidos() + ", email=" 
                + getEmail() + ", nickname=" + getNickname() + ", password=" 
                + getPassword() + '}';
    }
    
    /**
     * @return the cedula
     */
    public Integer getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
