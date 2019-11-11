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
public class Lokacija {
    
    private Long idLokacija;
    private String imeLokacije;
    private String adresa;
    private String vlasnik;
    private String telefon;
    private String email;

    public Lokacija() {
    }

    public Lokacija(Long idLokacija, String imeLokacije, String adresa, String vlasnik, String telefon, String email) {
        this.idLokacija = idLokacija;
        this.imeLokacije = imeLokacije;
        this.adresa = adresa;
        this.vlasnik = vlasnik;
        this.telefon = telefon;
        this.email = email;
    }

    public Long getIdLokacija() {
        return idLokacija;
    }

    public String getImeLokacije() {
        return imeLokacije;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setIdLokacija(Long idLokacija) {
        this.idLokacija = idLokacija;
    }

    public void setImeLokacije(String imeLokacije) {
        this.imeLokacije = imeLokacije;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
