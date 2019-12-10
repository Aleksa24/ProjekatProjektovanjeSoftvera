/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Aleksa
 */
public class Lokacija implements DomainObject,Serializable{
    
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
    
    @Override
    public String getNameByColumn(int column)
        { String names[] = {"idLokacija","imeLokacije","adresa","vlasnik","telefon","email"}; 
          return names[column];
        }		
 
    @Override
    public Lokacija getNewRecord(ResultSet rs)  throws SQLException
    {return new Lokacija(rs.getLong("idLokacija"),
            rs.getString("imeLokacije"),
            rs.getString("adresa"),
            rs.getString("vlasnik"),
            rs.getString("telefon"),
            rs.getString("email"));} 
    @Override
    public String getAtrValue() {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return this.idLokacija +
                ", " + (this.imeLokacije == null ? null : "'" + this.imeLokacije + "'") +
                ", " + (this.adresa == null ? null : "'" + this.adresa + "'") +
                ", " + (this.vlasnik == null ? null : "'" + this.vlasnik + "'") + 
                ", " +(this.telefon == null ? null : "'" + this.telefon + "'") +
                ", " + (this.email == null ? null : "'" + this.email + "'");}
    @Override
    public String setAtrValue(){
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "idLokacija=" + idLokacija +
                ", " + "imeLokacije=" + (this.imeLokacije == null ? null : "'" + this.imeLokacije + "'") +
                ", " + "adresa=" + (this.adresa == null ? null : "'" + this.adresa + "'") +
                ", " + "vlasnik=" + (this.vlasnik == null ? null : "'" + this.vlasnik + "'") + 
                ", " + "telefon=" + (this.telefon == null ? null : "'" + this.telefon + "'") + 
                ", " + "email=" + (this.email == null ? null : "'" + this.email + "'");}
    @Override
    public String getClassName(){return "lokacija";}
    @Override
    public String getWhereCondition(){return "idLokacija = " + this.idLokacija;}
    
}
