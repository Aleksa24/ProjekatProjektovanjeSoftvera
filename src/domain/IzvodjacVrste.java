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
public class IzvodjacVrste implements DomainObject,Serializable{
    
    private Long idIzvodjac;
    private Long idVrste;

    public IzvodjacVrste() {
    }

    public IzvodjacVrste(Long idIzvodjac, Long idVrste) {
        this.idIzvodjac = idIzvodjac;
        this.idVrste = idVrste;
    }

    public Long getIdVrste() {
        return idVrste;
    }

    public void setIdVrste(Long idVrste) {
        this.idVrste = idVrste;
    }

    public Long getIdIzvodjac() {
        return idIzvodjac;
    }

    public void setIdIzvodjac(Long idIzvodjac) {
        this.idIzvodjac = idIzvodjac;
    }
    @Override
    public String getNameByColumn(int column)
        { String names[] = {"idIzvodjac","idVrste"}; 
          return names[column];
        }		
 
    @Override
    public IzvodjacVrste getNewRecord(ResultSet rs)  throws SQLException
    {return new IzvodjacVrste(rs.getLong("idIzvodjac"),
            rs.getLong("idVrste"));} 
    @Override
    public String getAtrValue() {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return this.idIzvodjac +
                ", " + idVrste ;}
    @Override
    public String setAtrValue(){
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "idIzvodjac=" + idIzvodjac +
                ", " + "idVrste=" + idVrste;}
    @Override
    public String getClassName(){return "IzvodjacVrste";}
    @Override
    public String getWhereCondition(){return "idIzvodjac = " + this.idIzvodjac;}
    
    
}
