/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import domain.Nastup;
import java.util.List;

/**
 *
 * @author Aleksa
 */
public interface SeviceNastup extends Service{
    
    List<Nastup> getAll();
    Nastup save(Nastup nastup);
    
}
