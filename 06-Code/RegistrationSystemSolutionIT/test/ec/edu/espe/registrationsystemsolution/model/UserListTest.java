/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.model;

import ec.edu.espe.registrationsystemsolution.data.UserList;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruben
 */
public class UserListTest {
    
    public UserListTest() {
    }

    /**
     * Test of getUserList method, of class UserList.
     */
    @Test
    public void testGetUserList() {
        System.out.println("getUserList");
        UserList instance = new UserList();
        ArrayList<User> expResult = null;
        ArrayList<User> result = instance.getUserList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserList method, of class UserList.
     */
    @Test
    public void testSetUserList() {
        System.out.println("setUserList");
        ArrayList<User> userList = null;
        UserList instance = new UserList();
        instance.setUserList(userList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertU method, of class UserList.
     */
    @Test
    public void testInsertU() {
        System.out.println("insertU");
        User user = null;
        UserList instance = new UserList();
        boolean expResult = false;
        boolean result = instance.insertU(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readU method, of class UserList.
     */
    @Test
    public void testReadU() {
        System.out.println("readU");
        UserList instance = new UserList();
        boolean expResult = false;
        boolean result = instance.readU();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteList method, of class UserList.
     */
    @Test
    public void testDeleteList() {
        System.out.println("deleteList");
        UserList instance = new UserList();
        boolean expResult = false;
        boolean result = instance.deleteList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
