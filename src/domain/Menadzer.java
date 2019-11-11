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
public class Menadzer {
    
    private Long idMenadzer;
    private String username;
    private String password;
    private String imeMenadzera;
    private String prezimeMenadzera;
    private String telefon;
    private String email;
    private Pol pol;

    public Menadzer() {
    }

    public Menadzer(Long idMenadzer, String username, String password, String imeMenadzera, String prezimeMenadzera, String telefon, String email,Pol pol) {
        this.idMenadzer = idMenadzer;
        this.username = username;
        this.password = password;
        this.imeMenadzera = imeMenadzera;
        this.prezimeMenadzera = prezimeMenadzera;
        this.telefon = telefon;
        this.email = email;
        this.pol = pol;
    }

    public Long getIdMenadzer() {
        return idMenadzer;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getImeMenadzera() {
        return imeMenadzera;
    }

    public String getPrezimeMenadzera() {
        return prezimeMenadzera;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }

    public Pol getPol() {
        return pol;
    }

    public void setIdMenadzer(Long idMenadzer) {
        this.idMenadzer = idMenadzer;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setImeMenadzera(String imeMenadzera) {
        this.imeMenadzera = imeMenadzera;
    }

    public void setPrezimeMenadzera(String prezimeMenadzera) {
        this.prezimeMenadzera = prezimeMenadzera;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPol(Pol pol) {
        this.pol = pol;
    }
    
    
    
    
}
