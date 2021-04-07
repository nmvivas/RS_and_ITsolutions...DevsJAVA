/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.view;


import ec.edu.espe.registrationsystemsolution.controller.Controller;
import ec.edu.espe.registrationsystemsolution.data.Admin;

import ec.edu.espe.registrationsystemsolution.data.UserL;
import java.io.IOException;


 /* @author DEVS_JAVA_KND
 */
public class Main {
    
    public static void main(String[] args) throws IOException, InterruptedException {

       
       //FRAMES 
       FrmLogin login = new FrmLogin();
       FrmNewRequest newRequest = new FrmNewRequest();
       FrmMainSystem mainSystem = new FrmMainSystem();
       FrmTechnician technician = new FrmTechnician();
       FrmCustomer customer = new FrmCustomer();     
       //MODEL
       UserL userList = new UserL();
       Admin adminList = new Admin();
       
       //login
       login.setLocationRelativeTo(null);
       login.setVisible(true);
       Controller controller = new Controller(login, newRequest, mainSystem, userList, adminList, technician, customer);
    }
   
}
