/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.view;

import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruben
 */
public class FatherMenuTest {
    
    public FatherMenuTest() {
    }

    /**
     * Test of printWelcomeMenu method, of class FatherMenu.
     */
    @Test
    public void testPrintWelcomeMenu() {
        System.out.println("printWelcomeMenu");
        FatherMenu instance = new FatherMenu();
        instance.printWelcomeMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printAdministratorMenu method, of class FatherMenu.
     */
    @Test
    public void testPrintAdministratorMenu() {
        System.out.println("printAdministratorMenu");
        FatherMenu instance = new FatherMenu();
        instance.printAdministratorMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of welcomeOptions method, of class FatherMenu.
     */
    @Test
    public void testWelcomeOptions() throws Exception {
        System.out.println("welcomeOptions");
        FatherMenu instance = new FatherMenu();
        instance.welcomeOptions();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verify method, of class FatherMenu.
     */
    @Test
    public void testVerify() {
        System.out.println("verify");
        Scanner scan = null;
        FatherMenu instance = new FatherMenu();
        instance.verify(scan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of administratorOptions method, of class FatherMenu.
     */
    @Test
    public void testAdministratorOptions() {
        System.out.println("administratorOptions");
        FatherMenu instance = new FatherMenu();
        instance.administratorOptions();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of continueKey method, of class FatherMenu.
     */
    @Test
    public void testContinueKey() {
        System.out.println("continueKey");
        Scanner scan = null;
        FatherMenu instance = new FatherMenu();
        instance.continueKey(scan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
