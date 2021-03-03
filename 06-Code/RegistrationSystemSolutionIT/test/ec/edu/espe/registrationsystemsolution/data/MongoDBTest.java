/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.data;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruben
 */
public class MongoDBTest {
    
    public MongoDBTest() {
    }

    /**
     * Test of createDocument method, of class MongoDB.
     */
    @Test
    public void testCreateDocument_Administrator() {
        System.out.println("createDocument");
        Administrator admin = null;
        MongoDB instance = new MongoDB();
        instance.createDocument(admin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createDocument method, of class MongoDB.
     */
    @Test
    public void testCreateDocument_Customer() {
        System.out.println("createDocument");
        Customer customer = null;
        MongoDB instance = new MongoDB();
        instance.createDocument(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createDocument method, of class MongoDB.
     */
    @Test
    public void testCreateDocument_Technical() {
        System.out.println("createDocument");
        Technical technical = null;
        MongoDB instance = new MongoDB();
        instance.createDocument(technical);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createDocument method, of class MongoDB.
     */
    @Test
    public void testCreateDocument_Problem() {
        System.out.println("createDocument");
        Problem problem = null;
        MongoDB instance = new MongoDB();
        instance.createDocument(problem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListAdministrator method, of class MongoDB.
     */
    @Test
    public void testGetListAdministrator() {
        System.out.println("getListAdministrator");
        MongoDB instance = new MongoDB();
        ArrayList<Administrator> expResult = null;
        ArrayList<Administrator> result = instance.getListAdministrator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListAdministrator method, of class MongoDB.
     */
    @Test
    public void testSetListAdministrator() {
        System.out.println("setListAdministrator");
        ArrayList<Administrator> listAdministrator = null;
        MongoDB instance = new MongoDB();
        instance.setListAdministrator(listAdministrator);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
