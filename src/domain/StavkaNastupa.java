/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Aleksa
 */
public class StavkaNastupa implements DomainObject,Serializable{
    
    private Long idNastupa;
    private Long idStavkeNastupa;
    private Date vreme;
    private Long trajanje;
    private Izvodjac izvodjac;

    public StavkaNastupa() {
    }

    public StavkaNastupa(Long idNastupa, Long idStavkeNastupa, Date vreme, Long trajanje, Izvodjac izvodjac) {
        this.idNastupa = idNastupa;
        this.idStavkeNastupa = idStavkeNastupa;
        this.vreme = vreme;
        this.trajanje = trajanje;
        this.izvodjac = izvodjac;
    }

    public Long getIdNastupa() {
        return idNastupa;
    }

    public Long getIdStavkeNastupa() {
        return idStavkeNastupa;
    }

    public Date getVreme() {
        return vreme;
    }

    public Long getTrajanje() {
        return trajanje;
    }

    public Izvodjac getIzvodjac() {
        return izvodjac;
    }

    public void setIdNastupa(Long idNastupa) {
        this.idNastupa = idNastupa;
    }

    public void setIdStavkeNastupa(Long idStavkeNastupa) {
        this.idStavkeNastupa = idStavkeNastupa;
    }

    public void setVreme(Date vreme) {
        this.vreme = vreme;
    }

    public void setTrajanje(Long trajanje) {
        this.trajanje = trajanje;
    }

    public void setIzvodjac(Izvodjac izvodjac) {
        this.izvodjac = izvodjac;
    }
    
//     private Long idNastupa;
//    private Long idStavkeNastupa;
//    private Date vreme;
//    private Long trajanje;
//    private Izvodjac izvodjac;
    
         @Override
    public String getNameByColumn(int column){
         String names[] = {"idIzvodjac","email","telefon","ime","prezime","pol"}; 
          return names[column];
        }		
 
    @Override
    public StavkaNastupa getNewRecord(ResultSet rs)  throws SQLException
    {return new StavkaNastupa(rs.getLong("idNastup"),
            rs.getLong("idStavkaNastupa"),
            new Date(rs.getDate("vreme").getTime()),
            rs.getLong("trajanje"),null);}
//            rs.getString("idIzvodjac"));} 
    @Override
    public String getAtrValue() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return String.valueOf(this.idNastupa) +
                ", " + String.valueOf(this.idStavkeNastupa) +
                ", " + "'" + sdf.format(vreme) + "'" +
                ", " + String.valueOf(this.trajanje);}

    @Override
    public String setAtrValue(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "idNastup=" + idNastupa +
                ", " + "idStavkaNastupa=" + this.idStavkeNastupa +
                ", " + "vreme=" + "'" + sdf.format(vreme) + "'"+
                ", " + "trajanje=" + trajanje + 
                ", " + "idIzvodjac=" + this.getIzvodjac().getIdIzvodjac();}
    @Override
    public String getClassName(){return "stavkanastupa";}
    @Override
    public String getWhereCondition(){return "idNastup = " + this.idNastupa;}
    
}
