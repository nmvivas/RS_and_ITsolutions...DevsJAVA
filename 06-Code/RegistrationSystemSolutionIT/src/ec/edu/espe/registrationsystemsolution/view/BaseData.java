/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.view;

import ec.edu.espe.registrationsystemsolution.utils.NewRegister;
import com.google.gson.Gson;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.registrationsystemsolution.controller.MongoDB;
import ec.edu.espe.registrationsystemsolution.view.FatherMenu;
import ec.edu.espe.registrationsystemsolution.model.Administrator;
import ec.edu.espe.registrationsystemsolution.model.Customer;
import ec.edu.espe.registrationsystemsolution.model.Problem;
import ec.edu.espe.registrationsystemsolution.model.Technical;
import ec.edu.espe.registrationsystemsolution.model.TypeProblem;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class BaseData implements NewRegister {

    FatherMenu menus = new FatherMenu();//Method name in singular
    boolean option;
        
    public void registAdministrator(Scanner scan) {
        int idCard;
        String name;
        String surname;
        String email;
        int telephone;
        
        System.out.print(" ==========================   REGIST ADMINISTRATOR ========================================== \n");
        System.out.print("---> Enter your number Id: ");
        idCard = scan.nextInt();
        scan.nextLine();
        System.out.print("---> Enter your Names: ");
        name = scan.nextLine();
        System.out.print("---> Enter your Surnames: ");
        surname = scan.nextLine();
        System.out.print("---> Enter your telephone:  ");
        telephone = scan.nextInt();
        scan.nextLine();
        System.out.print("---> Enter your email:  ");
        email = scan.nextLine();
        System.out.println("\n****  your assigned user is: admin and your password is: 2858 **** ");
        
        Administrator admin1 = new Administrator(email, idCard, name, surname, telephone);
        MongoDB newAdmin = new MongoDB();
        newAdmin.createDocument(admin1);
        System.out.println("----- SUCCESSFUL REGISTRATION  --- ");
        

    }

    public void registCustomer(Scanner scan) {
        System.out.println(" =================================  REGIST CUSTOMER ====================================== \n");
        System.out.print("---> Enter the Company: ");
        String company = scan.nextLine();
        System.out.print("---> Names of the person in charge: ");
        String names = scan.nextLine();
        System.out.print("---> Surnames of the person in charge: ");
        String surnames = scan.nextLine();
        System.out.print("---> Enter your Id Card Ruc: ");
        int idCardRuc = scan.nextInt();
        scan.nextLine();
        System.out.print("---> Enter your address: ");
        String address = scan.nextLine();
        System.out.print("---> Enter your telephone: ");
        int telephone = scan.nextInt();

       
        Customer customer1 = new Customer(company, address, idCardRuc, names, surnames, telephone);
        System.out.println("----- SUCCESSFUL REGISTRATION  --- ");
        
        menus.continueKey(scan);

    }

    public void registProblem(Scanner scan) {
        
        System.out.println(" ================================== REGIST PROBLEM  ================================= ");
        System.out.println("");
        System.out.println("\n ---> State of the problem (solve = true/ not solve = false)");
        boolean isSolve = scan.nextBoolean();
        System.out.println("\n ---> Enter the Id Problem: ");
        int idProblem = scan.nextInt();
        scan.nextLine();
        System.out.println("\n ---> Enter the Title Problem: ");
        String titleProblem = scan.nextLine();
        System.out.println("\n ---> Enter the date of problem: ");
        String dateOfShipment = scan.nextLine();
        System.out.println("Enter of description the problem: ");
        String descriptionProblem = scan.nextLine();
        System.out.println("\n ---> Enter the type of the problem (incident/ remote solution): ");
        String   typeProblem= scan.nextLine();
        TypeProblem problem = new TypeProblem(isSolve, idProblem, titleProblem, LocalDate.MIN);
        if("incident".equals(typeProblem)){
            System.out.println("The code problem is: " + problem.getTypeIncident());
        }else if("remote solution".equals(typeProblem)){
            System.out.println("The code problem is: " + problem.getTypeRemoteSolution());   
        }
        
        System.out.println("\n ---> Enter the state of the problem: ");
        String state = scan.nextLine();
        
        System.out.println("----- SUCCESSFUL REGISTRATION  --- ");

        List problems;
        problems = new ArrayList();
        problems.add(new TypeProblem(isSolve, idProblem, titleProblem, LocalDate.MIN));
        Gson gsonProblems = new Gson();
        String problemsString;

        problemsString = gsonProblems.toJson(problems);
        questionSave();
        save(option, problemsString);
        problem.archiveProblem();
        System.out.println("Problems in Base Data are ---> " + problem.getProblemInTheBaseData());
        System.out.println("This is the problem number ---> " + problem.getIdProblem());

        menus.continueKey(scan);
    }

    public void registTechnical(Scanner scan) {
        
        System.out.println(" ===========================  REGISTER TECHNICAL ======================== \n");
        System.out.print("---> Enter your Id Card: ");
        int idCard = scan.nextInt();
        scan.nextLine();
        System.out.print("---> Enter your Names: ");
        String names = scan.nextLine();
        System.out.print("---> Enter your Surnames: ");
        String surnames = scan.nextLine();
        System.out.print("---> Enter your Telephone: ");
        int telephone = scan.nextInt();
        scan.nextLine();
        System.out.print("---> Enter your Role: ");
        String role = scan.nextLine();
        System.out.print("---> Enter your professional category: ");
        String professionalCategory = scan.nextLine();

        
        Technical technical1 = new Technical(role, professionalCategory, idCard, names, surnames, telephone);
       System.out.println("----- SUCCESSFUL REGISTRATION  --- ");

        

        menus.continueKey(scan);

    }
    public void save(boolean option, String informationData) {
        if (option == false) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter file Name and the extension (.csv - .txt - .gson )---> ");
            String filename = scan.nextLine();
            Data.save(filename, informationData);
            System.out.println(" \n *------- SAVED FILE ----- * ");
        } else {
            System.out.println(" --- EXIT THE SYSTEM --- ");
            System.exit(0);
            
        }

    }
    private boolean questionSave() {
        System.out.println("\n ¿Do you want save? true/false");
        Scanner scan = new Scanner(System.in);
        boolean option = scan.nextBoolean();
        scan.nextLine();
        return option;
    }

    @Override
    public void createDocument(DBCollection colecctionName, DBObject doc) {
        
    }

    @Override
    public void readDocument(DBObject dbObject, DBCollection colecctionName) {
        
    }
}
