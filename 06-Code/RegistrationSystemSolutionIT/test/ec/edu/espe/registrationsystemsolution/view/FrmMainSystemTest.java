/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.view;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruben
 */
public class FrmMainSystemTest {
    
    public FrmMainSystemTest() {
    }

    /**
     * Test of getjItemRequest method, of class FrmMainSystem.
     */
    @Test
    public void testGetjItemRequest() {
        System.out.println("getjItemRequest");
        FrmMainSystem instance = new FrmMainSystem();
        JMenuItem expResult = null;
        JMenuItem result = instance.getjItemRequest();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setjItemRequest method, of class FrmMainSystem.
     */
    @Test
    public void testSetjItemRequest() {
        System.out.println("setjItemRequest");
        JMenuItem jItemRequest = null;
        FrmMainSystem instance = new FrmMainSystem();
        instance.setjItemRequest(jItemRequest);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjMenuNew method, of class FrmMainSystem.
     */
    @Test
    public void testGetjMenuNew() {
        System.out.println("getjMenuNew");
        FrmMainSystem instance = new FrmMainSystem();
        JMenu expResult = null;
        JMenu result = instance.getjMenuNew();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setjMenuNew method, of class FrmMainSystem.
     */
    @Test
    public void testSetjMenuNew() {
        System.out.println("setjMenuNew");
        JMenu jMenuNew = null;
        FrmMainSystem instance = new FrmMainSystem();
        instance.setjMenuNew(jMenuNew);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FrmMainSystem.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FrmMainSystem.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
