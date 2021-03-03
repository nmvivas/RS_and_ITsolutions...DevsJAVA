/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.view;


import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.registrationsystemsolution.controller.Controller;
import ec.edu.espe.registrationsystemsolution.data.AdminList;
import ec.edu.espe.registrationsystemsolution.data.MongoDB;
import ec.edu.espe.registrationsystemsolution.data.Administrator;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;


 /* @author DEVS_JAVA_KND
 */
public class Main {
    
    public static void main(String[] args) throws IOException, InterruptedException {

       /* Date date = new Date();
        System.out.println(date + "\n");
        FatherMenu menus = new FatherMenu();
        menus.printWelcomeMenu();
        menus.welcomeOptions();*/
       
       //FRAMES 
       FrmLogin login = new FrmLogin();
       FrmNewRequest newRequest = new FrmNewRequest();
       
       //MODEL
       AdminList adminList = new AdminList();
       
       
       //login
       login.setVisible(true);
       
       Controller controller = new Controller(login, newRequest, adminList);
    }
   
}
