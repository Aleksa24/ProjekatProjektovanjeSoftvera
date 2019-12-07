/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Aleksa
 */
public class VrstaIzvodjaca {
    private Long vrstaID;
    private String nazivVrste;
    private List<OsobaIzvodjac> izvodjaci;

    public VrstaIzvodjaca() {
    }

    public VrstaIzvodjaca(Long vrstaID, String nazivVrste, List<OsobaIzvodjac> izvodjaci) {
        this.vrstaID = vrstaID;
        this.nazivVrste = nazivVrste;
        this.izvodjaci = izvodjaci;
    }

    public Long getVrstaID() {
        return vrstaID;
    }

    public String getNazivVrste() {
        return nazivVrste;
    }

    public void setVrstaID(Long vrstaID) {
        this.vrstaID = vrstaID;
    }

    public void setNazivVrste(String nazivVrste) {
        this.nazivVrste = nazivVrste;
    }
    
    

    @Override
    public String toString() {
        return nazivVrste;
    }

    public List<OsobaIzvodjac> getIzvodjaci() {
        return izvodjaci;
    }

    public void setIzvodjaci(List<OsobaIzvodjac> izvodjaci) {
        this.izvodjaci = izvodjaci;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.vrstaID);
        hash = 31 * hash + Objects.hashCode(this.nazivVrste);
        hash = 31 * hash + Objects.hashCode(this.izvodjaci);
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
        final VrstaIzvodjaca other = (VrstaIzvodjaca) obj;
        if (!Objects.equals(this.vrstaID, other.vrstaID)) {
            return false;
        }
        return true;
    }
    
    
}
