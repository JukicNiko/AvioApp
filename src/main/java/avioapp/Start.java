package avioapp;

import avioapp.test.TestOperater;
import avioapp.utility.HibernateUtil;
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
        HibernateUtil.getSession();
        //new SplashScreen().setVisible(true);
        //TestOperater.test();
    }
}
