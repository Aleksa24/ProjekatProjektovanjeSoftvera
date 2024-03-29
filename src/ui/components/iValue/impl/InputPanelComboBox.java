/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.components.iValue.impl;

import java.util.List;
import javax.swing.JComboBox;
import ui.components.iValue.IValue;

/**
 *
 * @author Aleksa
 */
public class InputPanelComboBox extends javax.swing.JPanel implements IValue {

    /**
     * Creates new form InputPanelGender
     */
    public InputPanelComboBox() {
        initComponents();
        prepareView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlabText = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        jlabError = new javax.swing.JLabel();

        jlabText.setText("jLabel1");

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlabError.setForeground(new java.awt.Color(255, 0, 0));
        jlabError.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jlabError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlabText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabText)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlabError))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> jComboBox;
    private javax.swing.JLabel jlabError;
    private javax.swing.JLabel jlabText;
    // End of variables declaration//GEN-END:variables

    @Override
    public Object getValue() {
        return jComboBox.getSelectedItem();
    }

    @Override
    public void setValue(Object value) {
        List<Object> list = (List<Object>) value;
        for (Object object : list) {
            jComboBox.addItem(object);
        }
    }

    @Override
    public void inicialize(Object initValue) {
        List<Object> list = (List<Object>) initValue;
        for (Object object : list) {
            jComboBox.addItem(object);
        }
    }

    public javax.swing.JLabel getJlabError() {
        return jlabError;
    }

    public javax.swing.JLabel getJlabText() {
        return jlabText;
    }

    public JComboBox<Object> getjComboBox() {
        return jComboBox;
    }
    
    private void prepareView() {
        jComboBox.removeAllItems();
    }

}
