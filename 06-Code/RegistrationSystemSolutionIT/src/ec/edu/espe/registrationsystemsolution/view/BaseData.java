/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.view;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.registrationsystemsolution.view.FatherMenu;
import ec.edu.espe.registrationsystemsolution.model.Administrator;
import ec.edu.espe.registrationsystemsolution.model.Client;
import ec.edu.espe.registrationsystemsolution.model.Problem;
import ec.edu.espe.registrationsystemsolution.model.Technical;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class BaseData {

    FatherMenu menus = new FatherMenu();//Method name in singular

    public Administrator registAdministrator(Scanner scan) {
        int idCard;
        String names;
        String surnames;
        String email;
        System.out.print(" ==========================   REGIST ADMINISTRATOR ========================================== \n");//very long line of code
        System.out.print("---> Enter your number Id: ");
        idCard = scan.nextInt();
        scan.nextLine();
        System.out.print("---> Enter your Names: ");
        names = scan.nextLine();
        System.out.print("---> Enter your Surnames: ");
        surnames = scan.nextLine();
        System.out.print("---> Enter your email:  ");
        email = scan.nextLine();
        System.out.println("\n****  your assigned user is: admin and your password is: 2858 **** ");//very long line of code
        Administrator admin = new Administrator(email, idCard, names, surnames, idCard);
        System.out.println("----- SUCCESSFUL REGISTRATION  --- ");
        return admin;

    }

    public void registClient(Scanner scan) {
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
        clients = new ArrayList();//place a synonym for clients can be misunderstood
        clients.add(new Client(company, names, telephone, address, telephone));
        System.out.println("----- SUCCESSFUL REGISTRATION  --- ");

        clients.add(new Client("PYME", "Jose Ignacio ", 123455678, "San Lorezo ", 1234567812));

        Gson gsonClients = new Gson();
        String clientsString;
        clientsString = gsonClients.toJson(clients);
        Data.save("Clients.gson", clientsString + "\n");

        menus.continueKey(scan);

    }

    public void registProblem(Scanner scan) {
        System.out.println(" ================================== REGIST PROBLEM  ================================= ");
        System.out.println("");
        System.out.println("\n ---> Enter description of problem: ");
        String description = scan.nextLine();
        System.out.println("\n ---> Enter the type of the problem (Incidence/Solution remote): ");
        String typeProblem = scan.nextLine();
        System.out.println("\n ---> Enter the state of the problem: ");
        String state = scan.nextLine();

        Problem problem = new Problem(true, 0, typeProblem, LocalDate.MIN);
        System.out.println("----- SUCCESSFUL REGISTRATION  --- ");

        List problems;
        problems = new ArrayList();
        problems.add(new Problem(true, 0, typeProblem, LocalDate.MIN);
        Gson gsonProblems = new Gson();
        String problemsString;

        problemsString = gsonProblems.toJson(problems);
        Data.save("Problems.gson", problemsString + "\n");

        menus.continueKey(scan);
    }

    public void registTechnical(Scanner scan) {
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
        technicals.add(new Technical(role, professionalCategory);
        System.out.println("----- SUCCESSFUL REGISTRATION  --- ");

        Gson gsonTechnicals = new Gson();
        String technicalsString;
        technicalsString = gsonTechnicals.toJson(technicals);
        Data.save("Technicals.gson", technicalsString + "\n");

        menus.continueKey(scan);

    }

    public void saveGson(Administrator admin) {

        Gson gsonAdmin = new Gson();
        String adminString;

        adminString = gsonAdmin.toJson(admin);
        Data.save("Admin.csv", adminString + "\n");

        Administrator administrator1;
        String jsonString = adminString;
        administrator1 = gsonAdmin.fromJson(jsonString, Administrator.class);

    }

}
