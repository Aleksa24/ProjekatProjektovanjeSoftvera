/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import domain.VrstaIzvodjaca;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Aleksa
 */
public interface StorageVrstaIzvodjaca {
    List<VrstaIzvodjaca> getAll() throws SQLException;
    List<VrstaIzvodjaca> getVrstaIzvodjacaById(long id)throws SQLException;
}
