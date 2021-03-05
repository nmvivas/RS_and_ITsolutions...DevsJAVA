/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.model;

import ec.edu.espe.registrationsystemsolution.data.CostumerList;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruben
 */
public class CostumerListTest {
    
    public CostumerListTest() {
    }

    /**
     * Test of getCustomerList method, of class CostumerList.
     */
    @Test
    public void testGetCustomerList() {
        System.out.println("getCustomerList");
        CostumerList instance = new CostumerList();
        ArrayList<Customer> expResult = null;
        ArrayList<Customer> result = instance.getCustomerList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerList method, of class CostumerList.
     */
    @Test
    public void testSetCustomerList() {
        System.out.println("setCustomerList");
        ArrayList<Customer> customerList = null;
        CostumerList instance = new CostumerList();
        instance.setCustomerList(customerList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertC method, of class CostumerList.
     */
    @Test
    public void testInsertC() {
        System.out.println("insertC");
        Customer customer = null;
        CostumerList instance = new CostumerList();
        boolean expResult = false;
        boolean result = instance.insertC(customer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateC method, of class CostumerList.
     */
    @Test
    public void testUpdateC() {
        System.out.println("UpdateC");
        String IdCard = "";
        String company = "";
        String name = "";
        String surname = "";
        CostumerList instance = new CostumerList();
        boolean expResult = false;
        boolean result = instance.UpdateC(IdCard, company, name, surname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteC method, of class CostumerList.
     */
    @Test
    public void testDeleteC() {
        System.out.println("deleteC");
        String nameC = "";
        CostumerList instance = new CostumerList();
        boolean expResult = false;
        boolean result = instance.deleteC(nameC);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
