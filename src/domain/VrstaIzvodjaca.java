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
public class VrstaIzvodjaca {
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
    
    
}
