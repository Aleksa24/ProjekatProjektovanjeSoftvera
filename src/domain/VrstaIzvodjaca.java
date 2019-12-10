/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Aleksa
 */
public class VrstaIzvodjaca implements DomainObject,Serializable{
    private Long vrstaID;
    private String nazivVrste;

    public VrstaIzvodjaca() {
    }

    public VrstaIzvodjaca(Long vrstaID, String nazivVrste) {
        this.vrstaID = vrstaID;
        this.nazivVrste = nazivVrste;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.vrstaID);
        hash = 31 * hash + Objects.hashCode(this.nazivVrste);
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
    
    @Override
    public String getNameByColumn(int column)
        { String names[] = {"vrstaID","nazivVrste"}; 
          return names[column];
        }		
 
    @Override
    public VrstaIzvodjaca getNewRecord(ResultSet rs)  throws SQLException
    {return new VrstaIzvodjaca(rs.getLong("vrstaID"),
            rs.getString("nazivVrste"));} 
    @Override
    public String getAtrValue() {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return this.vrstaID +
                ", " + (this.nazivVrste == null ? null : "'" + this.nazivVrste + "'") ;}
    @Override
    public String setAtrValue(){
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "vrstaID=" + vrstaID +
                ", " + "nazivVrste=" + (this.nazivVrste == null ? null : "'" + this.nazivVrste + "'") ;}
    @Override
    public String getClassName(){return "vrstaizvodjaca";}
    @Override
    public String getWhereCondition(){return "vrstaID = " + this.vrstaID;}
     
    
}
