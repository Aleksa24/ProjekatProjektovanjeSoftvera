/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.impl;

import domain.Bend;
import domain.DomainObject;
import java.util.List;
import storage.database.DBBroker;
import storage.database.impl.DBBrokerSQL;
import storage.database.impl.StorageDatabaseBend;

/**
 *
 * @author Aleksa
 */
public class ServiceBendImpl implements Service.ServiceBend{
    
    private final storage.StorageBend storageBend;
    private DBBroker broker;
    
    public ServiceBendImpl() {
        storageBend = new StorageDatabaseBend();
        broker = new DBBrokerSQL();
    }

    @Override
    public List<Bend> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Bend save(Bend bend) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DomainObject findDomainObject(DomainObject domainObject) {
        return (Bend)broker.findRecord(domainObject);
    }
    
    
    
}
