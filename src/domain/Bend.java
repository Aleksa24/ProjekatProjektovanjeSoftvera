/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aleksa
 */
public class Bend extends Izvodjac{
    
    private String nazivBenda;
    private List<OsobaIzvodjac> clanoviBenda;

    public Bend() {
         this.clanoviBenda = new ArrayList<OsobaIzvodjac>();
    }

    public Bend(Long idIzvodjac, String email, String telefon, String nazivBenda) {
        super(idIzvodjac, email, telefon);
        this.nazivBenda = nazivBenda;
        this.clanoviBenda = new ArrayList<OsobaIzvodjac>();
    }

    public String getNazivBenda() {
        return nazivBenda;
    }

    public List<OsobaIzvodjac> getClanoviBenda() {
        return clanoviBenda;
    }

    public void setNazivBenda(String nazivBenda) {
        this.nazivBenda = nazivBenda;
    }

    public void setClanoviBenda(List<OsobaIzvodjac> clanoviBenda) {
        this.clanoviBenda = clanoviBenda;
    }
    
    
    
}
