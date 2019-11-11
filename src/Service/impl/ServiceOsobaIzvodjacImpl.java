/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.impl;

import domain.OsobaIzvodjac;
import java.util.List;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OsobaIzvodjac save(OsobaIzvodjac osobaIzvodjac) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
