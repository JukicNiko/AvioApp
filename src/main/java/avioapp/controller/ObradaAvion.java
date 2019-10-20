/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avioapp.controller;

import avioapp.model.Avion;
import avioapp.utility.AvioappException;
import java.util.List;

/**
 *
 * @author PC
 */
public class ObradaAvion extends Obrada<Avion> {

    @Override
    protected void kontrolaSpremi(Avion entiet) throws AvioappException {
        kontrolaProizvođač(entiet);
        kontrolaKolicinaSjedala(entiet);
    }

    @Override
    protected void kontrolaBrisi(Avion entitet) throws AvioappException {

    }

    @Override
    public List<Avion> getEntiteti() {
        return session.createQuery("from Avion").list();
    }

    public List<Avion> getAvion(String uvjet) {
        return session.createQuery("from Avion a where a.proizvođač like :uvjet or a.količinaSjedala like :uvjet")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20)
                .list();
    }
    

    private void kontrolaProizvođač(Avion entitet) throws AvioappException {
        if (entitet.getProizvođač() == null || entitet.getProizvođač().trim().length() == 0) {
            throw new AvioappException("Naziv proizvođača je obavezan");
        }
    }

    private void kontrolaKolicinaSjedala(Avion entitet) throws AvioappException {
        if (entitet.getKoličinaSjedala() <= 0 || entitet.getKoličinaSjedala() > 80) {
            throw new AvioappException("Broj sjedala mora biti između 1 i 80");
        }
    }
}
