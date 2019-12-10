/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controllerMenager.ControllerMenager;

/**
 *
 * @author Aleksa
 */
public class Main {

    public static void main(String[] args) {
//        new FLogin().setVisible(true);
//        new FMain().setVisible(true);
//        new FBend(null, true).setVisible(true);

        ControllerMenager controllerMenager = new ControllerMenager();
        controllerMenager.start();
        
   }

}
