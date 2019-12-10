/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerMenager;

import controller.formController.FormController;
import controller.formController.impl.FormControllerFlogin;
import controller.formController.impl.FormControllerFmain1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import storage.database.impl.DBBrokerSQL;
import ui.forms.FLogin;
import ui.forms.FMain;

/**
 *
 * @author Aleksa
 */
public class ControllerMenager {

    private static ControllerMenager instance;
    private FormController curentController;
    private Map<FormController,List<FormController>> model;//kontroler i njegove tranzicije

    public ControllerMenager() {
        model = new HashMap<FormController,List<FormController>>();
        FormController formcolntrolerLogin = new FormControllerFlogin(instance, new FLogin());
        FormController formcolntrolerMain = new FormControllerFmain1(instance, new FMain());
        
        List<FormController> list =new ArrayList<FormController>(){{
            add(formcolntrolerMain);
        }};
        model.put(formcolntrolerLogin, list);
        
        list =new ArrayList<FormController>(){{//gleda samog sebe
            add(formcolntrolerMain);
        }};
        model.put(formcolntrolerMain, list);
        
        curentController = formcolntrolerLogin;
    }

    public static ControllerMenager getInstance() {
        if (instance == null) {
            instance = new ControllerMenager();
        }
        return instance;
    }

    public FormController getCurentController() {
        return curentController;
    }

    public void setCurentController(FormController curentController) {
        this.curentController = curentController;
    }

    public void start() {
        curentController.seeFrame();
    }

    /**
     * parametar je forma koju zelim da otvorim
     * @param valueClass
     * @throws RuntimeException 
     */
    public void activate(Class<FMain> valueClass) throws RuntimeException{
        List<FormController> lista = model.get(curentController);
        //prolazak kroz sve moguce transakcije
        for (FormController formController : lista) {
            if (formController.getFrame().getClass().equals(valueClass)) {//ako ima taj tip klase u transakcijama onda se namesti taj za curent controlera
                curentController = formController;
                curentController.seeFrame();
//                curentController.setListeners();//ovdde ih dodajem zato sto mi baca gresku ako ih pri inicijalizaciji ubacujem
                return;
            }
        }
        System.out.println("greska ovde!");//greska ako sam lose ukucao koja klasa
        throw new RuntimeException();
    }

}
