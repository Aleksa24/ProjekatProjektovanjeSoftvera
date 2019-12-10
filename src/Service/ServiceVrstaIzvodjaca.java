/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import domain.VrstaIzvodjaca;
import java.util.List;

/**
 *
 * @author Aleksa
 */
public interface ServiceVrstaIzvodjaca extends Service{

    List<VrstaIzvodjaca> getAll();
    List<VrstaIzvodjaca> getVrstaIzvodjacaById(long id);
}
