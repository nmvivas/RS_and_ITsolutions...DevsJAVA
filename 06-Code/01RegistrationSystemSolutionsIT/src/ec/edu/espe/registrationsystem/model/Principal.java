/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystem.model;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class Principal {
    
    private Integer opcion1;
    private Integer opcion2;
    private Integer opcion3;
    
    
    public Principal(){
     
}
    public void Options() {

        Scanner scan = new Scanner(System.in);

        boolean salir = false;
        int option;

        while (!salir) {

            System.out.println(" Welcome to the System, please chose an option \n");
            System.out.println(" Select 1 : If you want to create a user administrator ");
            System.out.println(" Select 2 : If you want to login ");
            System.out.println(" Select 3 : If you want to exit");

            try {
  
                option = scan.nextInt();
                
                switch (option) {
                    case 1: 
                        Administrator admin = new Administrator();
                        admin.registAdministrator();
                        
                        break;
                    case 2:
                        Login login = new Login();
                        login.enterTheSystem();

                        break;
                    case 3:
                        System.out.println("****** Thanks you for use our system *******");
                        System.exit(0);
                        
                        
                        break;
                    default:
                        System.out.println(" The opcion have to be between 1 and 3 ");
                }
            } catch (InputMismatchException e) {
                System.out.println(" You have to put a number ");
                scan.next();
            }
        }
}
     
    @Override
    public String toString() {
        return "Menu{" + "opcion1=" + opcion1 + ", opcion2=" + opcion2 + 
                ", opcion3=" + opcion3 + '}';
    }

    public Integer getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(Integer opcion1) {
        this.opcion1 = opcion1;
    }

    public Integer getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(Integer opcion2) {
        this.opcion2 = opcion2;
    }

    public Integer getOpcion3() {
        return opcion3;
    }

    public void setOpcion3(Integer opcion3) {
        this.opcion3 = opcion3;
    }
    
   

}

