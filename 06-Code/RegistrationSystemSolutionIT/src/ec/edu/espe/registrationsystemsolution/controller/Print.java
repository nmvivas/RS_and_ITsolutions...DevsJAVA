/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.controller;

import java.awt.Desktop;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class Print {

    private java.io.File file;

    public void printFile() {
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        file = new java.io.File("NewRequest.doc");
        if (desktop.isSupported(Desktop.Action.PRINT)) {
            try {
                desktop.print(file );
            } catch (IOException ex) {
                Logger.getLogger(Print.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            System.out.println(" ¡¡ ERROR !! ");
        }
    }

}
