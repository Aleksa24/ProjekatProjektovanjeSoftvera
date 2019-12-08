/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.OsobaIzvodjac;
import domain.VrstaIzvodjaca;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeEvent;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import static javax.swing.text.StyleConstants.setIcon;
import ui.components.panel.impl.PanelBend;
import ui.components.panel.impl.PanelOsobaIzvodjac;
import ui.components.panel.impl.inputPanelVrstaIzvodjaca;
import ui.components.table.model.OsobaIzvodjacTableModel;
import ui.forms.FBend;
import ui.forms.FLogin;
import ui.forms.FMain;

/**
 *
 * @author Aleksa
 */
public class Main {

    public static void main(String[] args) {
//        new FLogin().setVisible(true);
//        new FMain().setVisible(true);
//        new FBend(null, true).setVisible(true);

        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 400, 400);
//        JComboBox<VrstaIzvodjaca> jComboBox = new JComboBox<>();
//        List<VrstaIzvodjaca> lista = controller.Controller.getInstance().getServiceVrstaIzvodjaca().getAll();
//        for (VrstaIzvodjaca vrstaIzvodjaca : lista) {
//            jComboBox.addItem(vrstaIzvodjaca);
//        }

//        List<VrstaIzvodjaca> lista = controller.Controller.getInstance().getServiceVrstaIzvodjaca().getAll();
//        DefaultListModel<VrstaIzvodjaca> model = new DefaultListModel<>();
//        for (VrstaIzvodjaca vrstaIzvodjaca : lista) {
//            model.addElement(vrstaIzvodjaca);
//        }
//        JList jlista = new JList(model);
//        jlista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
////        jlista.setCellRenderer(new MyCellRenderer());
//        frame.setLayout(new GridLayout(2,2));
//        frame.getContentPane().add(jlista);
//        JButton button = new JButton("ubaci");
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                DefaultListModel dlm = (DefaultListModel) jlista.getModel();
//                dlm.addElement(new VrstaIzvodjaca(100l, "aleksa",null));
//            }
//        });
//        frame.getContentPane().add(button);
//        inputPanelVrstaIzvodjaca panelVrstaIzvodjaca = new inputPanelVrstaIzvodjaca();
//        panelVrstaIzvodjaca.inicialize(controller.Controller.getInstance().getServiceVrstaIzvodjaca().getAll());
//        frame.getContentPane().add(panelVrstaIzvodjaca);

        PanelBend panel = new PanelBend();
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
   }

}
