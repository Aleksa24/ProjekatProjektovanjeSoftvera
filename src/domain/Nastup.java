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
public class Nastup {
    
    private Long idNastup;
    private String nazivNastupa;
    private String opis;
    private Menadzer menadzer;
    private Lokacija lokacija;

    public Nastup() {
    }

    public Nastup(Long idNastup, String nazivNastupa, String opis, Menadzer menadzer, Lokacija lokacija) {
        this.idNastup = idNastup;
        this.nazivNastupa = nazivNastupa;
        this.opis = opis;
        this.menadzer = menadzer;
        this.lokacija = lokacija;
    }

    public Long getIdNastup() {
        return idNastup;
    }

    public String getNazivNastupa() {
        return nazivNastupa;
    }

    public String getOpis() {
        return opis;
    }

    public Menadzer getMenadzer() {
        return menadzer;
    }

    public Lokacija getLokacija() {
        return lokacija;
    }

    public void setIdNastup(Long idNastup) {
        this.idNastup = idNastup;
    }

    public void setNazivNastupa(String nazivNastupa) {
        this.nazivNastupa = nazivNastupa;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setMenadzer(Menadzer menadzer) {
        this.menadzer = menadzer;
    }

    public void setLokacija(Lokacija lokacija) {
        this.lokacija = lokacija;
    }
    
    
    
}
