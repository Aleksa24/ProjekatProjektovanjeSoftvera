/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.impl;

import domain.Menadzer;
import java.util.List;
import storage.StorageMenadzer;
import storage.database.impl.StorageDatabaseMenadzer;

/**
 *
 * @author Aleksa
 */
public class ServiceMenadzerImpl implements Service.ServiceMenadzer{
    
    private final storage.StorageMenadzer storageMenadzer;

    public ServiceMenadzerImpl() {
        this.storageMenadzer = new StorageDatabaseMenadzer();
    }

    @Override
    public List<Menadzer> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Menadzer save(Menadzer menadzer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
