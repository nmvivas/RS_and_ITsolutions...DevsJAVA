/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruben
 */
public class LoginTest {
    
    public LoginTest() {
    }

    /**
     * Test of VerfiyUser method, of class Login.
     */
    @Test
    public void testVerfiyUser() {
        System.out.println("VerfiyUser");
        String[] users = null;
        String user = "";
        String password = "";
        int attempts = 0;
        Login instance = new LoginImpl();
        instance.VerfiyUser(users, user, password, attempts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class LoginImpl implements Login {

        public void VerfiyUser(String[] users, String user, String password, int attempts) {
        }
    }
    
}
