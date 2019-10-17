package avioapp;

import avioapp.test.TestOperater;
import avioapp.test.TestPutnik;
import avioapp.utility.HibernateUtil;
import avioapp.view.FormaPutnici;
import avioapp.view.Izbornik;
import avioapp.view.SplashScreen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Start {
    public static void main(String[] args) {
        //HibernateUtil.getSession();
        //new SplashScreen().setVisible(true);
        //new FormaPutnici().setVisible(true);
        new Izbornik().setVisible(true);
        //TestOperater.izvedi();
        //new SplashScreen().setVisible(true);
    }
}
