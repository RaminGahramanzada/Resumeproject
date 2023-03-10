/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.company.resume.panel;

import com.company.dao.inter.SkillDaoInter;
import com.company.dao.inter.UserSkillDaoInter;
import com.company.entity.Skill;
import com.company.entity.User;
import com.company.entity.UserSkill;
import com.company.main.Context;
import com.company.resume.Config;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class SkillsPanel extends javax.swing.JPanel {

    private SkillDaoInter skillDao = Context.instanceSkillDao();
    private UserSkillDaoInter userSkillDao = Context.instanceUserSkillDao();
    /**
     * Creates new form SkillsPanel
     */
    public SkillsPanel() {
        initComponents();
       
    }
    private void fillWindow(){
        List<Skill>skills = skillDao.getAll();
       for(Skill item: skills){
        cbSkill.addItem(item);
    }
       fillTable();
    }
    private List<UserSkill> list;
    private void fillTable(){
      User user = Config.loggedInUser;
        System.out.println("user=" + user);
        int id = user.getId();
        list = userSkillDao.getAllSkillByUserId(id);

        Vector<Vector> rows = new Vector<>();
        for (UserSkill l : list) {
            Vector<Object> row = new Vector<>();
            row.add(l.getSkill());
            row.add(l.getPower());
            rows.add(row);
        }

        Vector<String> columns = new Vector<>();
        columns.add("Skill");
        columns.add("Power");

        DefaultTableModel model = new DefaultTableModel(rows, columns);

        tblSkills.setModel(model);
    }
   
    public void fillUserComponents(){
    fillWindow();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSkills = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtSkillName = new javax.swing.JTextField();
        lblPower = new javax.swing.JLabel();
        sliderPower = new javax.swing.JSlider();
        cbSkill = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        lblSkill = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();

        tblSkills.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblSkills);

        txtSkillName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSkillNameActionPerformed(evt);
            }
        });

        lblPower.setText("Power");

        sliderPower.setMaximum(10);
        sliderPower.setMinimum(1);
        sliderPower.setPaintLabels(true);
        sliderPower.setValue(1);

        cbSkill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSkillActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblSkill.setText("Skill");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblSkill, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSkill, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(txtSkillName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPower, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderPower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnDelete)
                .addGap(33, 33, 33)
                .addComponent(btnSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSkillName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSkill, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbSkill, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPower)
                    .addComponent(sliderPower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnSave))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSkillNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSkillNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSkillNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
      String skillName = txtSkillName.getText();
      
        Skill skill = null;
        if (skillName != null && !skillName.trim().isEmpty()) {
            skill = new Skill(0, skillName);
            skillDao.insertSkill(skill);
            
        } else {
            skill = (Skill) cbSkill.getSelectedItem();
        }

        int power = sliderPower.getValue();
        UserSkill userSkill = new UserSkill(null, Config.loggedInUser, skill, power);
        userSkillDao.insertUserSkill(userSkill);
        fillTable();
        fillWindow();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int index = tblSkills.getSelectedRow();
        UserSkill userSkill = list.get(index);
        userSkillDao.removeUser(userSkill.getId());//removeUserSkill
        fillWindow();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cbSkillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSkillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSkillActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
  UserSkill selectedUserSkill = list.get(tblSkills.getSelectedRow());
      

  String skillName = txtSkillName.getText();
        Skill skill = null;
        if (skillName != null && !skillName.trim().isEmpty()) {
            skill = new Skill(0, skillName);
            skillDao.insertSkill(skill);
        } else {
            skill = (Skill) cbSkill.getSelectedItem();
        }

        int power = sliderPower.getValue();
       
        selectedUserSkill.setPower(power);
        selectedUserSkill.setSkill(skill);
        
        userSkillDao.updateUserSkill(selectedUserSkill);
        fillWindow();    }//GEN-LAST:event_btnSaveActionPerformed

  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<Skill> cbSkill;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPower;
    private javax.swing.JLabel lblSkill;
    private javax.swing.JSlider sliderPower;
    private javax.swing.JTable tblSkills;
    private javax.swing.JTextField txtSkillName;
    // End of variables declaration//GEN-END:variables
}
