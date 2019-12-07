/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage.database.impl;

import domain.OsobaIzvodjac;
import domain.VrstaIzvodjaca;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aleksa
 */
public class StorageDatabaseVrstaIzvodjaca implements storage.StorageVrstaIzvodjaca {

    @Override
    public List<VrstaIzvodjaca> getAll() throws SQLException {
        Connection connection = connectionFactory.ConnectionFactory.getInstance().getConnection();
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM vrstaizvodjaca ORDER BY nazivVrste";
        ResultSet rs = statement.executeQuery(query);
        List<VrstaIzvodjaca> lista = new ArrayList<VrstaIzvodjaca>();
//        while (rs.next()) {
//            query = "SELECT * FROM vrstaizvodjaca vi join izvodjacvrste iv on(vi.vrstaID = iv.idvrste) join osobaizvodjac oi on (iv.idIzvodjac = oi.idIzvodjac) where vi.vrstaID = " + rs.getLong("vrstaID");
//            ResultSet rs2 = statement.executeQuery(query);
//            List<OsobaIzvodjac> izvodjaci = new ArrayList<>();
//            while (rs2.next()) {
//                OsobaIzvodjac  o = controller.Controller.getInstance().getServiceOsobaIzvodjac().getOsobaById(rs.getLong("vrstaID"));
//                izvodjaci.add(o);
//            }
        while (rs.next()) {
            lista.add(new VrstaIzvodjaca(rs.getLong("vrstaID"), rs.getString("nazivVrste"), null));
        }
//        }

        return lista;
    }

    @Override
    public List<VrstaIzvodjaca> getVrstaIzvodjacaById(long idIzvodjaca) throws SQLException {
        Connection connection = connectionFactory.ConnectionFactory.getInstance().getConnection();
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM vrstaizvodjaca vi join izvodjacvrste iv on(vi.vrstaID = iv.idvrste) join osobaizvodjac oi on (iv.idIzvodjac = oi.idIzvodjac) where oi.idIzvodjac = " + idIzvodjaca;
        ResultSet rs = statement.executeQuery(query);
        List<VrstaIzvodjaca> lista = new ArrayList<>();
        while (rs.next()) {
            lista.add(new VrstaIzvodjaca(rs.getLong("vi.vrstaID"), rs.getString("vi.nazivvrste"), null));
        }
        return lista;
    }

}
