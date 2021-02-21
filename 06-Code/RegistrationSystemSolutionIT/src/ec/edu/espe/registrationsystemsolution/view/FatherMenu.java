/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.view;

import ec.edu.espe.registrationsystemsolution.model.Administrator;
import ec.edu.espe.registrationsystemsolution.model.Login;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class FatherMenu implements Login {

    public void printWelcomeMenu() {
        System.out.println(" ================*=====================*=====================*=============================");
        System.out.println("                         WELCOME TO REGISTRATION SYSTEM SOLUTION IT                   ");
        System.out.println("                           ---------  Principal menu --------- ");
        System.out.println(" \n please , choose a option to continue... \n");
        System.out.println(" ---> Select 1 :  Create a user administrator ");
        System.out.println(" ---> Select 2 :  Login ");
        System.out.println(" ---> Select 3 :  Exit ");
        System.out.println(" ================*=====================*=====================*=============================");
    }

    public void printAdministratorMenu() {
        System.out.println(" ================*=====================*=====================*======================");
        System.out.println("                            WELCOME TO REGISTRATION SYSTEM SOLUTION IT              ");
        System.out.println("                              ------- Administrator menu --------- ");
        System.out.println(" \n please , choose a option to continue... ");
        System.out.print("\n--> Select 1 : Regist Client   ");
        System.out.print("\n--> Select 2 : Regist Problem  ");
        System.out.print("\n--> Select 3 : Regist Technical  ");
        System.out.print("\n--> Select 4 : Back to Principal Menu  ");
        System.out.print("\n ================*=====================*=====================*====================== \n ");
        administratorOptions();
    }

    public void welcomeOptions() throws IOException, InterruptedException {

        Scanner scan = new Scanner(System.in);
        BaseData dataBase = new BaseData();

        boolean salir = false;
        int option;

        while (!salir) {

            option = scan.nextInt();
            try {
                switch (option) {
                    case 1:
                        Administrator admin = dataBase.registAdministrator(scan);
                        continueKey(scan);
                        printWelcomeMenu();
                        break;

                    case 2:
                        loginAdmin(scan);
                        break;

                    case 3:
                        System.exit(0);
                        break;

                    default:
                        System.out.println(" The opcion have to be between 1 and 3 ");
                }
            } catch (InputMismatchException ex) {
                System.out.println("You have tu put a number");
                scan.next();
            }
        }
    }

    public void loginAdmin(Scanner scan) {
        String loginNickname = "";
        String loginPassword = "";
        int attempts = -1;
        int maximum = 2;
        
        while (!loginNickname.equals("Admin")  || !loginPassword.equals("2858") && (attempts < maximum)) {
            System.out.println(" *-----------------------------------* ");
            attempts++;
            System.out.println("ENter de nickname");
            loginNickname = scan.next();
            System.out.println("Enter the password");
            loginPassword = scan.next();

            if (attempts == 2) {
                System.out.println(" ********  Incorrect password or user , exited the system   ********** ");
                System.exit(0);
            }
            if  ((loginNickname.equals("Admin")  && loginPassword.equals("2858") && (attempts < maximum)) == true) {
                printAdministratorMenu();
            }
 
            
        }

    }

    public void administratorOptions() {
        BaseData creationbd = new BaseData();
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        int option;

        while (!exit) {
            try {
                option = scan.nextInt();
                scan.nextLine();
                switch (option) {

                    case 1:

                        creationbd.registCustomer(scan);

                        break;

                    case 2:

                        creationbd.registProblem(scan);

                        break;

                    case 3:

                        creationbd.registTechnical(scan);

                        break;

                    case 4:

                        printWelcomeMenu();
                        welcomeOptions();

                        break;

                    default:
                        System.out.println(" The opcion have to be between 1 and 4 ");
                }
            } catch (IOException | InterruptedException ex) {
                System.out.println(" You have to put a number ");
                scan.next();
            }
        }
    }

    public void continueKey(Scanner scan) {
        System.out.println(" press any key to continue... ");
        String key = scan.next();
        printAdministratorMenu();
        administratorOptions();
    }

}
