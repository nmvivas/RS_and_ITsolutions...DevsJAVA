/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.view;

import com.mongodb.BasicDBObject;
import ec.edu.espe.registrationsystemsolution.controller.ConnectionMongodb;
import java.awt.PopupMenu;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruben
 */
public class FrmNewRequestTest {
    
    public FrmNewRequestTest() {
    }

    /**
     * Test of empty method, of class FrmNewRequest.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        FrmNewRequest instance = new FrmNewRequest();
        instance.empty();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showRrequest method, of class FrmNewRequest.
     */
    @Test
    public void testShowRrequest() {
        System.out.println("showRrequest");
        FrmNewRequest instance = new FrmNewRequest();
        instance.showRrequest();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FrmNewRequest.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FrmNewRequest.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDbObject method, of class FrmNewRequest.
     */
    @Test
    public void testGetDbObject() {
        System.out.println("getDbObject");
        FrmNewRequest instance = new FrmNewRequest();
        BasicDBObject expResult = null;
        BasicDBObject result = instance.getDbObject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDbObject method, of class FrmNewRequest.
     */
    @Test
    public void testSetDbObject() {
        System.out.println("setDbObject");
        BasicDBObject dbObject = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setDbObject(dbObject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnection method, of class FrmNewRequest.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        FrmNewRequest instance = new FrmNewRequest();
        ConnectionMongodb expResult = null;
        ConnectionMongodb result = instance.getConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConnection method, of class FrmNewRequest.
     */
    @Test
    public void testSetConnection() {
        System.out.println("setConnection");
        ConnectionMongodb connection = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setConnection(connection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBtnCancel method, of class FrmNewRequest.
     */
    @Test
    public void testGetBtnCancel() {
        System.out.println("getBtnCancel");
        FrmNewRequest instance = new FrmNewRequest();
        JButton expResult = null;
        JButton result = instance.getBtnCancel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBtnCancel method, of class FrmNewRequest.
     */
    @Test
    public void testSetBtnCancel() {
        System.out.println("setBtnCancel");
        JButton btnCancel = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setBtnCancel(btnCancel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBtnDelete method, of class FrmNewRequest.
     */
    @Test
    public void testGetBtnDelete() {
        System.out.println("getBtnDelete");
        FrmNewRequest instance = new FrmNewRequest();
        JButton expResult = null;
        JButton result = instance.getBtnDelete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBtnDelete method, of class FrmNewRequest.
     */
    @Test
    public void testSetBtnDelete() {
        System.out.println("setBtnDelete");
        JButton btnDelete = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setBtnDelete(btnDelete);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBtnEdit method, of class FrmNewRequest.
     */
    @Test
    public void testGetBtnEdit() {
        System.out.println("getBtnEdit");
        FrmNewRequest instance = new FrmNewRequest();
        JButton expResult = null;
        JButton result = instance.getBtnEdit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBtnEdit method, of class FrmNewRequest.
     */
    @Test
    public void testSetBtnEdit() {
        System.out.println("setBtnEdit");
        JButton btnEdit = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setBtnEdit(btnEdit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBtnExit method, of class FrmNewRequest.
     */
    @Test
    public void testGetBtnExit() {
        System.out.println("getBtnExit");
        FrmNewRequest instance = new FrmNewRequest();
        JButton expResult = null;
        JButton result = instance.getBtnExit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBtnExit method, of class FrmNewRequest.
     */
    @Test
    public void testSetBtnExit() {
        System.out.println("setBtnExit");
        JButton btnExit = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setBtnExit(btnExit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBtnNew method, of class FrmNewRequest.
     */
    @Test
    public void testGetBtnNew() {
        System.out.println("getBtnNew");
        FrmNewRequest instance = new FrmNewRequest();
        JButton expResult = null;
        JButton result = instance.getBtnNew();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBtnNew method, of class FrmNewRequest.
     */
    @Test
    public void testSetBtnNew() {
        System.out.println("setBtnNew");
        JButton btnNew = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setBtnNew(btnNew);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBtnPrint method, of class FrmNewRequest.
     */
    @Test
    public void testGetBtnPrint() {
        System.out.println("getBtnPrint");
        FrmNewRequest instance = new FrmNewRequest();
        JButton expResult = null;
        JButton result = instance.getBtnPrint();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBtnPrint method, of class FrmNewRequest.
     */
    @Test
    public void testSetBtnPrint() {
        System.out.println("setBtnPrint");
        JButton btnPrint = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setBtnPrint(btnPrint);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChkIncident method, of class FrmNewRequest.
     */
    @Test
    public void testGetChkIncident() {
        System.out.println("getChkIncident");
        FrmNewRequest instance = new FrmNewRequest();
        JCheckBox expResult = null;
        JCheckBox result = instance.getChkIncident();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChkIncident method, of class FrmNewRequest.
     */
    @Test
    public void testSetChkIncident() {
        System.out.println("setChkIncident");
        JCheckBox chkIncident = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setChkIncident(chkIncident);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChkRemote method, of class FrmNewRequest.
     */
    @Test
    public void testGetChkRemote() {
        System.out.println("getChkRemote");
        FrmNewRequest instance = new FrmNewRequest();
        JCheckBox expResult = null;
        JCheckBox result = instance.getChkRemote();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChkRemote method, of class FrmNewRequest.
     */
    @Test
    public void testSetChkRemote() {
        System.out.println("setChkRemote");
        JCheckBox chkRemote = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setChkRemote(chkRemote);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCmbProblem method, of class FrmNewRequest.
     */
    @Test
    public void testGetCmbProblem() {
        System.out.println("getCmbProblem");
        FrmNewRequest instance = new FrmNewRequest();
        JComboBox<String> expResult = null;
        JComboBox<String> result = instance.getCmbProblem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCmbProblem method, of class FrmNewRequest.
     */
    @Test
    public void testSetCmbProblem() {
        System.out.println("setCmbProblem");
        JComboBox<String> cmbProblem = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setCmbProblem(cmbProblem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjCheckBoxMenuItem1 method, of class FrmNewRequest.
     */
    @Test
    public void testGetjCheckBoxMenuItem1() {
        System.out.println("getjCheckBoxMenuItem1");
        FrmNewRequest instance = new FrmNewRequest();
        JCheckBoxMenuItem expResult = null;
        JCheckBoxMenuItem result = instance.getjCheckBoxMenuItem1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setjCheckBoxMenuItem1 method, of class FrmNewRequest.
     */
    @Test
    public void testSetjCheckBoxMenuItem1() {
        System.out.println("setjCheckBoxMenuItem1");
        JCheckBoxMenuItem jCheckBoxMenuItem1 = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setjCheckBoxMenuItem1(jCheckBoxMenuItem1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjLabel1 method, of class FrmNewRequest.
     */
    @Test
    public void testGetjLabel1() {
        System.out.println("getjLabel1");
        FrmNewRequest instance = new FrmNewRequest();
        JLabel expResult = null;
        JLabel result = instance.getjLabel1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setjLabel1 method, of class FrmNewRequest.
     */
    @Test
    public void testSetjLabel1() {
        System.out.println("setjLabel1");
        JLabel jLabel1 = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setjLabel1(jLabel1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjLabel2 method, of class FrmNewRequest.
     */
    @Test
    public void testGetjLabel2() {
        System.out.println("getjLabel2");
        FrmNewRequest instance = new FrmNewRequest();
        JLabel expResult = null;
        JLabel result = instance.getjLabel2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setjLabel2 method, of class FrmNewRequest.
     */
    @Test
    public void testSetjLabel2() {
        System.out.println("setjLabel2");
        JLabel jLabel2 = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setjLabel2(jLabel2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjLabel3 method, of class FrmNewRequest.
     */
    @Test
    public void testGetjLabel3() {
        System.out.println("getjLabel3");
        FrmNewRequest instance = new FrmNewRequest();
        JLabel expResult = null;
        JLabel result = instance.getjLabel3();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setjLabel3 method, of class FrmNewRequest.
     */
    @Test
    public void testSetjLabel3() {
        System.out.println("setjLabel3");
        JLabel jLabel3 = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setjLabel3(jLabel3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjLabel4 method, of class FrmNewRequest.
     */
    @Test
    public void testGetjLabel4() {
        System.out.println("getjLabel4");
        FrmNewRequest instance = new FrmNewRequest();
        JLabel expResult = null;
        JLabel result = instance.getjLabel4();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setjLabel4 method, of class FrmNewRequest.
     */
    @Test
    public void testSetjLabel4() {
        System.out.println("setjLabel4");
        JLabel jLabel4 = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setjLabel4(jLabel4);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjLabel5 method, of class FrmNewRequest.
     */
    @Test
    public void testGetjLabel5() {
        System.out.println("getjLabel5");
        FrmNewRequest instance = new FrmNewRequest();
        JLabel expResult = null;
        JLabel result = instance.getjLabel5();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setjLabel5 method, of class FrmNewRequest.
     */
    @Test
    public void testSetjLabel5() {
        System.out.println("setjLabel5");
        JLabel jLabel5 = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setjLabel5(jLabel5);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjLabel6 method, of class FrmNewRequest.
     */
    @Test
    public void testGetjLabel6() {
        System.out.println("getjLabel6");
        FrmNewRequest instance = new FrmNewRequest();
        JLabel expResult = null;
        JLabel result = instance.getjLabel6();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setjLabel6 method, of class FrmNewRequest.
     */
    @Test
    public void testSetjLabel6() {
        System.out.println("setjLabel6");
        JLabel jLabel6 = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setjLabel6(jLabel6);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjLabel7 method, of class FrmNewRequest.
     */
    @Test
    public void testGetjLabel7() {
        System.out.println("getjLabel7");
        FrmNewRequest instance = new FrmNewRequest();
        JLabel expResult = null;
        JLabel result = instance.getjLabel7();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setjLabel7 method, of class FrmNewRequest.
     */
    @Test
    public void testSetjLabel7() {
        System.out.println("setjLabel7");
        JLabel jLabel7 = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setjLabel7(jLabel7);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjLabel8 method, of class FrmNewRequest.
     */
    @Test
    public void testGetjLabel8() {
        System.out.println("getjLabel8");
        FrmNewRequest instance = new FrmNewRequest();
        JLabel expResult = null;
        JLabel result = instance.getjLabel8();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setjLabel8 method, of class FrmNewRequest.
     */
    @Test
    public void testSetjLabel8() {
        System.out.println("setjLabel8");
        JLabel jLabel8 = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setjLabel8(jLabel8);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjMenu1 method, of class FrmNewRequest.
     */
    @Test
    public void testGetjMenu1() {
        System.out.println("getjMenu1");
        FrmNewRequest instance = new FrmNewRequest();
        JMenu expResult = null;
        JMenu result = instance.getjMenu1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setjMenu1 method, of class FrmNewRequest.
     */
    @Test
    public void testSetjMenu1() {
        System.out.println("setjMenu1");
        JMenu jMenu1 = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setjMenu1(jMenu1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjMenu2 method, of class FrmNewRequest.
     */
    @Test
    public void testGetjMenu2() {
        System.out.println("getjMenu2");
        FrmNewRequest instance = new FrmNewRequest();
        JMenu expResult = null;
        JMenu result = instance.getjMenu2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setjMenu2 method, of class FrmNewRequest.
     */
    @Test
    public void testSetjMenu2() {
        System.out.println("setjMenu2");
        JMenu jMenu2 = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setjMenu2(jMenu2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjMenu3 method, of class FrmNewRequest.
     */
    @Test
    public void testGetjMenu3() {
        System.out.println("getjMenu3");
        FrmNewRequest instance = new FrmNewRequest();
        JMenu expResult = null;
        JMenu result = instance.getjMenu3();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setjMenu3 method, of class FrmNewRequest.
     */
    @Test
    public void testSetjMenu3() {
        System.out.println("setjMenu3");
        JMenu jMenu3 = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setjMenu3(jMenu3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjMenuItem1 method, of class FrmNewRequest.
     */
    @Test
    public void testGetjMenuItem1() {
        System.out.println("getjMenuItem1");
        FrmNewRequest instance = new FrmNewRequest();
        JMenuItem expResult = null;
        JMenuItem result = instance.getjMenuItem1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setjMenuItem1 method, of class FrmNewRequest.
     */
    @Test
    public void testSetjMenuItem1() {
        System.out.println("setjMenuItem1");
        JMenuItem jMenuItem1 = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setjMenuItem1(jMenuItem1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjPanel2 method, of class FrmNewRequest.
     */
    @Test
    public void testGetjPanel2() {
        System.out.println("getjPanel2");
        FrmNewRequest instance = new FrmNewRequest();
        JPanel expResult = null;
        JPanel result = instance.getjPanel2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setjPanel2 method, of class FrmNewRequest.
     */
    @Test
    public void testSetjPanel2() {
        System.out.println("setjPanel2");
        JPanel jPanel2 = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setjPanel2(jPanel2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjPopupMenu1 method, of class FrmNewRequest.
     */
    @Test
    public void testGetjPopupMenu1() {
        System.out.println("getjPopupMenu1");
        FrmNewRequest instance = new FrmNewRequest();
        JPopupMenu expResult = null;
        JPopupMenu result = instance.getjPopupMenu1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setjPopupMenu1 method, of class FrmNewRequest.
     */
    @Test
    public void testSetjPopupMenu1() {
        System.out.println("setjPopupMenu1");
        JPopupMenu jPopupMenu1 = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setjPopupMenu1(jPopupMenu1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjPopupMenu2 method, of class FrmNewRequest.
     */
    @Test
    public void testGetjPopupMenu2() {
        System.out.println("getjPopupMenu2");
        FrmNewRequest instance = new FrmNewRequest();
        JPopupMenu expResult = null;
        JPopupMenu result = instance.getjPopupMenu2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setjPopupMenu2 method, of class FrmNewRequest.
     */
    @Test
    public void testSetjPopupMenu2() {
        System.out.println("setjPopupMenu2");
        JPopupMenu jPopupMenu2 = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setjPopupMenu2(jPopupMenu2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjRadioButtonMenuItem1 method, of class FrmNewRequest.
     */
    @Test
    public void testGetjRadioButtonMenuItem1() {
        System.out.println("getjRadioButtonMenuItem1");
        FrmNewRequest instance = new FrmNewRequest();
        JRadioButtonMenuItem expResult = null;
        JRadioButtonMenuItem result = instance.getjRadioButtonMenuItem1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setjRadioButtonMenuItem1 method, of class FrmNewRequest.
     */
    @Test
    public void testSetjRadioButtonMenuItem1() {
        System.out.println("setjRadioButtonMenuItem1");
        JRadioButtonMenuItem jRadioButtonMenuItem1 = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setjRadioButtonMenuItem1(jRadioButtonMenuItem1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjScrollPane1 method, of class FrmNewRequest.
     */
    @Test
    public void testGetjScrollPane1() {
        System.out.println("getjScrollPane1");
        FrmNewRequest instance = new FrmNewRequest();
        JScrollPane expResult = null;
        JScrollPane result = instance.getjScrollPane1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setjScrollPane1 method, of class FrmNewRequest.
     */
    @Test
    public void testSetjScrollPane1() {
        System.out.println("setjScrollPane1");
        JScrollPane jScrollPane1 = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setjScrollPane1(jScrollPane1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPopupMenu1 method, of class FrmNewRequest.
     */
    @Test
    public void testGetPopupMenu1() {
        System.out.println("getPopupMenu1");
        FrmNewRequest instance = new FrmNewRequest();
        PopupMenu expResult = null;
        PopupMenu result = instance.getPopupMenu1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPopupMenu1 method, of class FrmNewRequest.
     */
    @Test
    public void testSetPopupMenu1() {
        System.out.println("setPopupMenu1");
        PopupMenu popupMenu1 = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setPopupMenu1(popupMenu1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTblContents method, of class FrmNewRequest.
     */
    @Test
    public void testGetTblContents() {
        System.out.println("getTblContents");
        FrmNewRequest instance = new FrmNewRequest();
        JTable expResult = null;
        JTable result = instance.getTblContents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTblContents method, of class FrmNewRequest.
     */
    @Test
    public void testSetTblContents() {
        System.out.println("setTblContents");
        JTable tblContents = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setTblContents(tblContents);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTxtCustomer method, of class FrmNewRequest.
     */
    @Test
    public void testGetTxtCustomer() {
        System.out.println("getTxtCustomer");
        FrmNewRequest instance = new FrmNewRequest();
        JTextField expResult = null;
        JTextField result = instance.getTxtCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTxtCustomer method, of class FrmNewRequest.
     */
    @Test
    public void testSetTxtCustomer() {
        System.out.println("setTxtCustomer");
        JTextField txtCustomer = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setTxtCustomer(txtCustomer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTxtState method, of class FrmNewRequest.
     */
    @Test
    public void testGetTxtState() {
        System.out.println("getTxtState");
        FrmNewRequest instance = new FrmNewRequest();
        JTextField expResult = null;
        JTextField result = instance.getTxtState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTxtState method, of class FrmNewRequest.
     */
    @Test
    public void testSetTxtState() {
        System.out.println("setTxtState");
        JTextField txtState = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setTxtState(txtState);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTxtTechnical method, of class FrmNewRequest.
     */
    @Test
    public void testGetTxtTechnical() {
        System.out.println("getTxtTechnical");
        FrmNewRequest instance = new FrmNewRequest();
        JTextField expResult = null;
        JTextField result = instance.getTxtTechnical();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTxtTechnical method, of class FrmNewRequest.
     */
    @Test
    public void testSetTxtTechnical() {
        System.out.println("setTxtTechnical");
        JTextField txtTechnical = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setTxtTechnical(txtTechnical);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBtnShowRequest method, of class FrmNewRequest.
     */
    @Test
    public void testGetBtnShowRequest() {
        System.out.println("getBtnShowRequest");
        FrmNewRequest instance = new FrmNewRequest();
        JButton expResult = null;
        JButton result = instance.getBtnShowRequest();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBtnShowRequest method, of class FrmNewRequest.
     */
    @Test
    public void testSetBtnShowRequest() {
        System.out.println("setBtnShowRequest");
        JButton btnShowRequest = null;
        FrmNewRequest instance = new FrmNewRequest();
        instance.setBtnShowRequest(btnShowRequest);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
