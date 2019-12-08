/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.components.panel.impl;

import domain.OsobaIzvodjac;
import java.util.List;
import ui.components.IValue;
import ui.components.table.model.OsobaIzvodjacTableModel;

/**
 *
 * @author Aleksa
 */
public class PanelBend extends javax.swing.JPanel implements IValue{

    /**
     * Creates new form PanelBend
     */
    public PanelBend() {
        initComponents();
        preparePanel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputPanelIdBend = new ui.components.panel.impl.InputPanelTextField();
        inputPanelNaziv = new ui.components.panel.impl.InputPanelTextField();
        inputPanelEmail = new ui.components.panel.impl.InputPanelTextField();
        inputPanelTelefon = new ui.components.panel.impl.InputPanelTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOsobaIzvodjac = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Bend"));

        jTableOsobaIzvodjac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableOsobaIzvodjac);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(inputPanelIdBend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(inputPanelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputPanelTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPanelNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputPanelIdBend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputPanelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputPanelNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputPanelTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ui.components.panel.impl.InputPanelTextField inputPanelEmail;
    private ui.components.panel.impl.InputPanelTextField inputPanelIdBend;
    private ui.components.panel.impl.InputPanelTextField inputPanelNaziv;
    private ui.components.panel.impl.InputPanelTextField inputPanelTelefon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOsobaIzvodjac;
    // End of variables declaration//GEN-END:variables

    @Override
    public Object getValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setValue(Object value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inicialize(Object initValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void preparePanel() {
        inputPanelIdBend.getJlabText().setText("ID Benda:");
        inputPanelIdBend.getJlabError().setText("");
        inputPanelIdBend.inicialize("");
        inputPanelNaziv.getJlabText().setText("Naziv Benda:");
        inputPanelNaziv.getJlabError().setText("");
        inputPanelNaziv.inicialize("");
        inputPanelTelefon.getJlabText().setText("Telefon:");
        inputPanelTelefon.getJlabError().setText("");
        inputPanelTelefon.inicialize("");
        inputPanelEmail.getJlabText().setText("Email:");
        inputPanelEmail.getJlabError().setText("");
        inputPanelEmail.inicialize("");
        
        List<OsobaIzvodjac> izvodjaci = controller.Controller.getInstance().getServiceOsobaIzvodjac().getAll();//getAll za sada ne radi
        OsobaIzvodjacTableModel model = new OsobaIzvodjacTableModel(izvodjaci);
        jTableOsobaIzvodjac.setModel(model);
        
    }

    public ui.components.panel.impl.InputPanelTextField getInputPanelEmail() {
        return inputPanelEmail;
    }

    public ui.components.panel.impl.InputPanelTextField getInputPanelIdBend() {
        return inputPanelIdBend;
    }

    public ui.components.panel.impl.InputPanelTextField getInputPanelNaziv() {
        return inputPanelNaziv;
    }

    public ui.components.panel.impl.InputPanelTextField getInputPanelTelefon() {
        return inputPanelTelefon;
    }

    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public javax.swing.JTable getjTableOsobaIzvodjac() {
        return jTableOsobaIzvodjac;
    }
    
}
