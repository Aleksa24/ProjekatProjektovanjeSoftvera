/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import domain.OsobaIzvodjac;
import java.util.List;

/**
 *
 * @author Aleksa
 */
public interface ServiceOsobaIzvodjac {
    
    List<OsobaIzvodjac> getAll();
    OsobaIzvodjac save(OsobaIzvodjac osobaIzvodjac);
    
}
