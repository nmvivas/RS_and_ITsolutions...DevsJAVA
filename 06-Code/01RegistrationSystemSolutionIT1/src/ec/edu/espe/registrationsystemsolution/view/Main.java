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

                        System.out.print(" ==========================   REGIST ADMINISTRATOR ========================================== \n");
                        System.out.print("\n ---> Enter your number Id: ");
                        int idCard = scan.nextInt();
                        scan.nextLine();
                        System.out.print("---> Enter your Names:     ");
                        String names = scan.nextLine();
                        System.out.print("---> Enter your Surnames:  ");
                        String surnames = scan.nextLine();
                        System.out.print("---> Enter your email:     ");
                        String email = scan.nextLine();
                        System.out.print("---> Enter your nickname:  ");
                        String nickname = scan.nextLine();
                        System.out.print("---> Enter your password:   ");
                        int password = scan.nextInt();
                        System.out.println("");
                        Administrator admin = new Administrator(idCard, names, surnames, email, nickname, password);
                        System.out.println(admin);

                        break;

                    case 2:

                        System.out.println(" *-----------------------------------* ");
                        System.out.print(" Enter your nickname:  ");
                        String loginNickname = scan.next();
                        System.out.print(" Enter your password:  ");
                        int loginPassword = scan.nextInt();
                        Login login = new Login(loginNickname, loginPassword);
                        System.out.println(login);

                        System.out.println(" ================*=====================*=====================*======================");
                        System.out.println("                            WELCOME TO REGISTRATION SYSTEM SOLUTION IT              ");
                        System.out.println("                              ------- Administrator menu --------- ");
                        System.out.println(" \n please , choose a option to continue... ");
                        System.out.print("\n--> Select 1 : Regist Problem  ");
                        System.out.print("\n --> Select 2 : Regist Client  ");
                        System.out.print("\n --> Select 3 : Regist Technical  ");
                        System.out.print("\n --> Select 4 : Back to Principal Menu  ");
                        System.out.print("\n ================*=====================*=====================*====================== \n ");

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
                scan.nextLine();
                switch (option) {

                    case 1:
                        System.out.println(" ================================== REGIST PROBLEM  ================================= ");
                        System.out.println("");
                        System.out.println(" ---> Enter description of problem:  ");
                        String description = scan.nextLine();
                        System.out.println(" ---> Enter the type of the problem: ");
                        String typeProblem = scan.nextLine();
                        System.out.println(" ---> Enter the state of the problem:  ");
                        String state = scan.nextLine();

                        Problem problem = new Problem(description, typeProblem, state);
                        System.out.println(problem);

                        List problems;
                        problems = new ArrayList();
                        problems.add(new Problem(description, typeProblem, state));

                        Gson gsonProblems = new Gson();
                        String problemsString;
                        problemsString = gsonProblems.toJson(problems);
                        System.out.println("format gson ---> " + problemsString);
                        Data.save("Problems.gson", problemsString);

                        break;

                    case 2:
                        System.out.println(" =================================  REGIST CLIENT ====================================== \n");
                        System.out.print("\n ---> Enter the Company:  ");
                        String company = scan.nextLine();
                        System.out.print("\n ---> Enter names:  ");
                        String names = scan.nextLine();
                        System.out.print("\n ---> Enter your Id Card Ruc:  ");
                        int idCardRuc = scan.nextInt();
                        scan.nextLine();
                        System.out.print("\n ---> Enter your address:  ");
                        String address = scan.nextLine();
                        System.out.print("\n ---> Enter your telephone:  ");
                        int telephone = scan.nextInt();

                        List clients;
                        clients = new ArrayList();
                        clients.add(new Client(company, names, telephone, address, telephone));

                        clients.add(new Client("PYME", "Jose Ignacio ", 123455678, "San Lorezo ", 1234567812));

                        Gson gsonClients = new Gson();
                        String clientsString;
                        clientsString = gsonClients.toJson(clients);
                        System.out.println("format gson ---> " + clientsString);
                        Data.save("Clients.gson", clientsString);

                        break;

                    case 3:
                        System.out.println(" ===========================  REGISTER TECHNICAL ======================== \n");
                        System.out.print("---> Enter your Id Card: ");
                        int idCard = scan.nextInt();
                        scan.nextLine();
                        System.out.print("--->  Enter your Names:  ");
                        String techNames = scan.nextLine();
                        System.out.print("---> Enter your Surnames:  ");
                        String surnames = scan.nextLine();
                        System.out.print("---> Enter your Telephone:  ");
                        int techTelephone = scan.nextInt();
                        scan.nextLine();
                        System.out.print("--->Enter your Email:  ");
                        String email = scan.nextLine();
                        System.out.print("--->Enter your Role:  ");
                        String role = scan.nextLine();
                        System.out.print("--->Enter your professional category:  ");
                        String professionalCategory = scan.nextLine();

                        List technicals;
                        technicals = new ArrayList();
                        technicals.add(new Technical(idCard, techNames,
                                surnames, techTelephone, email, role, professionalCategory));
                        System.out.println(technicals);

                        Gson gsonTechnicals = new Gson();
                        String technicalsString;
                        technicalsString = gsonTechnicals.toJson(technicals);
                        System.out.println("format gson ---> " + technicalsString);
                        Data.save("Technicals.gson", technicalsString);

                        break;

                    case 4:
                        //Main main = new Main();
                        Options();

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
