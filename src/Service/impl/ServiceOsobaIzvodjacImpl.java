/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.impl;

import domain.OsobaIzvodjac;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import storage.database.impl.StorageDatabaseOsobaIzvodjac;

/**
 *
 * @author Aleksa
 */
public class ServiceOsobaIzvodjacImpl implements Service.ServiceOsobaIzvodjac{
    
    private final storage.StorageOsobaIzvodjac storageOsobaIzvodjac;
    
    public ServiceOsobaIzvodjacImpl(){
        storageOsobaIzvodjac = new StorageDatabaseOsobaIzvodjac();
    }

    @Override
    public List<OsobaIzvodjac> getAll() {
        try {
            return storageOsobaIzvodjac.getAll();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceOsobaIzvodjacImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<OsobaIzvodjac>();
    }

    @Override
    public OsobaIzvodjac save(OsobaIzvodjac osobaIzvodjac) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OsobaIzvodjac getOsobaById(Long ID) {
        return storageOsobaIzvodjac.getOsobaById(ID);
    }
    
}
