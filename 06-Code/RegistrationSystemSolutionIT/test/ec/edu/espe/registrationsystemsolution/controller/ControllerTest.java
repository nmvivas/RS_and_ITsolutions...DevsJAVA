/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.controller;

import java.awt.event.ActionEvent;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Meli
 */
public class ControllerTest {
    
    public ControllerTest() {
    }

    /**
     * Test of getScan method, of class Controller.
     */
    @Test
    public void testGetScan() {
        System.out.println("getScan");
        Controller instance = null;
        Scanner expResult = null;
        Scanner result = instance.getScan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setScan method, of class Controller.
     */
    @Test
    public void testSetScan() {
        System.out.println("setScan");
        Scanner scan = null;
        Controller instance = null;
        instance.setScan(scan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAttempts method, of class Controller.
     */
    @Test
    public void testGetAttempts() {
        System.out.println("getAttempts");
        Controller instance = null;
        int expResult = 0;
        int result = instance.getAttempts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAttempts method, of class Controller.
     */
    @Test
    public void testSetAttempts() {
        System.out.println("setAttempts");
        int attempts = 0;
        Controller instance = null;
        instance.setAttempts(attempts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class Controller.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Controller instance = null;
        String expResult = "";
        String result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class Controller.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        String user = "";
        Controller instance = null;
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPass method, of class Controller.
     */
    @Test
    public void testGetPass() {
        System.out.println("getPass");
        Controller instance = null;
        String expResult = "";
        String result = instance.getPass();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPass method, of class Controller.
     */
    @Test
    public void testSetPass() {
        System.out.println("setPass");
        String pass = "";
        Controller instance = null;
        instance.setPass(pass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class Controller.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent ae = null;
        Controller instance = null;
        instance.actionPerformed(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
