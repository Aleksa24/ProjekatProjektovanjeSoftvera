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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aleksa
 */
public class Bend extends Izvodjac implements DomainObject,Serializable{
    
    private String nazivBenda;
    private List<ClanBend> clanoviBenda;

    public Bend() {
         this.clanoviBenda = new ArrayList<ClanBend>();
    }

    public Bend(Long idIzvodjac, String email, String telefon, String nazivBenda) {
        super(idIzvodjac, email, telefon);
        this.nazivBenda = nazivBenda;
        this.clanoviBenda = new ArrayList<ClanBend>();
    }

    public String getNazivBenda() {
        return nazivBenda;
    }

    public List<ClanBend> getClanoviBenda() {
        return clanoviBenda;
    }

    public void setNazivBenda(String nazivBenda) {
        this.nazivBenda = nazivBenda;
    }

    public void setClanoviBenda(List<ClanBend> clanoviBenda) {
        this.clanoviBenda = clanoviBenda;
    }
    
    @Override
    public String getNameByColumn(int column)
        { String names[] = {"idIzvodjac","email","telefon","nazivBenda"}; 
          return names[column];
        }		
 
    @Override
    public Bend getNewRecord(ResultSet rs)  throws SQLException
    {return new Bend(rs.getLong("idIzvodjac"),rs.getString("email"),rs.getString("telefon"),rs.getString("nazivBenda"));} 
    @Override
    public String getAtrValue() {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return this.idIzvodjac + ", " + (this.email == null ? null : "'" + this.email + "'") + ", " + (this.telefon == null ? null : "'" + this.telefon + "'") + ", " + (this.nazivBenda == null ? null : "'" + this.nazivBenda + "'");}
    @Override
    public String setAtrValue(){
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "idIzvodjac=" + idIzvodjac + ", " + "email=" + (this.email == null ? null : "'" + this.email + "'") + ", " + "telefon=" + (this.telefon == null ? null : "'" + this.telefon + "'") + ", " + "nazivBenda=" + (this.nazivBenda == null ? null : "'" + this.nazivBenda + "'");}
    @Override
    public String getClassName(){return "bend";}
    @Override
    public String getWhereCondition(){return "idIzvodjac = " + this.idIzvodjac;}
    
}
