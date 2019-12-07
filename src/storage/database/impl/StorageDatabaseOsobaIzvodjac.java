/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage.database.impl;

import domain.OsobaIzvodjac;
import domain.Pol;
import domain.VrstaIzvodjaca;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aleksa
 */
public class StorageDatabaseOsobaIzvodjac implements storage.StorageOsobaIzvodjac {

    @Override
    public OsobaIzvodjac zapamtiIzbodjaca(OsobaIzvodjac osobaIzvodjac) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<OsobaIzvodjac> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OsobaIzvodjac getOsobaById(Long ID) {
        try {
            Connection connection = connectionFactory.ConnectionFactory.getInstance().getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM osobaizvodjac oi join izvodjac iz on(oi.idIzvodjac = iz.idIzvodjac) where oi.idIzvodjac = " + ID;
            ResultSet rs = statement.executeQuery(query);
            OsobaIzvodjac osobaIzvodjac = null;
            while (rs.next()) {
                List<VrstaIzvodjaca> vrste = 
                controller.Controller.getInstance().getServiceVrstaIzvodjaca().getVrstaIzvodjacaById(rs.getLong("idIzvodjac"));
                
                osobaIzvodjac = new OsobaIzvodjac(rs.getLong("idIzvodjac"),
                        rs.getString("email"),
                        rs.getString("telefon"),
                        rs.getString("ime"),
                        rs.getString("prezime"),
                        Pol.valueOf(rs.getString("pol")),
                        vrste);
            }
            return osobaIzvodjac;
        } catch (SQLException ex) {
            Logger.getLogger(StorageDatabaseOsobaIzvodjac.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
