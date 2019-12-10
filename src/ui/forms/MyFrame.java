/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.forms;

import domain.DomainObject;
import javax.swing.JFrame;
import ui.components.iValue.product.Product;

/**
 *
 * @author Aleksa
 */
public abstract class MyFrame extends JFrame{
    public abstract Product getPanel();
    public abstract void fillForm(DomainObject domainObject);
}
