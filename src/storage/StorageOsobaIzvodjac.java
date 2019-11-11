/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import domain.OsobaIzvodjac;
import java.util.List;

/**
 *
 * @author Aleksa
 */
public interface StorageOsobaIzvodjac {
    
    OsobaIzvodjac zapamtiIzbodjaca(OsobaIzvodjac osobaIzvodjac);
    List<OsobaIzvodjac> getAll();
    
}
