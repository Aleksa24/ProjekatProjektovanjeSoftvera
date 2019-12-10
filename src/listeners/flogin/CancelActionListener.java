/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners.flogin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ui.forms.FLogin;

/**
 *
 * @author Aleksa
 */
public class CancelActionListener implements ActionListener {

    FLogin frame;

    public CancelActionListener(FLogin frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jbtnCancelActionPerformed(e);
    }

    private void jbtnCancelActionPerformed(java.awt.event.ActionEvent evt) {
        frame.dispose();
    }
}
