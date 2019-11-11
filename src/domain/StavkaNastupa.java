/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author Aleksa
 */
public class StavkaNastupa {
    
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
    
}
