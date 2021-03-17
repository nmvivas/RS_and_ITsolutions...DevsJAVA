/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.controller;

import ec.edu.espe.registrationsystemsolution.view.FrmLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class Verification {
    FrmLogin login=  new FrmLogin();
    String res;
    
    public void VerfiyUser(String users[], String user, String password, int attempts) {
        boolean findOut = false;

        for (int i = 0; i < users.length; i++) {
            if (users[i].equalsIgnoreCase(user) && users[i + 1].equals(password)) {
                res = "Bienvenido ---> " + user;
                findOut = true;
                JOptionPane.showMessageDialog(null, res, "LOGIN", JOptionPane.INFORMATION_MESSAGE);
                attempts=0;

                break;
            } 
        }
        if (findOut == false) {
            res = " Key y/o users incorrects ... go " + attempts + " attempts wrong";
            JOptionPane.showMessageDialog(null, res, "LOGIN", JOptionPane.ERROR_MESSAGE);
        }
        if (attempts > 2) {
            JOptionPane.showMessageDialog(null, "3 attempts Wrongs ", "LOGIN", JOptionPane.ERROR_MESSAGE);
            System.exit(0);

        }
    }
}
