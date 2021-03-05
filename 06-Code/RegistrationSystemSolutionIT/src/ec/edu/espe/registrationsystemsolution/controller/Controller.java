/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.controller;

import ec.edu.espe.registrationsystemsolution.dataa.AdminList;
import ec.edu.espe.registrationsystemsolution.dataa.UserList;
import ec.edu.espe.registrationsystemsolution.view.FrmLogin;
import ec.edu.espe.registrationsystemsolution.view.FrmMainSystem;
import ec.edu.espe.registrationsystemsolution.view.FrmNewRequest;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class Controller implements ActionListener, KeyListener, MouseListener, MouseMotionListener {

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
        newRequest.getBtnNew().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login.getButtonLogin()) {
            boolean aux = false;
            String username1 = login.getTxtUser().getText();
            String password1 = login.getTxtPassword().getText();
            userList = new UserList();
            
            //userList.readU();
            mainSystem.setVisible(true);
            mainSystem.setLocationRelativeTo(null);
            login.setVisible(false);
            for (int i = 0; i < userList.getUserList().size(); i++) {
                if (username1.equals(userList.getUserList().get(i).getUsername())
                        && password1.equals(userList.getUserList().get(i).getPassword())) {
                    aux = true;
                    newRequest.getjLabel2().setText("Hola" + username1);
                    break;
                } else {
                    aux = false;
                }
            }
        }

        if (ae.getSource() == newRequest.getBtnShowRequest()) {
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

    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
