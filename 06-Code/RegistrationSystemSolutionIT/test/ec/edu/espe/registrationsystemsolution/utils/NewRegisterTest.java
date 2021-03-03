/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.utils;

import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruben
 */
public class NewRegisterTest {
    
    public NewRegisterTest() {
    }

    /**
     * Test of registAdministrator method, of class NewRegister.
     */
    @Test
    public void testRegistAdministrator() {
        System.out.println("registAdministrator");
        Scanner scan = null;
        NewRegister instance = new NewRegisterImpl();
        instance.registAdministrator(scan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registCustomer method, of class NewRegister.
     */
    @Test
    public void testRegistCustomer() {
        System.out.println("registCustomer");
        Scanner scan = null;
        NewRegister instance = new NewRegisterImpl();
        instance.registCustomer(scan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registProblem method, of class NewRegister.
     */
    @Test
    public void testRegistProblem() {
        System.out.println("registProblem");
        Scanner scan = null;
        NewRegister instance = new NewRegisterImpl();
        instance.registProblem(scan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class NewRegister.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        boolean option = false;
        String informationData = "";
        NewRegister instance = new NewRegisterImpl();
        instance.save(option, informationData);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createDocument method, of class NewRegister.
     */
    @Test
    public void testCreateDocument() {
        System.out.println("createDocument");
        DBCollection colecctionName = null;
        DBObject doc = null;
        NewRegister instance = new NewRegisterImpl();
        instance.createDocument(colecctionName, doc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readDocument method, of class NewRegister.
     */
    @Test
    public void testReadDocument() {
        System.out.println("readDocument");
        DBObject dbObject = null;
        DBCollection colecctionName = null;
        NewRegister instance = new NewRegisterImpl();
        instance.readDocument(dbObject, colecctionName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class NewRegisterImpl implements NewRegister {

        public void registAdministrator(Scanner scan) {
        }

        public void registCustomer(Scanner scan) {
        }

        public void registProblem(Scanner scan) {
        }

        public void save(boolean option, String informationData) {
        }

        public void createDocument(DBCollection colecctionName, DBObject doc) {
        }

        public void readDocument(DBObject dbObject, DBCollection colecctionName) {
        }
    }
    
}
