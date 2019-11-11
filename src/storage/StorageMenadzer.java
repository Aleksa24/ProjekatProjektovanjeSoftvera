/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import domain.Menadzer;

/**
 *
 * @author Aleksa
 */
public interface StorageMenadzer {
    
    Menadzer kreirajMenadzera(Menadzer menadzer);
    Menadzer prijaviMenadzera();
    
}
