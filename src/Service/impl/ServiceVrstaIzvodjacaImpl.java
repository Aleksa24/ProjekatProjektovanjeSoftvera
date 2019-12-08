/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.impl;

import domain.VrstaIzvodjaca;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import storage.StorageVrstaIzvodjaca;
import storage.database.impl.StorageDatabaseVrstaIzvodjaca;


/**
 *
 * @author Aleksa
 */
public class ServiceVrstaIzvodjacaImpl implements Service.ServiceVrstaIzvodjaca{

    private StorageVrstaIzvodjaca storageVrstaIzvodjaca;

    public ServiceVrstaIzvodjacaImpl() {
        storageVrstaIzvodjaca = new StorageDatabaseVrstaIzvodjaca();
    }
    
    @Override
    public List<VrstaIzvodjaca> getAll() {
        try {
            return storageVrstaIzvodjaca.getAll();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceVrstaIzvodjacaImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("ovde ima neka greska");
        return new ArrayList<VrstaIzvodjaca>();
    }

    @Override
    public List<VrstaIzvodjaca> getVrstaIzvodjacaById(long id) {
        try {
            return storageVrstaIzvodjaca.getVrstaIzvodjacaById(id);
        } catch (SQLException ex) {
            Logger.getLogger(ServiceVrstaIzvodjacaImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<VrstaIzvodjaca>();
    }
    
}
