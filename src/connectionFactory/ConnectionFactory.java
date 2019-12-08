/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aleksa
 */
public class ConnectionFactory {

    private static ConnectionFactory instance;
    private Connection connection;

    public ConnectionFactory() throws FileNotFoundException,IOException,SQLException{
        Properties propertiesDatabase = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src\\properties\\database.properties");
            propertiesDatabase.load(fis);
            String url = propertiesDatabase.getProperty("url");
            String username = propertiesDatabase.getProperty("username");
            String password = propertiesDatabase.getProperty("password");

            connection = DriverManager.getConnection(url, username, password);
            connection.setAutoCommit(false);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Los prop fajl za db!");
        } catch (IOException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("io exception!");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("nije se konektovao!");
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("greska pri zatvaranju input streama!");
            }
        }
    }

    public static ConnectionFactory getInstance()  {
        if (instance == null) {
            try {
                instance = new connectionFactory.ConnectionFactory();
            } catch (Exception ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

}
