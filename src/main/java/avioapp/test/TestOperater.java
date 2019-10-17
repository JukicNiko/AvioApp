/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avioapp.test;

import avioapp.controller.ObradaOperater;
import avioapp.model.Operater;
import avioapp.utility.AvioappException;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Marta
 */
public class TestOperater {
    
    public static void izvedi (){
    Operater o = new Operater();
    o.setIme("Niko");
    o.setPrezime("Jukić");
    o.setEmail("niko.jukic@gmail.com");
    o.setLozinka(BCrypt.hashpw("123", BCrypt.gensalt()));
    
        ObradaOperater obrada = new ObradaOperater();
        try {
            o =obrada.spremi(o);
        } catch (AvioappException e) {
            System.out.println(e.getPoruka());
        }
         System.out.println(o.getSifra());
    }
}
