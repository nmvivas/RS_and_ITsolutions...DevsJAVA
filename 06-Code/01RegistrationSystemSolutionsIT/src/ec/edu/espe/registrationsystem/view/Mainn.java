/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystem.view;

import ec.edu.espe.registrationsystem.model.MenuAdministrator;
import ec.edu.espe.registrationsystem.model.Principal;
import java.util.Date;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class Mainn {
    public static void main(String[] args) {
        
        Date date = new Date();
        System.out.println(date);
        
        Principal menu = new Principal();
        menu.Options();
        
        
        
    }
}
