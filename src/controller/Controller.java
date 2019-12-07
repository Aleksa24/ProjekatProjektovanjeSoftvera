/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Service.ServiceBend;
import Service.ServiceMenadzer;
import Service.ServiceOsobaIzvodjac;
import Service.SeviceNastup;
import Service.impl.ServiceBendImpl;
import Service.impl.ServiceMenadzerImpl;
import Service.impl.ServiceNastupImpl;
import Service.impl.ServiceOsobaIzvodjacImpl;
import Service.impl.ServiceVrstaIzvodjacaImpl;
import domain.VrstaIzvodjaca;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Aleksa
 */
public class Controller {

    //dodati
    private static Controller instance;

    public static void setInstance(Controller aInstance) {
        instance = aInstance;
    }
    private final Map<String, Object> map;
    private Service.ServiceMenadzer serviceMenadzer;
    private Service.ServiceBend serviceBend;
    private Service.ServiceOsobaIzvodjac serviceOsobaIzvodjac;
    private Service.SeviceNastup seviceNastup;
    private Service.ServiceVrstaIzvodjaca serviceVrstaIzvodjaca;

    public Controller() {
        this.serviceMenadzer = new ServiceMenadzerImpl();
        this.serviceBend = new ServiceBendImpl();
        this.serviceOsobaIzvodjac = new ServiceOsobaIzvodjacImpl();
        this.seviceNastup = new ServiceNastupImpl();
        this.serviceVrstaIzvodjaca = new ServiceVrstaIzvodjacaImpl();
        map = new HashMap<>();
    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public Service.ServiceMenadzer getServiceMenadzer() {
        return serviceMenadzer;
    }

    public Service.ServiceBend getServiceBend() {
        return serviceBend;
    }

    public Service.ServiceOsobaIzvodjac getServiceOsobaIzvodjac() {
        return serviceOsobaIzvodjac;
    }

    public Service.SeviceNastup getSeviceNastup() {
        return seviceNastup;
    }

    public void setServiceMenadzer(Service.ServiceMenadzer serviceMenadzer) {
        this.serviceMenadzer = serviceMenadzer;
    }

    public void setServiceBend(Service.ServiceBend serviceBend) {
        this.serviceBend = serviceBend;
    }

    public void setServiceOsobaIzvodjac(Service.ServiceOsobaIzvodjac serviceOsobaIzvodjac) {
        this.serviceOsobaIzvodjac = serviceOsobaIzvodjac;
    }

    public void setSeviceNastup(Service.SeviceNastup seviceNastup) {
        this.seviceNastup = seviceNastup;
    }

    public Service.ServiceVrstaIzvodjaca getServiceVrstaIzvodjaca() {
        return serviceVrstaIzvodjaca;
    }

    public void setServiceVrstaIzvodjaca(Service.ServiceVrstaIzvodjaca serviceVrstaIzvodjaca) {
        this.serviceVrstaIzvodjaca = serviceVrstaIzvodjaca;
    }

}
