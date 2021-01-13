/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystem.model;

import java.io.IOException; 

/**
 *
 * @author DEVS_JAVA_KND
 */
public class CleanConsole {
   
    public void Cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        }
           /*Introduce tu código desde aquí*/
    }
}

