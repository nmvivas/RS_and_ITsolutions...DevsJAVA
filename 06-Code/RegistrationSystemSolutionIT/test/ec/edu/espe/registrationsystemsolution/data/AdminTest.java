/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.data;

import ec.edu.espe.registrationsystemsolution.model.Administrator;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruben
 */
public class AdminTest {
    
    public AdminTest() {
    }

    /**
     * Test of getAdminList method, of class Admin.
     */
    @Test
    public void testGetAdminList() {
        System.out.println("getAdminList");
        Admin instance = new Admin();
        ArrayList<Administrator> expResult = null;
        ArrayList<Administrator> result = instance.getAdminList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdminList method, of class Admin.
     */
    @Test
    public void testSetAdminList() {
        System.out.println("setAdminList");
        ArrayList<Administrator> adminList = null;
        Admin instance = new Admin();
        instance.setAdminList(adminList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertA method, of class Admin.
     */
    @Test
    public void testInsertA() {
        System.out.println("insertA");
        Administrator admin = null;
        Admin instance = new Admin();
        boolean expResult = false;
        boolean result = instance.insertA(admin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readA method, of class Admin.
     */
    @Test
    public void testReadA() {
        System.out.println("readA");
        Admin instance = new Admin();
        boolean expResult = false;
        boolean result = instance.readA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteList method, of class Admin.
     */
    @Test
    public void testDeleteList() {
        System.out.println("deleteList");
        Admin instance = new Admin();
        boolean expResult = false;
        boolean result = instance.deleteList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateA method, of class Admin.
     */
    @Test
    public void testUpdateA() {
        System.out.println("UpdateA");
        String IdCard = "";
        String company = "";
        String name = "";
        String surname = "";
        Admin instance = new Admin();
        boolean expResult = false;
        boolean result = instance.UpdateA(IdCard, company, name, surname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteA method, of class Admin.
     */
    @Test
    public void testDeleteA() {
        System.out.println("deleteA");
        String nameC = "";
        Admin instance = new Admin();
        boolean expResult = false;
        boolean result = instance.deleteA(nameC);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
