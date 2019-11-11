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
public class OsobaIzvodjac extends Izvodjac{
    
    private String ime;
    private String prezime;
    private Pol pol;
    private List<VrstaIzvodjaca> vrstaIzvodjaca;

    public OsobaIzvodjac() {
        this.vrstaIzvodjaca = new ArrayList<VrstaIzvodjaca>();
    }

    public OsobaIzvodjac(Long idIzvodjac, String email, String telefon, String ime, String prezime, Pol pol) {
        super(idIzvodjac, email, telefon);
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.vrstaIzvodjaca = new ArrayList<VrstaIzvodjaca>();
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public Pol getPol() {
        return pol;
    }

    public List<VrstaIzvodjaca> getVrstaIzvodjaca() {
        return vrstaIzvodjaca;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setVrstaIzvodjaca(List<VrstaIzvodjaca> vrstaIzvodjaca) {
        this.vrstaIzvodjaca = vrstaIzvodjaca;
    }

    public void setPol(Pol pol) {
        this.pol = pol;
    }
    
}
