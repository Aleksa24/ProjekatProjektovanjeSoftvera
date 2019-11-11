/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import domain.Bend;
import java.util.List;

/**
 *
 * @author Aleksa
 */
public interface StorageBend {
    
    Bend zapamtiBend(Bend bend);
    List<Bend> getAll();
    
}
