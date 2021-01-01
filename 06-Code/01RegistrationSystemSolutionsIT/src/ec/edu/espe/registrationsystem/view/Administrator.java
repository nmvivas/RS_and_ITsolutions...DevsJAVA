/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystem.view;

/**
 *
 * @author NATALIA
 */
public class Administrator {
    
    private Integer cedula;
    private String name;
    private String lastName;
    private String email;
    private String nickname;
    private Integer password;

    public Administrator(Integer cedula, String name, String lastName, String email, String nickname, Integer password) {
        this.cedula = cedula;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.nickname = nickname;
        this.password = password;
    }

    
    
}
