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
public class Menadzer implements DomainObject,Serializable{
    
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
    
    @Override
    public String getNameByColumn(int column)
        { String names[] = {"idMenadzer","username","password","imeMenadzera","prezimeMenadzera","telefon","email","pol"}; 
          return names[column];
        }		
 
    @Override
    public Menadzer getNewRecord(ResultSet rs)  throws SQLException
    {return new Menadzer(rs.getLong("idMenadzer"),
            rs.getString("username"),
            rs.getString("password"),
            rs.getString("imeMenadzera"),
            rs.getString("prezimeMenadzera"),
            rs.getString("telefon"),
            rs.getString("email"),
            Pol.valueOf(rs.getString("pol")));} 
    @Override
    public String getAtrValue() {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return this.idMenadzer +
                ", " + (this.username == null ? null : "'" + this.username + "'") +
                ", " + (this.password == null ? null : "'" + this.password + "'") +
                ", " + (this.imeMenadzera == null ? null : "'" + this.imeMenadzera + "'") + 
                ", " +(this.prezimeMenadzera == null ? null : "'" + this.prezimeMenadzera + "'") +
                ", " + (this.telefon == null ? null : "'" + this.telefon + "'") + 
                ", " + (this.email == null ? null : "'" + this.email + "'") + 
                ", " + (this.pol == null ? null : "'" + this.pol + "'");}
    @Override
    public String setAtrValue(){
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "idMenadzer=" + idMenadzer +
                ", " + "imeLokacije=" + (this.username == null ? null : "'" + this.username + "'") +
                ", " + "adresa=" + (this.password == null ? null : "'" + this.password + "'") +
                ", " + "vlasnik=" + (this.imeMenadzera == null ? null : "'" + this.imeMenadzera + "'") + 
                ", " + "telefon=" + (this.prezimeMenadzera == null ? null : "'" + this.prezimeMenadzera + "'") + 
                ", " + "email=" + (this.telefon == null ? null : "'" + this.telefon + "'") + 
                ", " + "email=" + (this.email == null ? null : "'" + this.email + "'") + 
                ", " + "email=" + (this.pol == null ? null : "'" + this.pol + "'");}
    @Override
    public String getClassName(){return "menadzer";}
    @Override
    public String getWhereCondition(){return "idMenadzer = " + this.idMenadzer;}
    
    
}
