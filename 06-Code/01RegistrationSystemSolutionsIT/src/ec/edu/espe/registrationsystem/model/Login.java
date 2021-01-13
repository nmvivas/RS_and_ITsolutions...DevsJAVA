/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystem.model;

import java.util.Scanner;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class Login {
    
    private Administrator administrator;
    private String nickname;
    private int password;

    public Login() {
        
    }
    public void enterTheSystem(){
        Scanner enterData = new Scanner(System.in);
        System.out.println(" Enter your nick name:  ");
        nickname = enterData.nextLine();
        System.out.println(" Enter your password:  ");
        password = enterData.nextInt();
        MenuAdministrator menuadmin = new MenuAdministrator();
        menuadmin.administratorMenu();
        
    }
    
    
    @Override
    public String toString() {
        return "Login{" + "administrator=" + getAdministrator() + '}';
    }
    
        
    public void verificationAdmin(){
        
    }

    /**
     * @return the administrator
     */
    public Administrator getAdministrator() {
        return administrator;
    }

    /**
     * @param administrator the administrator to set
     */
    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }
    
    
    

    
}
 