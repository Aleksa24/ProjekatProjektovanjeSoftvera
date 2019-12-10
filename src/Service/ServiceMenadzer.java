/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import domain.Menadzer;
import java.util.List;

/**
 *
 * @author Aleksa
 */
public interface ServiceMenadzer extends Service{
    
    List<Menadzer> getAll();
    Menadzer save(Menadzer menadzer);
    
}
