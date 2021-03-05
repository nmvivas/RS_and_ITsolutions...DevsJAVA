/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.data;

import ec.edu.espe.registrationsystemsolution.model.Problem;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruben
 */
public class ProblemTest {
    
    public ProblemTest() {
    }

    /**
     * Test of archiveProblem method, of class Problem.
     */
    @Test
    public void testArchiveProblem() {
        System.out.println("archiveProblem");
        Problem instance = null;
        int expResult = 0;
        int result = instance.archiveProblem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsSolve method, of class Problem.
     */
    @Test
    public void testIsIsSolve() {
        System.out.println("isIsSolve");
        Problem instance = null;
        boolean expResult = false;
        boolean result = instance.isIsSolve();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsSolve method, of class Problem.
     */
    @Test
    public void testSetIsSolve() {
        System.out.println("setIsSolve");
        boolean isSolve = false;
        Problem instance = null;
        instance.setIsSolve(isSolve);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProblemInTheBaseData method, of class Problem.
     */
    @Test
    public void testGetProblemInTheBaseData() {
        System.out.println("getProblemInTheBaseData");
        Problem instance = null;
        int expResult = 0;
        int result = instance.getProblemInTheBaseData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProblemInTheBaseData method, of class Problem.
     */
    @Test
    public void testSetProblemInTheBaseData() {
        System.out.println("setProblemInTheBaseData");
        int problemInTheBaseData = 0;
        Problem instance = null;
        instance.setProblemInTheBaseData(problemInTheBaseData);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
