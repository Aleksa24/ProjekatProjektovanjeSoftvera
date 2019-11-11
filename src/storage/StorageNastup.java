/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import domain.Nastup;
import java.util.List;

/**
 *
 * @author Aleksa
 */
public interface StorageNastup {
    
    Nastup zapamtiNastup(Nastup nastup);
    List<Nastup> getAll();
    
}
