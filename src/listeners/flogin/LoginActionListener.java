/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners.flogin;

import controllerMenager.ControllerMenager;
import domain.Menadzer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import ui.forms.FLogin;
import ui.forms.FMain;

/**
 *
 * @author Aleksa
 */
public class LoginActionListener implements ActionListener {

    private FLogin frame;
    private static int brojac = 3;
    
    public LoginActionListener(FLogin frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jbtnLoginActionPerformed(e);
    }
    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {                                          

        if (validateUser(frame.getJtxtUsername(),frame.getJtxtPassword())) {
            frame.dispose();
            ControllerMenager.getInstance().activate(FMain.class);
        } else {
            brojac--;
            if (brojac == 0) frame.dispose();
            JOptionPane.showMessageDialog(null, "imate jos " + brojac + " pokusaja");
        }
    }  
    //refactor:
    private Boolean validateUser(JTextField username, JPasswordField password) {
        JLabel usernameError = frame.getJlabErrorUsername();
        JLabel passwordError = frame.getJlabErrorPassword();
        Boolean signal = true;
        
        usernameError.setText("");
        passwordError.setText("");
        
        if (username.getText().isEmpty()) {
            usernameError.setText("no input");
            signal = false;
        }
        if (password.getPassword() == null) {
            passwordError.setText("no input");
            signal = false;
        }
        if (signal == false) {
            return false;
        }
        
        signal = validateInDatabase();//to do
        
        return signal;

    }

    //to do:
    private Boolean validateInDatabase() {
        return true;
    }
}
