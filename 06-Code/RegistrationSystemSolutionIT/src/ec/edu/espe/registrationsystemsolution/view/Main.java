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
import ec.edu.espe.registrationsystemsolution.model.Administrator;
import ec.edu.espe.registrationsystemsolution.data.UserList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;


 /* @author DEVS_JAVA_KND
 */
public class Main {
    
    public static void main(String[] args) throws IOException, InterruptedException {

       
       //FRAMES 
       FrmLogin login = new FrmLogin();
       FrmNewRequest newRequest = new FrmNewRequest();
       FrmMainSystem mainSystem = new FrmMainSystem();
       
       //MODEL
       UserList userList = new UserList();
       AdminList adminList = new AdminList();
       
       //login
       login.setLocationRelativeTo(null);
       login.setVisible(true);
       Controller controller = new Controller(login, newRequest, mainSystem, userList, adminList);
    }
   
}
