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
public class ClanBend implements DomainObject,Serializable{
    private Long idOsobaIzvodjac;
    private Long idBend;

    public Long getIdOsobaIzvodjac() {
        return idOsobaIzvodjac;
    }

    public ClanBend(Long idOsobaIzvodjac, Long idBend) {
        this.idOsobaIzvodjac = idOsobaIzvodjac;
        this.idBend = idBend;
    }

    public void setIdOsobaIzvodjac(Long idOsobaIzvodjac) {
        this.idOsobaIzvodjac = idOsobaIzvodjac;
    }

    public Long getIdBend() {
        return idBend;
    }

    public void setIdBend(Long idBend) {
        this.idBend = idBend;
    }

    public ClanBend() {
    }
    
    @Override
    public String getNameByColumn(int column)
        { String names[] = {"idOsobaIzvodjac","idBend"}; 
          return names[column];
        }		
 
    @Override
    public ClanBend getNewRecord(ResultSet rs)  throws SQLException
    {return new ClanBend(rs.getLong("idOsobaIzvodjac"),
            rs.getLong("idBend"));} 
    @Override
    public String getAtrValue() {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return this.idOsobaIzvodjac +
                ", " + idBend ;}
    @Override
    public String setAtrValue(){
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "idOsobaIzvodjac=" + idOsobaIzvodjac +
                ", " + "idBend=" + idBend;}
    @Override
    public String getClassName(){return "clanbend";}
    @Override
    public String getWhereCondition(){return "idOsobaIzvodjac = " + this.idOsobaIzvodjac;}
    
}
