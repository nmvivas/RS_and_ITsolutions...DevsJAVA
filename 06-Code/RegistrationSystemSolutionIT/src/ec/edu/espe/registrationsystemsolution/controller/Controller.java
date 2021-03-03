/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.controller;

import ec.edu.espe.registrationsystemsolution.data.AdminList;
import ec.edu.espe.registrationsystemsolution.view.FrmLogin;
import ec.edu.espe.registrationsystemsolution.view.FrmNewRequest;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author Meli
 */
public class Controller implements ActionListener, KeyListener, MouseListener, MouseMotionListener {

    FrmLogin login;
    FrmNewRequest newRequest;
    AdminList adminList;

    public Controller(FrmLogin login, FrmNewRequest newRequest, AdminList adminList) {
        this.login = login;
        this.newRequest = newRequest;
        this.adminList = adminList;

        
    login.getButtonCancelar().addActionListener(this);
    login.getButtonLogin().addActionListener(this);
    
   
    
        
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login.getButtonCancelar()) {
            login.getjLabel1().setVisible(true);
            boolean aux = false;
            String username1 = login.getTxtUser().getText();
            String password1 = login.getTxtPassword().getText();
            adminList = new AdminList();
            adminList.readA();
            for (int i = 0; i < adminList.getAdminList().size(); i++) {
                if (username1.equals(adminList.getAdminList().get(i).getNames())
                        && password1.equals(adminList.getAdminList().get(i).getSurnames())) {
                    aux = true;
                    newRequest.getjLabel2().setText("Hola" + username1);
                    break;
                } else {
                    aux = false;
                    System.exit(0);
                }
            }
            if (aux == true) {
                newRequest.setVisible(true);
                newRequest.setLocationRelativeTo(null);
                login.setVisible(false);
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
