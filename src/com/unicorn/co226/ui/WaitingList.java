/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicorn.co226.ui;

import com.unicorn.co226.controller.StudentController;
import com.unicorn.co226.model.Doctor;
import com.unicorn.co226.model.Student;
import com.unicorn.co226.model.WaitingListItem;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author Sithara
 */
public class WaitingList extends javax.swing.JDialog {

    private Student student;
    private Doctor doctor;
    private DefaultListModel<WaitingListItem> waitingListModel;
    private int urgentCount;

    /**
     * Creates new form WaitingList
     * @param parent
     * @param modal
     */
    public WaitingList(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        waitingListModel = new DefaultListModel();
        waitingList.setModel(waitingListModel);
        waitingList.setCellRenderer(new WaitingListCellRenderer());
    }
    public WaitingList(java.awt.Frame parent, boolean modal,Doctor doc) {
        super(parent, modal);
        doctor = doc;
        initComponents();
        waitingListModel = new DefaultListModel();
        waitingList.setModel(waitingListModel);
        waitingList.setCellRenderer(new WaitingListCellRenderer());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        waitingList = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        regNumberLbl = new javax.swing.JLabel();
        studentNameLbl = new javax.swing.JLabel();
        studentNameTxt = new javax.swing.JTextField();
        facultyLbl = new javax.swing.JLabel();
        facultyTxt = new javax.swing.JTextField();
        feverBtn = new javax.swing.JLabel();
        yesFeverRdBtn = new javax.swing.JRadioButton();
        noFeverRdBtn = new javax.swing.JRadioButton();
        preDiesesBtn = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        conditionLbl = new javax.swing.JLabel();
        normalRdBtn = new javax.swing.JRadioButton();
        urgentRdBtn = new javax.swing.JRadioButton();
        commentLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        commentBtn = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        deleteBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        registerTxt = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(53, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Waiting List");
        jLabel1.setOpaque(true);

        waitingList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                waitingListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(waitingList);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        regNumberLbl.setBackground(new java.awt.Color(255, 102, 102));
        regNumberLbl.setText("Registration Number");

        studentNameLbl.setBackground(new java.awt.Color(255, 153, 102));
        studentNameLbl.setText("Student Name");

        studentNameTxt.setEditable(false);
        studentNameTxt.setBackground(new java.awt.Color(255, 255, 255));

        facultyLbl.setText("Faculty");

        facultyTxt.setEditable(false);
        facultyTxt.setBackground(new java.awt.Color(255, 255, 255));

        feverBtn.setText("Fever Condition ");

        buttonGroup1.add(yesFeverRdBtn);
        yesFeverRdBtn.setText("YES");

        buttonGroup1.add(noFeverRdBtn);
        noFeverRdBtn.setSelected(true);
        noFeverRdBtn.setText("NO");

        preDiesesBtn.setText("Pre Diceases");

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("YES");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("NO");

        conditionLbl.setText("Condition");

        buttonGroup3.add(normalRdBtn);
        normalRdBtn.setSelected(true);
        normalRdBtn.setText("Normal");

        buttonGroup3.add(urgentRdBtn);
        urgentRdBtn.setText("Urgent");

        commentLbl.setText("Comments");

        commentBtn.setColumns(20);
        commentBtn.setRows(5);
        jScrollPane2.setViewportView(commentBtn);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1466206540_list-remove.png"))); // NOI18N
        deleteBtn.setText("DELETE");

        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-icon.png"))); // NOI18N
        editBtn.setText("EDIT");

        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button-Add-icon.png"))); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        clearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clear-icon.png"))); // NOI18N
        clearBtn.setText("CLEAR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        try {
            registerTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U-##-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        registerTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(studentNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(regNumberLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                                    .addComponent(facultyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(feverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(preDiesesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(conditionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(normalRdBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(urgentRdBtn))
                                    .addComponent(studentNameTxt)
                                    .addComponent(facultyTxt)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton3)
                                            .addComponent(yesFeverRdBtn))
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(noFeverRdBtn)
                                            .addComponent(jRadioButton4)))
                                    .addComponent(registerTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(commentLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regNumberLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facultyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facultyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(feverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yesFeverRdBtn)
                    .addComponent(noFeverRdBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preDiesesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urgentRdBtn)
                    .addComponent(normalRdBtn)
                    .addComponent(conditionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(commentLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if (student != null) {
            WaitingListItem waitingListItem = new WaitingListItem(student, yesFeverRdBtn.isSelected(), urgentRdBtn.isSelected());
            if (urgentRdBtn.isSelected()) {
                waitingListModel.add(urgentCount, waitingListItem);
            } else {
                waitingListModel.addElement(waitingListItem);
            }
            clearForm();
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void registerTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerTxtActionPerformed
        try {
            student = StudentController.getStudentByRegNo(registerTxt.getText());
            studentNameTxt.setText(student.getPatient().getName());
            facultyTxt.setText(student.getFaculty());
        } catch (SQLException ex) {
            Logger.getLogger(WaitingList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(WaitingList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_registerTxtActionPerformed

    private void waitingListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_waitingListMouseClicked
        if (evt.getClickCount() == 2) {
            Student st = ((WaitingListItem)waitingList.getSelectedValue()).getStudent();
            
        }
    }//GEN-LAST:event_waitingListMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WaitingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WaitingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WaitingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WaitingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            WaitingList dialog = new WaitingList(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextArea commentBtn;
    private javax.swing.JLabel commentLbl;
    private javax.swing.JLabel conditionLbl;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel facultyLbl;
    private javax.swing.JTextField facultyTxt;
    private javax.swing.JLabel feverBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton noFeverRdBtn;
    private javax.swing.JRadioButton normalRdBtn;
    private javax.swing.JLabel preDiesesBtn;
    private javax.swing.JLabel regNumberLbl;
    private javax.swing.JFormattedTextField registerTxt;
    private javax.swing.JLabel studentNameLbl;
    private javax.swing.JTextField studentNameTxt;
    private javax.swing.JRadioButton urgentRdBtn;
    private javax.swing.JList waitingList;
    private javax.swing.JRadioButton yesFeverRdBtn;
    // End of variables declaration//GEN-END:variables

    private void clearForm() {
        registerTxt.setText("");
        student = null;
        studentNameTxt.setText("");
        facultyTxt.setText("");
        noFeverRdBtn.setSelected(true);
        normalRdBtn.setSelected(true);
    }

    private class WaitingListCellRenderer extends DefaultListCellRenderer {

        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            JLabel cell = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); //To change body of generated methods, choose Tools | Templates.
           // JLabel cell = new JLabel();
            cell.setPreferredSize(new Dimension(25, 30));
            cell.setFont(new Font("Tahoma", Font.PLAIN, 15));
            cell.setOpaque(true);
            if (value instanceof WaitingListItem) {
                WaitingListItem item = (WaitingListItem) value;
                if (item.hasFever()) {
                    cell.setBackground(new Color(255, 153, 102));
                }

                if (item.isUrgent()) {
                    cell.setBackground(new Color(255, 102, 102));
                }
                cell.setText(value.toString());
            }
            if (index % 2 == 0) {
                cell.setForeground(Color.darkGray);
            }
            //else cell.setForeground(Color.red);
            return cell;

        }

    }
}
