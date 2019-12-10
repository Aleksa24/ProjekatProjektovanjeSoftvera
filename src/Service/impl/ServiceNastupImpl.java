/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.impl;

import domain.DomainObject;
import domain.Nastup;
import java.util.List;
import storage.database.impl.StorageDatabaseNastup;

/**
 *
 * @author Aleksa
 */
public class ServiceNastupImpl implements Service.SeviceNastup{
    
    private final storage.StorageNastup storageNastup;

    public ServiceNastupImpl() {
        storageNastup = new StorageDatabaseNastup();
    }

    @Override
    public List<Nastup> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Nastup save(Nastup nastup) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DomainObject findDomainObject(DomainObject domainObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
