/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.view;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.WriteResult;
import ec.edu.espe.registrationsystemsolution.data.ConnectionMongodb;
import javax.swing.JOptionPane;

/**
 *
 * @author karen
 */
public class FrmNewRequest extends javax.swing.JFrame {

    private BasicDBObject dbObject;
    private ConnectionMongodb connection;

    /**
     * Creates new form FrmSystem
     */
    public FrmNewRequest() {
        initComponents();
    }

    public void empty() {
        getTxtCustomer().setText("");
        getCmbProblem().setSelectedIndex(0);
        getTxtState().setText("");
        getTxtTechnical().setText("");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        popupMenu1 = new java.awt.PopupMenu();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCustomer = new javax.swing.JTextField();
        cmbProblem = new javax.swing.JComboBox<>();
        chkRemote = new javax.swing.JCheckBox();
        chkIncident = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTechnical = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContents = new javax.swing.JTable();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu3.setText("jMenu3");

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("-------------- REGISTRATION SYSTEM SOLUTIONS TI --------------------------");

        jLabel3.setText("New Request_____________________________________________________________________________________");

        jLabel4.setText("Customer:  ");

        jLabel6.setText("Problem: ");

        jLabel7.setText("Type Problem: ");

        cmbProblem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operating System Failures", "RAM issues", "Slow running", "Computer infected with virus", "Graphics card failures", "Computer shuts down by itself or restarts every two to three" }));

        chkRemote.setText("Remote Solution");

        chkIncident.setText("Incident");

        jLabel1.setText("State: ");

        txtState.setText("pendient"); // NOI18N

        jLabel8.setText("Technical: ");

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");

        btnCancel.setText("Cancel");

        btnPrint.setText("To Print");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(43, 43, 43))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cmbProblem, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(chkRemote)
                                .addGap(18, 18, 18)
                                .addComponent(chkIncident))
                            .addComponent(txtTechnical)
                            .addComponent(txtState)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(btnCancel)
                        .addGap(30, 30, 30)
                        .addComponent(btnPrint)
                        .addGap(28, 28, 28)
                        .addComponent(btnExit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbProblem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTechnical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkRemote)
                        .addComponent(chkIncident)))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancel)
                        .addComponent(btnPrint)
                        .addComponent(btnExit))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEdit)
                        .addComponent(btnDelete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tblContents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer ", "Type Problem", "State", "Technical"
            }
        ));
        jScrollPane1.setViewportView(tblContents);
        if (tblContents.getColumnModel().getColumnCount() > 0) {
            tblContents.getColumnModel().getColumn(0).setHeaderValue("Customer ");
            tblContents.getColumnModel().getColumn(1).setHeaderValue("Type Problem");
            tblContents.getColumnModel().getColumn(2).setHeaderValue("State");
            tblContents.getColumnModel().getColumn(3).setHeaderValue("Technical");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(377, 377, 377))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        try {
            setDbObject(new BasicDBObject());
            setConnection(new ConnectionMongodb());
            getDbObject().append("Customer: ", getTxtCustomer().getText());
            getDbObject().append("Problem: ", getCmbProblem().getSelectedItem());
            getDbObject().append(" Type - problem", getChkRemote().getSelectedIcon());
            getDbObject().append("State: ", getTxtState().getText().toString());
            getDbObject().append("Technical", getTxtTechnical().getText());
            getConnection().getDbCollection().insert(getDbObject());

            DBCursor res = getConnection().getDbCollection().find();
            if (res != null) {
                JOptionPane.showMessageDialog(null, "Saved Request");
                empty();
            } else {
                JOptionPane.showMessageDialog(null, " ¡¡ ERROR !! ");
                empty();
            }
        } catch (Exception e) {
            System.err.println(e);

        }


    }//GEN-LAST:event_btnNewActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        setDbObject(new BasicDBObject());
        setConnection(new ConnectionMongodb());
        
        getDbObject().append("Customer: ", getTxtCustomer().getText());
    }//GEN-LAST:event_btnEditActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmNewRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNewRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNewRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNewRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNewRequest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnPrint;
    private javax.swing.JCheckBox chkIncident;
    private javax.swing.JCheckBox chkRemote;
    private javax.swing.JComboBox<String> cmbProblem;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTable tblContents;
    private javax.swing.JTextField txtCustomer;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtTechnical;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the dbObject
     */
    public BasicDBObject getDbObject() {
        return dbObject;
    }

    /**
     * @param dbObject the dbObject to set
     */
    public void setDbObject(BasicDBObject dbObject) {
        this.dbObject = dbObject;
    }

    /**
     * @return the connection
     */
    public ConnectionMongodb getConnection() {
        return connection;
    }

    /**
     * @param connection the connection to set
     */
    public void setConnection(ConnectionMongodb connection) {
        this.connection = connection;
    }

    /**
     * @return the btnCancel
     */
    public javax.swing.JButton getBtnCancel() {
        return btnCancel;
    }

    /**
     * @param btnCancel the btnCancel to set
     */
    public void setBtnCancel(javax.swing.JButton btnCancel) {
        this.btnCancel = btnCancel;
    }

    /**
     * @return the btnDelete
     */
    public javax.swing.JButton getBtnDelete() {
        return btnDelete;
    }

    /**
     * @param btnDelete the btnDelete to set
     */
    public void setBtnDelete(javax.swing.JButton btnDelete) {
        this.btnDelete = btnDelete;
    }

    /**
     * @return the btnEdit
     */
    public javax.swing.JButton getBtnEdit() {
        return btnEdit;
    }

    /**
     * @param btnEdit the btnEdit to set
     */
    public void setBtnEdit(javax.swing.JButton btnEdit) {
        this.btnEdit = btnEdit;
    }

    /**
     * @return the btnExit
     */
    public javax.swing.JButton getBtnExit() {
        return btnExit;
    }

    /**
     * @param btnExit the btnExit to set
     */
    public void setBtnExit(javax.swing.JButton btnExit) {
        this.btnExit = btnExit;
    }

    /**
     * @return the btnNew
     */
    public javax.swing.JButton getBtnNew() {
        return btnNew;
    }

    /**
     * @param btnNew the btnNew to set
     */
    public void setBtnNew(javax.swing.JButton btnNew) {
        this.btnNew = btnNew;
    }

    /**
     * @return the btnPrint
     */
    public javax.swing.JButton getBtnPrint() {
        return btnPrint;
    }

    /**
     * @param btnPrint the btnPrint to set
     */
    public void setBtnPrint(javax.swing.JButton btnPrint) {
        this.btnPrint = btnPrint;
    }

    /**
     * @return the chkIncident
     */
    public javax.swing.JCheckBox getChkIncident() {
        return chkIncident;
    }

    /**
     * @param chkIncident the chkIncident to set
     */
    public void setChkIncident(javax.swing.JCheckBox chkIncident) {
        this.chkIncident = chkIncident;
    }

    /**
     * @return the chkRemote
     */
    public javax.swing.JCheckBox getChkRemote() {
        return chkRemote;
    }

    /**
     * @param chkRemote the chkRemote to set
     */
    public void setChkRemote(javax.swing.JCheckBox chkRemote) {
        this.chkRemote = chkRemote;
    }

    /**
     * @return the cmbProblem
     */
    public javax.swing.JComboBox<String> getCmbProblem() {
        return cmbProblem;
    }

    /**
     * @param cmbProblem the cmbProblem to set
     */
    public void setCmbProblem(javax.swing.JComboBox<String> cmbProblem) {
        this.cmbProblem = cmbProblem;
    }

    /**
     * @return the jCheckBoxMenuItem1
     */
    public javax.swing.JCheckBoxMenuItem getjCheckBoxMenuItem1() {
        return jCheckBoxMenuItem1;
    }

    /**
     * @param jCheckBoxMenuItem1 the jCheckBoxMenuItem1 to set
     */
    public void setjCheckBoxMenuItem1(javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1) {
        this.jCheckBoxMenuItem1 = jCheckBoxMenuItem1;
    }

    /**
     * @return the jLabel1
     */
    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    /**
     * @param jLabel1 the jLabel1 to set
     */
    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    /**
     * @return the jLabel2
     */
    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    /**
     * @param jLabel2 the jLabel2 to set
     */
    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    /**
     * @return the jLabel3
     */
    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    /**
     * @param jLabel3 the jLabel3 to set
     */
    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    /**
     * @return the jLabel4
     */
    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }

    /**
     * @param jLabel4 the jLabel4 to set
     */
    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    /**
     * @return the jLabel5
     */
    public javax.swing.JLabel getjLabel5() {
        return jLabel5;
    }

    /**
     * @param jLabel5 the jLabel5 to set
     */
    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    /**
     * @return the jLabel6
     */
    public javax.swing.JLabel getjLabel6() {
        return jLabel6;
    }

    /**
     * @param jLabel6 the jLabel6 to set
     */
    public void setjLabel6(javax.swing.JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    /**
     * @return the jLabel7
     */
    public javax.swing.JLabel getjLabel7() {
        return jLabel7;
    }

    /**
     * @param jLabel7 the jLabel7 to set
     */
    public void setjLabel7(javax.swing.JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    /**
     * @return the jLabel8
     */
    public javax.swing.JLabel getjLabel8() {
        return jLabel8;
    }

    /**
     * @param jLabel8 the jLabel8 to set
     */
    public void setjLabel8(javax.swing.JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    /**
     * @return the jMenu1
     */
    public javax.swing.JMenu getjMenu1() {
        return jMenu1;
    }

    /**
     * @param jMenu1 the jMenu1 to set
     */
    public void setjMenu1(javax.swing.JMenu jMenu1) {
        this.jMenu1 = jMenu1;
    }

    /**
     * @return the jMenu2
     */
    public javax.swing.JMenu getjMenu2() {
        return jMenu2;
    }

    /**
     * @param jMenu2 the jMenu2 to set
     */
    public void setjMenu2(javax.swing.JMenu jMenu2) {
        this.jMenu2 = jMenu2;
    }

    /**
     * @return the jMenu3
     */
    public javax.swing.JMenu getjMenu3() {
        return jMenu3;
    }

    /**
     * @param jMenu3 the jMenu3 to set
     */
    public void setjMenu3(javax.swing.JMenu jMenu3) {
        this.jMenu3 = jMenu3;
    }

    /**
     * @return the jMenuItem1
     */
    public javax.swing.JMenuItem getjMenuItem1() {
        return jMenuItem1;
    }

    /**
     * @param jMenuItem1 the jMenuItem1 to set
     */
    public void setjMenuItem1(javax.swing.JMenuItem jMenuItem1) {
        this.jMenuItem1 = jMenuItem1;
    }

    /**
     * @return the jPanel2
     */
    public javax.swing.JPanel getjPanel2() {
        return jPanel2;
    }

    /**
     * @param jPanel2 the jPanel2 to set
     */
    public void setjPanel2(javax.swing.JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    /**
     * @return the jPopupMenu1
     */
    public javax.swing.JPopupMenu getjPopupMenu1() {
        return jPopupMenu1;
    }

    /**
     * @param jPopupMenu1 the jPopupMenu1 to set
     */
    public void setjPopupMenu1(javax.swing.JPopupMenu jPopupMenu1) {
        this.jPopupMenu1 = jPopupMenu1;
    }

    /**
     * @return the jPopupMenu2
     */
    public javax.swing.JPopupMenu getjPopupMenu2() {
        return jPopupMenu2;
    }

    /**
     * @param jPopupMenu2 the jPopupMenu2 to set
     */
    public void setjPopupMenu2(javax.swing.JPopupMenu jPopupMenu2) {
        this.jPopupMenu2 = jPopupMenu2;
    }

    /**
     * @return the jRadioButtonMenuItem1
     */
    public javax.swing.JRadioButtonMenuItem getjRadioButtonMenuItem1() {
        return jRadioButtonMenuItem1;
    }

    /**
     * @param jRadioButtonMenuItem1 the jRadioButtonMenuItem1 to set
     */
    public void setjRadioButtonMenuItem1(javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1) {
        this.jRadioButtonMenuItem1 = jRadioButtonMenuItem1;
    }

    /**
     * @return the jScrollPane1
     */
    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * @param jScrollPane1 the jScrollPane1 to set
     */
    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    /**
     * @return the popupMenu1
     */
    public java.awt.PopupMenu getPopupMenu1() {
        return popupMenu1;
    }

    /**
     * @param popupMenu1 the popupMenu1 to set
     */
    public void setPopupMenu1(java.awt.PopupMenu popupMenu1) {
        this.popupMenu1 = popupMenu1;
    }

    /**
     * @return the tblContents
     */
    public javax.swing.JTable getTblContents() {
        return tblContents;
    }

    /**
     * @param tblContents the tblContents to set
     */
    public void setTblContents(javax.swing.JTable tblContents) {
        this.tblContents = tblContents;
    }

    /**
     * @return the txtCustomer
     */
    public javax.swing.JTextField getTxtCustomer() {
        return txtCustomer;
    }

    /**
     * @param txtCustomer the txtCustomer to set
     */
    public void setTxtCustomer(javax.swing.JTextField txtCustomer) {
        this.txtCustomer = txtCustomer;
    }

    /**
     * @return the txtState
     */
    public javax.swing.JTextField getTxtState() {
        return txtState;
    }

    /**
     * @param txtState the txtState to set
     */
    public void setTxtState(javax.swing.JTextField txtState) {
        this.txtState = txtState;
    }

    /**
     * @return the txtTechnical
     */
    public javax.swing.JTextField getTxtTechnical() {
        return txtTechnical;
    }

    /**
     * @param txtTechnical the txtTechnical to set
     */
    public void setTxtTechnical(javax.swing.JTextField txtTechnical) {
        this.txtTechnical = txtTechnical;
    }
}
