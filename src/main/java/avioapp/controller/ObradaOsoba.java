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
    }

    @Override
    protected void kontrolaBrisi(T entitet) throws AvioappException {

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

    private void kontrolaTelefon(Osoba entitet) throws AvioappException {
        if (entitet.getTelefon() == null || entitet.getTelefon().trim().length() == 0) {
            throw new AvioappException("Broj telefona mora biti unesen");
        }
    }

}
