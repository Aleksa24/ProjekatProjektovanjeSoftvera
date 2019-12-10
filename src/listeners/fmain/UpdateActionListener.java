/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners.fmain;

import controller.formController.FormController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ui.forms.FMain;

/**
 *
 * @author Aleksa
 */
public class UpdateActionListener implements ActionListener {

    private FMain frame;
    private FormController formController;

    public UpdateActionListener(FMain frame, FormController formController) {
        this.frame = frame;
        this.formController = formController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
