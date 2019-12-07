/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.components.panel.impl;

import domain.OsobaIzvodjac;
import domain.Pol;
import domain.VrstaIzvodjaca;
import java.util.Arrays;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import ui.components.IValue;

/**
 *
 * @author Aleksa
 */
public class PanelOsobaIzvodjac extends javax.swing.JPanel implements IValue {

    /**
     * Creates new form PanelOsobaIzvodjac
     */
    public PanelOsobaIzvodjac() {
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

        inputPanelIdOsobaIzvodjac = new ui.components.panel.impl.InputPanelTextField();
        inputPanelIme = new ui.components.panel.impl.InputPanelTextField();
        inputPanelPrezime = new ui.components.panel.impl.InputPanelTextField();
        inputPanelTelefon = new ui.components.panel.impl.InputPanelTextField();
        inputPanelEmail = new ui.components.panel.impl.InputPanelTextField();
        inputPanelPol = new ui.components.panel.impl.InputPanelComboBox();
        inputPanelVrstaIzvodjaca = new ui.components.panel.impl.inputPanelVrstaIzvodjaca();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Izvodjac"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputPanelIdOsobaIzvodjac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPanelIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPanelPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputPanelTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPanelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPanelPol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputPanelVrstaIzvodjaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputPanelIdOsobaIzvodjac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPanelTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputPanelIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPanelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputPanelPol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPanelPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(inputPanelVrstaIzvodjaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ui.components.panel.impl.InputPanelTextField inputPanelEmail;
    private ui.components.panel.impl.InputPanelTextField inputPanelIdOsobaIzvodjac;
    private ui.components.panel.impl.InputPanelTextField inputPanelIme;
    private ui.components.panel.impl.InputPanelComboBox inputPanelPol;
    private ui.components.panel.impl.InputPanelTextField inputPanelPrezime;
    private ui.components.panel.impl.InputPanelTextField inputPanelTelefon;
    private ui.components.panel.impl.inputPanelVrstaIzvodjaca inputPanelVrstaIzvodjaca;
    // End of variables declaration//GEN-END:variables

    private void preparePanel() {
        inputPanelIdOsobaIzvodjac.getJlabText().setText("ID:");
        inputPanelIdOsobaIzvodjac.getJlabError().setText("");
        inputPanelIdOsobaIzvodjac.getJtxtInput().setText("");
        inputPanelIme.getJlabText().setText("Ime:");
        inputPanelIme.getJlabError().setText("");
        inputPanelIme.getJtxtInput().setText("");
        inputPanelPrezime.getJlabText().setText("Prezime:");
        inputPanelPrezime.getJlabError().setText("");
        inputPanelPrezime.getJtxtInput().setText("");
        inputPanelTelefon.getJlabText().setText("Telefon:");
        inputPanelTelefon.getJlabError().setText("");
        inputPanelTelefon.getJtxtInput().setText("");
        inputPanelEmail.getJlabText().setText("Email:");
        inputPanelEmail.getJlabError().setText("");
        inputPanelEmail.getJtxtInput().setText("");
        inputPanelPol.getJlabText().setText("Pol:");
        inputPanelPol.getJlabError().setText("");
        inputPanelPol.inicialize(Arrays.asList(new String[]{"MALE", "FEMALE", "OTHER"}));
        inputPanelVrstaIzvodjaca.inicialize(controller.Controller.getInstance().getServiceVrstaIzvodjaca().getAll());
        inputPanelVrstaIzvodjaca.setValue(null);
    }

    @Override
    public Object getValue() {
        OsobaIzvodjac osobaIzvodjac;//izlaz
        osobaIzvodjac = new OsobaIzvodjac(Long.valueOf((String) inputPanelIdOsobaIzvodjac.getValue()),
                (String)inputPanelEmail.getValue(),
                (String)inputPanelTelefon.getValue(),
                (String)inputPanelIme.getValue(),
                (String)inputPanelPrezime.getValue(),
                (Pol)inputPanelPol.getValue(), 
                (List<VrstaIzvodjaca>) inputPanelVrstaIzvodjaca.getValue());
        return osobaIzvodjac;
    }

    /**
     * 
     * @param OsobaIzvodjac value
     */
    @Override
    public void setValue(Object value) {
        if (value == null) {
            System.out.println("prazan value za osoba izvodjac");
            return;
        }
        OsobaIzvodjac osobaIzvodjac = null;
        if (value instanceof OsobaIzvodjac) {
            osobaIzvodjac = (OsobaIzvodjac) value;
        }else {
            throw new RuntimeException("nije ubacena osoba izvodjac!");
        }
        inputPanelIdOsobaIzvodjac.setValue(osobaIzvodjac.getIdIzvodjac());
        inputPanelIme.setValue(osobaIzvodjac.getIme());
        inputPanelPrezime.setValue(osobaIzvodjac.getPrezime());
        inputPanelEmail.setValue(osobaIzvodjac.getEmail());
        inputPanelTelefon.setValue(osobaIzvodjac.getTelefon());
        inputPanelVrstaIzvodjaca.setValue(osobaIzvodjac.getVrstaIzvodjaca());
    }

    /**
     * 
     * @param OsobaIzvodjac initValue
     */
    @Override
    public void inicialize(Object initValue) {
        if (initValue == null) {
            System.out.println("prazan initValue za osoba izvodjac");
            return;
        }
        OsobaIzvodjac osobaIzvodjac = null;
        if (initValue instanceof OsobaIzvodjac) {
            osobaIzvodjac = (OsobaIzvodjac) initValue;
        }else {
            throw new RuntimeException("nije ubacena osoba izvodjac!");
        }
        inputPanelIdOsobaIzvodjac.setValue(osobaIzvodjac.getIdIzvodjac());
        inputPanelIme.setValue(osobaIzvodjac.getIme());
        inputPanelPrezime.setValue(osobaIzvodjac.getPrezime());
        inputPanelEmail.setValue(osobaIzvodjac.getEmail());
        inputPanelTelefon.setValue(osobaIzvodjac.getTelefon());
        inputPanelVrstaIzvodjaca.setValue(osobaIzvodjac.getVrstaIzvodjaca());
    }
}
