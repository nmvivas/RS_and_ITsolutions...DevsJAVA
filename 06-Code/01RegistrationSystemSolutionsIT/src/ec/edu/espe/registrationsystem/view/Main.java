/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystem.view;

import ec.edu.espe.registrationsystem.model.MenuAdministrator;
import ec.edu.espe.registrationsystem.model.PrincipalMenu;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        
        Date date = new Date();
        System.out.println(date);
        System.out.println("");
        PrincipalMenu menu = new PrincipalMenu();
        menu.Options();
        
        
        
    }
}
