/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.view;

import ec.edu.espe.registrationsystemsolution.model.PrincipalMenu;
import ec.edu.espe.registrationsystemsolution.model.Administrator;
import ec.edu.espe.registrationsystemsolution.model.Login;
import ec.edu.espe.registrationsystemsolution.model.Problem;
import ec.edu.espe.registrationsystemsolution.model.Client;
import ec.edu.espe.registrationsystemsolution.model.ListClient;
import ec.edu.espe.registrationsystemsolution.model.ListProblem;
import ec.edu.espe.registrationsystemsolution.model.Technical;
import ec.edu.espe.registrationsystemsolution.model.TypeProblem;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

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
        Main main = new Main();
        main.Options();
    }

    public void Options() throws IOException, InterruptedException {

        Scanner scan = new Scanner(System.in);

        boolean salir = false;
        int option;

        while (!salir) {

            try {

                option = scan.nextInt();

                switch (option) {
                    case 1:

                        System.out.println(" ==========================   REGIST ADMINISTRATOR ==========================================  \n");
                        System.out.println("\n ---> Enter your number Id: ");
                        int idCard = scan.nextInt();
                        System.out.println("\n ---> Enter your Names:     ");
                        String names = scan.next();
                        System.out.println("\n ---> Enter your Surnames:  ");
                        String surnames = scan.next();
                        System.out.println("\n ---> Enter your email:     ");
                        String email = scan.next();
                        System.out.println("\n ---> Enter your nickname:  ");
                        String nickname = scan.next();
                        System.out.println("\n ---> Enter your password:   ");
                        int password = scan.nextInt();

                        Administrator admin = new Administrator(idCard, names, surnames, email, nickname, password);
                        System.out.println(admin);

                        break;

                    case 2:

                        System.out.println(" Enter your data ");
                        System.out.println(" Enter your nickname:  ");
                        String loginNickname = scan.next();
                        System.out.println(" Enter your password:  ");
                        int loginPassword = scan.nextInt();

                        Login login = new Login(loginNickname, loginPassword);
                        System.out.println(login);

                        System.out.println(" ================*=====================*=====================*======================");
                        System.out.println("                            WELCOME TO REGISTRATION SYSTEM SOLUTION IT              ");
                        System.out.println("                              ------- Administrator menu --------- ");
                        System.out.println(" \n please , choose a option to continue... \n");
                        System.out.println(" --> Select 1 : Regist Problem  ");
                        System.out.println(" --> Select 2 : Regist Client  ");
                        System.out.println(" --> Select 3 : Regist Technical  ");
                        System.out.println(" --> Select 4 : Back to Principal Menu  ");
                        System.out.println(" ================*=====================*=====================*====================== \n ");

                        Main main = new Main();
                        main.administratorMenu();

                        break;

                    case 3:
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

    public void administratorMenu() {

        Scanner scan = new Scanner(System.in);

        boolean salir = false;
        int option;

        while (!salir) {
            try {
                option = scan.nextInt();
                switch (option) {
                    case 1:

                        System.out.println(" ================================== REGIST PROBLEM  ================================= ");
                        System.out.println("");
                        System.out.println(" ---> Enter description of problem:  ");
                        String description = scan.next();
                        System.out.println(" ---> Enter the type of the problem: ");
                        String typeProblem = scan.next();
                        System.out.println(" ---> Enter the state of the problem:  ");
                        String state = scan.next();

                        Problem problem = new Problem(description, typeProblem, state);
                        System.out.println(problem);

                        //ARREGLAR SALTO DE LINEA DEL REGIST PROBLEM
                        break;
                    case 2:

                        System.out.println(" =================================  REGIST CLIENT ====================================== \n");
                        System.out.println("\n ---> Enter the Company:  ");
                        String company = scan.next();
                        System.out.println(" \n ---> Enter names:  ");
                        String names = scan.next();
                        System.out.println(" \n ---> Enter your Id Card Ruc:  ");
                        int idCardRuc = scan.nextInt();
                        System.out.println(" \n ---> Enter your address:  ");
                        String address = scan.next();
                        System.out.println(" \n ---> Enter your telephone:  ");
                        int telephone = scan.nextInt();
                        
                        Client client = new Client(company, names, telephone, address, telephone);
                        System.out.println(client);

                        break;
                    case 3:

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
