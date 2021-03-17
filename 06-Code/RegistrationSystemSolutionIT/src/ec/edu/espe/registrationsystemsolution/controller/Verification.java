/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.controller;

import ec.edu.espe.registrationsystemsolution.utils.Login;
import ec.edu.espe.registrationsystemsolution.view.FrmLogin;
import ec.edu.espe.registrationsystemsolution.view.FrmMainSystem;
import ec.edu.espe.registrationsystemsolution.view.FrmNewRequest;
import javax.swing.JOptionPane;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class Verification implements Login {

    public void VerfiyUser(String users[], String user, String password, int attempts) {
        FrmMainSystem mainSystem = new FrmMainSystem();
        FrmLogin login = new FrmLogin();
        String res;
        boolean findOut = false;

        for (int i = 0; i < users.length; i++) {
            if (users[i].equalsIgnoreCase(user) && users[i + 1].equals(password)) {
                res = " WELCOME " + user;
                login.hide();
                mainSystem.setLocationRelativeTo(null);
                mainSystem.show();
                findOut = true;
                JOptionPane.showMessageDialog(null, res, "LOGIN  SYSTEM ", JOptionPane.INFORMATION_MESSAGE);
                attempts = 0;
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
