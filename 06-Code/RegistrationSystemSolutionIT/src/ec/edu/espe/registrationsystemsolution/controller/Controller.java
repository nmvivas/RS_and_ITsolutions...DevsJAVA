/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import ec.edu.espe.registrationsystemsolution.data.AdminList;
import ec.edu.espe.registrationsystemsolution.data.UserList;
import ec.edu.espe.registrationsystemsolution.utils.ConnectionMongodb;
import ec.edu.espe.registrationsystemsolution.view.FrmLogin;
import ec.edu.espe.registrationsystemsolution.view.FrmMainSystem;
import ec.edu.espe.registrationsystemsolution.view.FrmNewRequest;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class Controller implements ActionListener {

    //FRAMES
    FrmLogin login;
    FrmNewRequest newRequest;
    FrmMainSystem mainSystem;

    //MODELS
    UserList userList;
    AdminList adminList;

    //CONSTRUCTOR
    public Controller(FrmLogin login, FrmNewRequest newRequest, FrmMainSystem mainSystem, UserList userList, AdminList adminList) {
        this.login = login;
        this.newRequest = newRequest;
        this.mainSystem = mainSystem;
        this.userList = userList;
        this.adminList = adminList;

        //LOGIN    
        login.getButtonExit().addActionListener(this);
        login.getButtonLogin().addActionListener(this);

        //NEW REQUEST
        newRequest.getBtnShowRequest().addActionListener(this);
        newRequest.getBtnSave().addActionListener(this);
        newRequest.getBtnNew().addActionListener(this);
        newRequest.getBtnExit().addActionListener(this);

        //MAIN SYSTEM
        mainSystem.getjItemRequest().addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource().equals(mainSystem.getjItemRequest())) {
            mainSystem.hide();
            newRequest.setLocationRelativeTo(null);
            newRequest.show();
        }
        if (ae.getSource().equals(login.getButtonLogin())) {
            
            boolean aux = false;
            String username1 = login.getTxtUser().getText();
            String password1 = login.getTxtPassword().getText();
            userList = new UserList();
            //userList.readU();
            mainSystem.setVisible(true);
            mainSystem.setLocationRelativeTo(null);
            login.setVisible(false);
            System.out.println(userList.getUserList().size());
            for (int i = 0; i < userList.getUserList().size(); i++) {
                if (username1.equals(userList.getUserList().get(i).getUsername())
                        && password1.equals(userList.getUserList().get(i).getPassword())) {
                    aux = true;
                    break;
                } else {
                    aux = false;
                }
            }            
        }
        if (ae.getActionCommand().equals("Show Request")) {
            
            DefaultTableModel trequest = new DefaultTableModel();
            trequest.addColumn("Customer");
            trequest.addColumn("Type Problem");
            trequest.addColumn("State");
            trequest.addColumn("Technical");
            newRequest.getTblContents().setModel(trequest);
            
            String[] matriz = new String[8];
            try {
                matriz[0] = newRequest.getTxtCustomer().getText();
                matriz[1] = newRequest.getChkRemote().getText();
                matriz[2] = newRequest.getTxtState().getText();
                matriz[3] = newRequest.getTxtTechnical().getText();
                trequest.addRow(matriz);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        }
        if (ae.getSource().equals(newRequest.getBtnSave())) {
            String tyProblem = null;
            try {
                
                newRequest.setDbObject(new BasicDBObject());
                newRequest.setConnection(new ConnectionMongodb());
                newRequest.getDbObject().append("Customer: ", newRequest.getTxtCustomer().getText());
                newRequest.getDbObject().append("Problem: ", newRequest.getCmbProblem().getSelectedItem());
                if(newRequest.getChkRemote().isSelected()){
                    tyProblem = " Remote Solution ";
                } else if (newRequest.getChkIncident().isSelected()){
                  tyProblem = " Incident ";  
                }
                newRequest.getDbObject().append("Type Problem: ", tyProblem);
                newRequest.getDbObject().append("State: ", newRequest.getTxtState().getText().toString());
                newRequest.getDbObject().append("Technical: ", newRequest.getTxtTechnical().getText());
                newRequest.getConnection().getDbCollection().insert(newRequest.getDbObject());
                DBCursor searching = newRequest.getConnection().getDbCollection().find();
                if (searching != null) {
                    JOptionPane.showMessageDialog(null, "Saved Request");
                    newRequest.empty();
                } else {
                    JOptionPane.showMessageDialog(null, " ¡¡ ERROR !! ");
                    newRequest.empty();
                }
            } catch (Exception e) {
                System.err.println(e);
                
            }
            
        }
        if (ae.getSource().equals(newRequest.getBtnExit())) {
            newRequest.hide();
            mainSystem.setLocationRelativeTo(null);
            mainSystem.show();   
        }
        
    }
}
