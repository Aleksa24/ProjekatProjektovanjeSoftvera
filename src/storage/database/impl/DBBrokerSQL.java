/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage.database.impl;

import com.sun.corba.se.pept.broker.Broker;
import domain.DomainObject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import storage.database.DBBroker;

/**
 *
 * @author Aleksa
 */
public class DBBrokerSQL extends DBBroker {

    Connection conn = null;
    
    @Override
    public boolean makeConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insertRecord(DomainObject odo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateRecord(DomainObject odo, DomainObject odoold) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateRecord(DomainObject odo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteRecord(DomainObject odo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DomainObject findRecord(DomainObject odo) {
        ResultSet rs = null;
        Statement st = null;
        String  upit = "SELECT * FROM " + odo.getClassName() +  " WHERE " + odo.getWhereCondition();
        boolean signal; 
  	try {   st  = conn.prepareStatement(upit);
                rs = st.executeQuery(upit);
                signal = rs.next(); // rs.next() vraca true ako ima postoji rezultat upita.
                if (signal == true)
                    odo = odo.getNewRecord(rs);
                else
                    odo = null;
	    } catch (SQLException  ex)  
               {   Logger.getLogger(DBBrokerSQL.class.getName()).log(Level.SEVERE, null, ex);
               } finally {close(null,st,rs);}
	return odo;
    }

    @Override
    public boolean commitTransation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean rollbackTransation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getCounter(DomainObject odo, AtomicInteger counter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean increaseCounter(DomainObject odo, AtomicInteger counter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void closeConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void close(Connection conn, Statement st, ResultSet rs) 
    { if (rs != null) 
        {  try { rs.close(); 
               } catch (SQLException ex) 
                   { Logger.getLogger(DBBrokerSQL.class.getName()).log(Level.SEVERE, null, ex);}
        }
        
      if (st != null) 
        { try { st.close();
              } catch (SQLException ex) 
                  { Logger.getLogger(DBBrokerSQL.class.getName()).log(Level.SEVERE, null, ex);}
        }
      if (conn != null) 
        { try { conn.close();
              } catch (SQLException ex) 
                  { Logger.getLogger(DBBrokerSQL.class.getName()).log(Level.SEVERE, null, ex);}
        }
    }
    
}
