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
public class Login {
    
    private Administrator administrator;

    public Login(Administrator administrator) {
        
        this.administrator = administrator;
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
 