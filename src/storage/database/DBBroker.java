/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage.database;

import domain.DomainObject;
import java.sql.Connection;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Aleksa
 */
public abstract class DBBroker {
    
    private Connection connection;

    public DBBroker() {
    }

    public abstract boolean makeConnection();
    public abstract boolean insertRecord(DomainObject odo);
    public abstract boolean updateRecord(DomainObject odo,DomainObject odoold);
    public abstract boolean updateRecord(DomainObject odo); 
    public abstract boolean deleteRecord(DomainObject odo);
    public abstract DomainObject findRecord(DomainObject odo);
    public abstract boolean commitTransation();
    public abstract boolean rollbackTransation();
    public abstract boolean getCounter(DomainObject odo,AtomicInteger counter); 
    public abstract boolean increaseCounter(DomainObject odo,AtomicInteger counter); 
    public abstract void closeConnection();
    
    

    

}
