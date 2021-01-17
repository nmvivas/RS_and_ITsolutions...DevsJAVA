/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.model;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author karen
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

                try {
                    
                    option = scan.nextInt();

                    switch (option) {
                        case 1:
                            
                            break;

                        case 2:

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

    }


