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
    public void administratorMenu(){
        Scanner scan = new Scanner(System.in);
        
        boolean salir = false;
        int option;
        
        while (!salir) {

            System.out.println(" Welcome to the System, please chose an option \n");
            System.out.println(" Select 1 : Regist Problem  ");
            System.out.println(" Select 2 : Regist Client  ");
            System.out.println(" Select 3 : Regist Technical  ");
            

            try{
  
                option = scan.nextInt();
                
                switch (option) {
                    case 1:
                        Problem problem = new Problem();
                        problem.registProblem();
                        break;
                    case 2:
                        Client client = new Client();
                        client.registClient();
                        break;
                    case 3:
                        Technical technical = new Technical();
                        technical.registechnical();
                  
                }
            }catch(InputMismatchException e) {
                System.out.println(" You have to put a number ");
                scan.next();
            }
        }
    }   
}
    