/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.view;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public  interface NewRegister {
    
    public void registAdministrator(Scanner scan);
    public void registCustomer(Scanner scan);
    public void registProblem(Scanner scan);
    public void createDocument(boolean option, String informationData);

}


