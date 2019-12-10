/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.formController.impl;

import listeners.flogin.CancelActionListener;
import listeners.flogin.LoginActionListener;
import controller.formController.FormController;
import controllerMenager.ControllerMenager;
import javax.swing.JButton;
import javax.swing.JFrame;
import storage.database.DBBroker;
import ui.forms.FLogin;

/**
 *
 * @author Aleksa
 */
public class FormControllerFlogin extends FormController{

    public FormControllerFlogin(ControllerMenager controllerMenager, JFrame frame) {
        super(controllerMenager, frame);
        setListeners();
    }

    @Override
    protected void setListeners() {
        FLogin frame = (FLogin) this.getFrame();
        JButton btnLogin = frame.getJbtnLogin();
        JButton btnCancel = frame.getJbtnCancel();
        
        btnLogin.addActionListener(new LoginActionListener(frame));
        btnCancel.addActionListener(new CancelActionListener(frame));
    }
    
}
