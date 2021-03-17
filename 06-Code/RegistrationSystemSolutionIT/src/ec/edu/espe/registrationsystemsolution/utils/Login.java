/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.utils;

import java.util.Scanner;

/**
 *
 * @author DEVS_JAVA_KND
 */
public interface Login {
   
        int attempts = -1;
        int maximum = 2;
    public void VerfiyUser(String users[], String user, String password, int attempts);

}
