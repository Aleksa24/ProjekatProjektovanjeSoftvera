/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelFactory.impl;

import panelFactory.PanelFactory;
import ui.components.iValue.product.impl.PanelOsobaIzvodjac;

/**
 *
 * @author Aleksa
 */
public class OsobaIzvodjacFactory extends PanelFactory{

    @Override
    protected void createProduct() {
        product = new PanelOsobaIzvodjac();
    }
    
}
