/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.view;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.registrationsystemsolution.model.Administrator;
import ec.edu.espe.registrationsystemsolution.model.Login;
import ec.edu.espe.registrationsystemsolution.model.Problem;
import ec.edu.espe.registrationsystemsolution.model.Client;
import ec.edu.espe.registrationsystemsolution.model.ListClient;
import ec.edu.espe.registrationsystemsolution.model.ListProblem;
import ec.edu.espe.registrationsystemsolution.model.Technical;
import ec.edu.espe.registrationsystemsolution.model.TypeProblem;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Date date = new Date();
        System.out.println(date + "\n");
        printWelcomeMenu();
        Main main = new Main();
        main.welcomeOptions();

    }

    private static void printWelcomeMenu() {
        System.out.println(" ================*=====================*=====================*=============================");
        System.out.println("                         WELCOME TO REGISTRATION SYSTEM SOLUTION IT                   ");
        System.out.println("                           ---------  Principal menu --------- ");
        System.out.println(" \n please , choose a option to continue... \n");
        System.out.println(" ---> Select 1 :  Create a user administrator ");
        System.out.println(" ---> Select 2 :  Login ");
        System.out.println(" ---> Select 3 :  Exit ");
        System.out.println(" ================*=====================*=====================*=============================");
    }

    public void welcomeOptions() throws IOException, InterruptedException {

        Scanner scan = new Scanner(System.in);

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
                    Administrator admin = registAdministrator(scan);
                    saveGson(admin);
                    System.out.println(" presione una tecla para continuar... ");
                    String key = scan.next();
                    printWelcomeMenu();
                    break;

                case 2:

                    System.out.println(" *-----------------------------------* ");
                    System.out.print(" Enter your nickname:  ");
                    loginNickname = scan.next();
                    System.out.print(" Enter your password:  ");
                    loginPassword = scan.next();

                    //Login admin1 = new Login(loginNickname, loginPassword);
                    //Data.find("Admin.csv", loginNickname);
                    //Data.find("Admin.csv", loginPassword);
                    if (loginNickname.equals("admin") && loginPassword.equals("2858soporte")) {

                        printAdministratorMenu();

                    } else {

                        System.out.println(" ********  Incorrect password, exited the system   ********** ");
                        System.exit(0);
                    }
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println(" The opcion have to be between 1 and 3 ");
            }
        }
    }

    private Administrator registAdministrator(Scanner scan) {
        int idCard;
        String names;
        String surnames;
        String email;
        System.out.print(" ==========================   REGIST ADMINISTRATOR ========================================== \n");
        System.out.print("---> Enter your number Id: ");
        idCard = scan.nextInt();
        scan.nextLine();
        System.out.print("---> Enter your Names: ");
        names = scan.nextLine();
        System.out.print("---> Enter your Surnames: ");
        surnames = scan.nextLine();
        System.out.print("---> Enter your email:  ");
        email = scan.nextLine();
        System.out.println("\n****  your assigned user is: admin and your password is: 2858soporte **** ");
        Administrator admin = new Administrator(idCard, names, surnames, email, "admin", "2858soporte");
        System.out.println("----- SUCCESSFUL REGISTRATION  --- ");
        return admin;
    }

    private void saveGson(Administrator admin) {

        Gson gsonAdmin = new Gson();
        String adminString;

        adminString = gsonAdmin.toJson(admin);
        Data.save("Admin.csv", adminString + "\n");

        Administrator administrator1;
        String jsonString = adminString;
        administrator1 = gsonAdmin.fromJson(jsonString, Administrator.class);

    }

    private void printAdministratorMenu() {
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

    public void administratorOptions() {

        Scanner scan = new Scanner(System.in);
        boolean salir = false;
        int option;

        while (!salir) {
            try {
                option = scan.nextInt();
                scan.nextLine();
                switch (option) {

                    case 1:

                        registClient(scan);

                        break;

                    case 2:

                        registProblem(scan);

                        break;

                    case 3:

                        registTechnical(scan);

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

    private void registTechnical(Scanner scan) {
        System.out.println(" ===========================  REGISTER TECHNICAL ======================== \n");
        System.out.print("---> Enter your Id Card: ");
        int idCard = scan.nextInt();
        scan.nextLine();
        System.out.print("---> Enter your Names: ");
        String techNames = scan.nextLine();
        System.out.print("---> Enter your Surnames: ");
        String surnames = scan.nextLine();
        System.out.print("---> Enter your Telephone: ");
        int techTelephone = scan.nextInt();
        scan.nextLine();
        System.out.print("---> Enter your Email: ");
        String email = scan.nextLine();
        System.out.print("---> Enter your Role: ");
        String role = scan.nextLine();
        System.out.print("---> Enter your professional category: ");
        String professionalCategory = scan.nextLine();

        List technicals;
        technicals = new ArrayList();
        technicals.add(new Technical(idCard, techNames,
                surnames, techTelephone, email, role, professionalCategory));
        System.out.println("----- SUCCESSFUL REGISTRATION  --- ");

        Gson gsonTechnicals = new Gson();
        String technicalsString;
        technicalsString = gsonTechnicals.toJson(technicals);
        Data.save("Technicals.gson", technicalsString + "\n");

        System.out.println(" presione una tecla para continuar... ");
        String key = scan.next();
        printAdministratorMenu();
        administratorOptions();

    }

    private void registProblem(Scanner scan) {
        System.out.println(" ================================== REGIST PROBLEM  ================================= ");
        System.out.println("");
        System.out.println("--->Enter description of problem: ");
        String description = scan.nextLine();
        System.out.println("--->Enter the type of the problem: ");
        String typeProblem = scan.nextLine();
        System.out.println("---> Enter the state of the problem: ");
        String state = scan.nextLine();

        Problem problem = new Problem(description, typeProblem, state);
        System.out.println("----- SUCCESSFUL REGISTRATION  --- ");

        List problems;
        problems = new ArrayList();
        problems.add(new Problem(description, typeProblem, state + "\n"));

        Gson gsonProblems = new Gson();
        String problemsString;

        problemsString = gsonProblems.toJson(problems);
        Data.save("Problems.gson", problemsString + "\n");

        System.out.println(" presione una tecla para continuar... ");
        String key = scan.next();
        printAdministratorMenu();
        administratorOptions();
    }

    private void registClient(Scanner scan) {
        System.out.println(" =================================  REGIST CLIENT ====================================== \n");
        System.out.print("---> Enter the Company: ");
        String company = scan.nextLine();
        System.out.print("---> Names of the person in charge: ");
        String names = scan.nextLine();
        System.out.print("---> Enter your Id Card Ruc: ");
        int idCardRuc = scan.nextInt();
        scan.nextLine();
        System.out.print("---> Enter your address: ");
        String address = scan.nextLine();
        System.out.print("---> Enter your telephone: ");
        int telephone = scan.nextInt();

        List clients;
        clients = new ArrayList();
        clients.add(new Client(company, names, telephone, address, telephone));
        System.out.println("----- SUCCESSFUL REGISTRATION  --- ");

        clients.add(new Client("PYME", "Jose Ignacio ", 123455678, "San Lorezo ", 1234567812));

        Gson gsonClients = new Gson();
        String clientsString;
        clientsString = gsonClients.toJson(clients);
        Data.save("Clients.gson", clientsString + "\n");

        System.out.println(" presione una tecla para continuar... ");
        String key = scan.next();
        printAdministratorMenu();
        administratorOptions();

    }

}
