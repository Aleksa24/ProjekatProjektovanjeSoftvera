/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.formController.impl;

import listeners.fmain.DeleteActionListener;
import listeners.fmain.UpdateActionListener;
import listeners.fmain.FindActionListener;
import listeners.fmain.SaveActionListener;
import controller.formController.FormController;
import controllerMenager.ControllerMenager;
import javax.swing.JButton;
import javax.swing.JFrame;
import storage.database.DBBroker;
import ui.forms.FMain;

/**
 *
 * @author Aleksa
 */
public class FormControllerFmain1 extends FormController{

    public FormControllerFmain1(ControllerMenager controllerMenager, JFrame frame) {
        super(controllerMenager, frame);
    }

    @Override
    protected void setListeners() {
        FMain frame = (FMain) this.getFrame();
        JButton btnSave = frame.getBtnSave();
        JButton btnUpdate = frame.getJbtnUpdate();
        JButton btnDelete = frame.getJbtnDelete();
        JButton btnFind = frame.getJbtnFind();
        //dodati actionlistenere na menije: u menijima ce da se namesti PanelFactory i Service za formu a kasnije se sve radi generalizovano
        
        btnSave.addActionListener(new SaveActionListener(frame,controllerMenager.getCurentController()));
        btnUpdate.addActionListener(new UpdateActionListener(frame,controllerMenager.getCurentController()));
        btnDelete.addActionListener(new DeleteActionListener(frame,controllerMenager.getCurentController()));
        btnFind.addActionListener(new FindActionListener(frame,controllerMenager.getCurentController()));
    }
    
    
    
}
