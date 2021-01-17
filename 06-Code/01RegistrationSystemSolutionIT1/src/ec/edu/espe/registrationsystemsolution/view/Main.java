/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.view;

import ec.edu.espe.registrationsystemsolution.model.PrincipalMenu;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author karen
 */
public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Date date = new Date();
        
        System.out.println(date + "\n");
        System.out.println(" ================*=====================*=====================*=============================");
        System.out.println("                         WELCOME TO REGISTRATION SYSTEM SOLUTION IT                   ");
        System.out.println("                           ---------  Principal menu --------- ");
        System.out.println(" \n please , choose a option to continue... \n");
        System.out.println(" ---> Select 1 :  Create a user administrator ");
        System.out.println(" ---> Select 2 :  Login ");
        System.out.println(" ---> Select 3 :  Exit ");
        System.out.println(" ================*=====================*=====================*=============================");
        PrincipalMenu principalMenu = new PrincipalMenu();
        principalMenu.Options();
        
        
        
   
    }

}
