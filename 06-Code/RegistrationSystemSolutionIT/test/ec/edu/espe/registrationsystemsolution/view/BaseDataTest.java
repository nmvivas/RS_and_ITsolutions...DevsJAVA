/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.view;

import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruben
 */
public class BaseDataTest {
    
    public BaseDataTest() {
    }

    /**
     * Test of registAdministrator method, of class BaseData.
     */
    @Test
    public void testRegistAdministrator() {
        System.out.println("registAdministrator");
        Scanner scan = null;
        BaseData instance = new BaseData();
        instance.registAdministrator(scan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registCustomer method, of class BaseData.
     */
    @Test
    public void testRegistCustomer() {
        System.out.println("registCustomer");
        Scanner scan = null;
        BaseData instance = new BaseData();
        instance.registCustomer(scan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registProblem method, of class BaseData.
     */
    @Test
    public void testRegistProblem() {
        System.out.println("registProblem");
        Scanner scan = null;
        BaseData instance = new BaseData();
        instance.registProblem(scan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registTechnical method, of class BaseData.
     */
    @Test
    public void testRegistTechnical() {
        System.out.println("registTechnical");
        Scanner scan = null;
        BaseData instance = new BaseData();
        instance.registTechnical(scan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class BaseData.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        boolean option = false;
        String informationData = "";
        BaseData instance = new BaseData();
        instance.save(option, informationData);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createDocument method, of class BaseData.
     */
    @Test
    public void testCreateDocument() {
        System.out.println("createDocument");
        DBCollection colecctionName = null;
        DBObject doc = null;
        BaseData instance = new BaseData();
        instance.createDocument(colecctionName, doc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readDocument method, of class BaseData.
     */
    @Test
    public void testReadDocument() {
        System.out.println("readDocument");
        DBObject dbObject = null;
        DBCollection colecctionName = null;
        BaseData instance = new BaseData();
        instance.readDocument(dbObject, colecctionName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
