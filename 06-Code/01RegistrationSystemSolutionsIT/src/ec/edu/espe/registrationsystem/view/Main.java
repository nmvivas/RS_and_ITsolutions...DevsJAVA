/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystem.view;

import ec.edu.espe.registrationsystem.model.Administrator;
import ec.edu.espe.registrationsystem.model.Login;
import ec.edu.espe.registrationsystem.model.MenuAdministrator;
import ec.edu.espe.registrationsystem.model.PrincipalMenu;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Date date = new Date();
        System.out.println(date);
        System.out.println("");

        Scanner scan = new Scanner(System.in);

        boolean salir = false;
        int option;

        while (!salir) {

            System.out.println(" ================*=====================*=====================*=============================");
            System.out.println("                         WELCOME TO REGISTRATION SYSTEM SOLUTION IT                   ");
            System.out.println("                           ---------  Principal menu --------- ");
            System.out.println(" \n please , choose a option to continue... \n");
            System.out.println(" ---> Select 1 :  Create a user administrator ");
            System.out.println(" ---> Select 2 :  Login ");
            System.out.println(" ---> Select 3 :  Exit ");
            System.out.println(" ================*=====================*=====================*=============================");

            try {

                option = scan.nextInt();

                switch (option) {
                    case 1:
                        Administrator admin = new Administrator();
                        break;

                    case 2:
                        Login login = new Login();
                        login.enterSystem();
                        break;

                    case 3:
                        System.out.println(" ****** Thanks you for use our system *******");
                        System.exit(0);
                        break;

                    default:
                        System.out.println(" The opcion have to be between 1 and 3 ");
                }
            } catch (Exception ex) {
                System.out.println(" You have to put a number ");
                scan.next();
            }
        }
    }

}
