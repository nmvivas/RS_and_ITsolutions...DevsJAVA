/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.data;

import ec.edu.espe.registrationsystemsolution.model.File;
import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruben
 */
public class FileTest {
    
    public FileTest() {
    }

    /**
     * Test of getDayOfAttention method, of class File.
     */
    @Test
    public void testGetDayOfAttention() {
        System.out.println("getDayOfAttention");
        File instance = null;
        int expResult = 0;
        int result = instance.getDayOfAttention();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class File.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        File instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdProblem method, of class File.
     */
    @Test
    public void testGetIdProblem() {
        System.out.println("getIdProblem");
        File instance = null;
        int expResult = 0;
        int result = instance.getIdProblem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdProblem method, of class File.
     */
    @Test
    public void testSetIdProblem() {
        System.out.println("setIdProblem");
        int idProblem = 0;
        File instance = null;
        instance.setIdProblem(idProblem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitleProblem method, of class File.
     */
    @Test
    public void testGetTitleProblem() {
        System.out.println("getTitleProblem");
        File instance = null;
        String expResult = "";
        String result = instance.getTitleProblem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitleProblem method, of class File.
     */
    @Test
    public void testSetTitleProblem() {
        System.out.println("setTitleProblem");
        String titleProblem = "";
        File instance = null;
        instance.setTitleProblem(titleProblem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateOfShipment method, of class File.
     */
    @Test
    public void testGetDateOfShipment() {
        System.out.println("getDateOfShipment");
        File instance = null;
        LocalDate expResult = null;
        LocalDate result = instance.getDateOfShipment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateOfShipment method, of class File.
     */
    @Test
    public void testSetDateOfShipment() {
        System.out.println("setDateOfShipment");
        LocalDate dateOfShipment = null;
        File instance = null;
        instance.setDateOfShipment(dateOfShipment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
