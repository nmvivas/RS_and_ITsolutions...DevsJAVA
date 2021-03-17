/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruben
 */
public class VerificationTest {
    
    public VerificationTest() {
    }

    /**
     * Test of VerfiyUser method, of class Verification.
     */
    @Test
    public void testVerfiyUser() {
        System.out.println("VerfiyUser");
        String[] users = null;
        String user = "";
        String password = "";
        int attempts = 0;
        Verification instance = new Verification();
        instance.VerfiyUser(users, user, password, attempts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
