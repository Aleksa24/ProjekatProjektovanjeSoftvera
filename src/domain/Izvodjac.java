/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Aleksa
 */
public class Izvodjac {
    
    private Long idIzvodjac;
    private String email;
    private String telefon;

    public Izvodjac() {
    }

    public Izvodjac(Long idIzvodjac, String email, String telefon) {
        this.idIzvodjac = idIzvodjac;
        this.email = email;
        this.telefon = telefon;
    }

    public Long getIdIzvodjac() {
        return idIzvodjac;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setIdIzvodjac(Long idIzvodjac) {
        this.idIzvodjac = idIzvodjac;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    
    
    
}
