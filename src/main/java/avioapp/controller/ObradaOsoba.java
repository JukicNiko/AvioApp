/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avioapp.controller;

import avioapp.model.Osoba;
import avioapp.utility.AvioappException;

/**
 *
 * @author pc
 * @param <T> extends Osoba
 */
public abstract class ObradaOsoba<T extends Osoba> extends Obrada<T> {

    @Override
    protected void kontrolaSpremi(T entitet) throws AvioappException {
        //kontrola imena, prezimena, email, oib
        kontrolaIme(entitet);
        kontrolaPrezime(entitet);
        kontrolaOIB(entitet.getOib());
    }

    @Override
    protected void kontrolaBrisi(T entitet) throws AvioappException {

    }

    protected void kontrolaOIB(String oib) throws AvioappException {
        if (oib.length() != 11) {
            throw new AvioappException("OIB mora imati 11 znamenaka");
        }

        try {
            Long.parseLong(oib);
        } catch (NumberFormatException e) {
            throw new AvioappException("OIB ima znak koji nije brojčani");
        }

        int a = 10;
        for (int i = 0; i < 10; i++) {
            a = a + Integer.parseInt(oib.substring(i, i + 1));
            a = a % 10;
            if (a == 0) {
                a = 10;
            }
            a *= 2;
            a = a % 11;
        }
        int kontrolni = 11 - a;
        if (kontrolni == 10) {
            kontrolni = 0;
        }

        if (kontrolni != Integer.parseInt(oib.substring(10))) {
            throw new AvioappException("OIB je neispravan");
        }
    }

    private void kontrolaIme(Osoba entitet) throws AvioappException {
        if (entitet.getIme() == null || entitet.getIme().trim().length() == 0) {
            throw new AvioappException("Obavezno unijeti ime");
        }
    }

    private void kontrolaPrezime(Osoba entitet) throws AvioappException {
        if (entitet.getPrezime() == null || entitet.getPrezime().trim().length() == 0) {
            throw new AvioappException("Obavezno unijeti prezime");
        }
    }

}
