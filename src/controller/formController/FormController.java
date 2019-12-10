/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.formController;

import Service.Service;
import controllerMenager.ControllerMenager;
import domain.DomainObject;
import javax.swing.JFrame;
import panelFactory.PanelFactory;
import storage.database.DBBroker;
import ui.forms.MyFrame;

/**
 *
 * @author Aleksa
 */
public abstract class FormController {
    protected ControllerMenager controllerMenager;
    protected PanelFactory panelFactory;
    private MyFrame frame;
    private Service service;
    private DomainObject domainObject;

    public FormController(ControllerMenager controllerMenager, JFrame frame) {
        this.controllerMenager = controllerMenager;
        this.frame = (MyFrame) frame;
    }    
    /**
     * sets listeners for form, implement for every form is specific
     */
    protected abstract void setListeners();

    public void seeFrame() {
        frame.setVisible(true);
    }

    public MyFrame getFrame() {
        return frame;
    }

    public Service getService() {
        return service;
    }

    //mozda izmeniti!?!?
    public DomainObject getDomainObject() {
        domainObject = (DomainObject) getFrame().getPanel().getValue();
        return domainObject;
    }

    public void setDomainObject(DomainObject domainObject) {
        
        this.domainObject = domainObject;
    }
    
    
}
