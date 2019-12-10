/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners.fmain;

import Service.Service;
import controller.formController.FormController;
import domain.DomainObject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import storage.database.DBBroker;
import ui.forms.FMain;

/**
 *
 * @author Aleksa
 */
public class FindActionListener implements ActionListener {
    
    private FMain frame;
    private FormController formController;

    public FindActionListener(FMain frame, FormController formController) {
        this.frame = frame;
        this.formController = formController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DomainObject domainObject = formController.getService().findDomainObject(formController.getDomainObject());
        formController.setDomainObject(domainObject);
    }
    
}
