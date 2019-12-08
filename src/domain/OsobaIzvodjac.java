/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public OsobaIzvodjac(Long idIzvodjac, String email, String telefon, String ime, String prezime, Pol pol, List<VrstaIzvodjaca> vrstaIzvodjaca) {
        super(idIzvodjac, email, telefon);
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.vrstaIzvodjaca = vrstaIzvodjaca;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.ime);
        hash = 37 * hash + Objects.hashCode(this.prezime);
        hash = 37 * hash + Objects.hashCode(this.pol);
        hash = 37 * hash + Objects.hashCode(this.vrstaIzvodjaca);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OsobaIzvodjac other = (OsobaIzvodjac) obj;
        if (!Objects.equals(this.idIzvodjac, other.idIzvodjac)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OsobaIzvodjac{" + "ime=" + ime + ", prezime=" + prezime + ", pol=" + pol + '}';
    }
    
}
