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
public class Nastup implements DomainObject,Serializable{
    
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
       
    @Override
    public String getNameByColumn(int column)
        { String names[] = {"idNastupa","nazivNastupa","opis","idLokacija","idMenadzer"}; 
          return names[column];
        }		
 
    @Override
    public Nastup getNewRecord(ResultSet rs)  throws SQLException
    {return new Nastup(rs.getLong("idNastupa"),
            rs.getString("nazivNastupa"),
            rs.getString("opis"),null,null);}
//            rs.getString("idLokacija"),
//            rs.getString("idMenadzer"));} 
    @Override
    public String getAtrValue() {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return this.idNastup +
                ", " + (this.nazivNastupa == null ? null : "'" + this.nazivNastupa + "'") +
                ", " + (this.opis == null ? null : "'" + this.opis + "'") +
                ", " + String.valueOf(this.getLokacija().getIdLokacija()) +
                ", " + String.valueOf(this.getMenadzer().getIdMenadzer());}
    @Override
    public String setAtrValue(){
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "idNastupa=" + idNastup +
                ", " + "nazivNastupa=" + (this.nazivNastupa == null ? null : "'" + this.nazivNastupa + "'") +
                ", " + "opis=" + (this.opis == null ? null : "'" + this.opis + "'") +
                ", " + "idLokacija=" + String.valueOf(this.getLokacija().getIdLokacija()) + 
                ", " + "idMenadzer=" + String.valueOf(this.getMenadzer().getIdMenadzer());}
    @Override
    public String getClassName(){return "nastup";}
    @Override
    public String getWhereCondition(){return "idNastupa = " + this.idNastup;}
    
    
}
