/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.data;

import ec.edu.espe.registrationsystemsolution.utils.ConnectionMongodb;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruben
 */
public class ConnectionMongodbTest {
    
    public ConnectionMongodbTest() {
    }

    /**
     * Test of getMongoClient method, of class ConnectionMongodb.
     */
    @Test
    public void testGetMongoClient() {
        System.out.println("getMongoClient");
        ConnectionMongodb instance = new ConnectionMongodb();
        MongoClient expResult = null;
        MongoClient result = instance.getMongoClient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMongoClient method, of class ConnectionMongodb.
     */
    @Test
    public void testSetMongoClient() {
        System.out.println("setMongoClient");
        MongoClient mongoClient = null;
        ConnectionMongodb instance = new ConnectionMongodb();
        instance.setMongoClient(mongoClient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMongoCURI method, of class ConnectionMongodb.
     */
    @Test
    public void testGetMongoCURI() {
        System.out.println("getMongoCURI");
        ConnectionMongodb instance = new ConnectionMongodb();
        MongoClientURI expResult = null;
        MongoClientURI result = instance.getMongoCURI();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMongoCURI method, of class ConnectionMongodb.
     */
    @Test
    public void testSetMongoCURI() {
        System.out.println("setMongoCURI");
        MongoClientURI mongoCURI = null;
        ConnectionMongodb instance = new ConnectionMongodb();
        instance.setMongoCURI(mongoCURI);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatabase method, of class ConnectionMongodb.
     */
    @Test
    public void testGetDatabase() {
        System.out.println("getDatabase");
        ConnectionMongodb instance = new ConnectionMongodb();
        DB expResult = null;
        DB result = instance.getDatabase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDatabase method, of class ConnectionMongodb.
     */
    @Test
    public void testSetDatabase() {
        System.out.println("setDatabase");
        DB database = null;
        ConnectionMongodb instance = new ConnectionMongodb();
        instance.setDatabase(database);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDbCollection method, of class ConnectionMongodb.
     */
    @Test
    public void testGetDbCollection() {
        System.out.println("getDbCollection");
        ConnectionMongodb instance = new ConnectionMongodb();
        DBCollection expResult = null;
        DBCollection result = instance.getDbCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDbCollection method, of class ConnectionMongodb.
     */
    @Test
    public void testSetDbCollection() {
        System.out.println("setDbCollection");
        DBCollection dbCollection = null;
        ConnectionMongodb instance = new ConnectionMongodb();
        instance.setDbCollection(dbCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScan method, of class ConnectionMongodb.
     */
    @Test
    public void testGetScan() {
        System.out.println("getScan");
        ConnectionMongodb instance = new ConnectionMongodb();
        Scanner expResult = null;
        Scanner result = instance.getScan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setScan method, of class ConnectionMongodb.
     */
    @Test
    public void testSetScan() {
        System.out.println("setScan");
        Scanner scan = null;
        ConnectionMongodb instance = new ConnectionMongodb();
        instance.setScan(scan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
