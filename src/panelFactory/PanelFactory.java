/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelFactory;

import ui.components.iValue.product.Product;

/**
 *
 * @author Aleksa
 */
public abstract class PanelFactory {
    
    protected Product product;
    
    public void create(){
        createProduct();
    }

    public Product getProduct() {
        return product;
    }
    
    protected abstract void createProduct();
    
}
