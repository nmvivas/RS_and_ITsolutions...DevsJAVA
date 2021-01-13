/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystem.model;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class MenuAdministrator {

    public MenuAdministrator() {
    }

    public void administratorMenu() {
        Scanner scan = new Scanner(System.in);

        boolean salir = false;
        int option;

        while (!salir) {
            System.out.println(" ================*=====================*=====================*======================");
            System.out.println("                            WELCOME TO REGISTRATION SYSTEM SOLUTION IT              ");
            System.out.println("                              ------- Administrator menu --------- ");
            System.out.println(" \n please , choose a option to continue... \n");
            System.out.println(" --> Select 1 : Regist Problem  ");
            System.out.println(" --> Select 2 : Regist Client  ");
            System.out.println(" --> Select 3 : Regist Technical  ");
            System.out.println(" --> Select 4 : Back to Principal Menu  ");
            System.out.println(" ================*=====================*=====================*====================== \n ");

            try {
                option = scan.nextInt();
                switch (option) {
                    case 1:
                        Problem problem = new Problem();
                        break;
                    case 2:
                        Client client = new Client();
                        break;
                    case 3:
                        Technical technical = new Technical();        
                    case 4:
                        PrincipalMenu menu = new PrincipalMenu();
                        menu.Options(); 
                    default:
                        System.out.println(" The opcion have to be between 1 and 4 ");
                }
            } catch (Exception ex) {
                System.out.println(" You have to put a number ");
                scan.next();
            }
        }
    }

}
