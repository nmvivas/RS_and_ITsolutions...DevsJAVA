/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.utils;

import java.util.Scanner;
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
     * Test of verify method, of class Login.
     */
    @Test
    public void testVerify() {
        System.out.println("verify");
        Scanner scan = null;
        Login instance = new LoginImpl();
        instance.verify(scan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class LoginImpl implements Login {

        public void verify(Scanner scan) {
        }
    }
    
}
