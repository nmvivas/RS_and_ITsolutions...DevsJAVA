/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.view;

import ec.edu.espe.registrationsystemsolution.model.Administrator;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class FatherMenu {
    

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
        BaseData creationbd = new BaseData();
       

        int idCard;
        String names;
        String surnames;
        String email;
        String nickname;
        String password;
        String loginNickname;
        String loginPassword;

        boolean salir = false;
        int option;

        while (!salir) {

            option = scan.nextInt();

            switch (option) {
                case 1:
                    Administrator admin = creationbd.registAdministrator(scan);
                    creationbd.saveGson(admin);
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
        }
    }

    public void loginAdmin(Scanner scan) {
        String loginNickname;
        String loginPassword;
        System.out.println(" *-----------------------------------* ");
        System.out.print(" Enter your nickname:  ");
        loginNickname = scan.next();
        System.out.print(" Enter your password:  ");
        loginPassword = scan.next();
        
        //Login admin1 = new Login(loginNickname, loginPassword);
        //Data.find("Admin.csv", loginNickname);
        //Data.find("Admin.csv", loginPassword);
        if (loginNickname.equals("admin") && loginPassword.equals("2858")) {
            
            printAdministratorMenu();
            
        } else {
            
            System.out.println(" ********  Incorrect password, exited the system   ********** ");
            System.exit(0);
        }
    }

    public void administratorOptions() {
        BaseData creationbd = new BaseData();
        Scanner scan = new Scanner(System.in);
        boolean salir = false;
        int option;

        while (!salir) {
            try {
                option = scan.nextInt();
                scan.nextLine();
                switch (option) {

                    case 1:

                        creationbd.registClient(scan);

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
            } catch (Exception ex) {
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
