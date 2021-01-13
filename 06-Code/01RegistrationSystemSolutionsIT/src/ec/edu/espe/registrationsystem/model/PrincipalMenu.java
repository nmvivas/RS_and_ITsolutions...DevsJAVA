/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystem.model;

import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class PrincipalMenu {

    private Integer opcion1;
    private Integer opcion2;
    private Integer opcion3;

    public PrincipalMenu() {

    }

    public void Options() throws IOException, InterruptedException {

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

    @Override
    public String toString() {
        return "Menu{" + "opcion1=" + opcion1 + ", opcion2=" + opcion2
                + ", opcion3=" + opcion3 + '}';
    }

    public PrincipalMenu(Integer opcion1, Integer opcion2, Integer opcion3) {
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
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
