/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avioapp.test;

import avioapp.controller.ObradaPutnik;
import avioapp.model.Putnik;
import avioapp.utility.AvioappException;

/**
 *
 * @author PC
 */
public class TestPutnik {

    public static void test() {
        Putnik s = new Putnik();
        s.setIme("Petar");
        s.setPrezime("Perić");
        s.setBrojDokumenta("125123");
    


ObradaPutnik obrada = new ObradaPutnik();
         try {
             s =obrada.spremi(s);
             
         } catch (AvioappException e) {
             System.out.println(e.getPoruka());
         }
         System.out.println(s.getSifra());
    }
}
