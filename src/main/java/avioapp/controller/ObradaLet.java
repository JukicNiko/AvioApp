/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avioapp.controller;

import avioapp.model.Let;
import avioapp.utility.AvioappException;
import avioapp.utility.Utility;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class ObradaLet extends Obrada<Let> {

    @Override
    protected void kontrolaSpremi(Let entiet) throws AvioappException {
        kontrolaImeLeta(entiet);
        kontrolaOdlazista(entiet);
        kontrolaPolazista(entiet);
    }

    @Override
    protected void kontrolaBrisi(Let entitet) throws AvioappException {

    }

    private void kontrolaImeLeta(Let entitet) throws AvioappException {
        if (entitet.getImeLeta() == null || entitet.getImeLeta().trim().length() == 0) {
            throw new AvioappException("Šifra leta mora biti unesena");
        }
    }
        private void kontrolaOdlazista(Let entitet) throws AvioappException {
        if (entitet.getOdrediste()== null || entitet.getOdrediste().trim().length() == 0) {
            throw new AvioappException("Odredište mora biti uneseno");
        }
    }
            private void kontrolaPolazista(Let entitet) throws AvioappException {
        if (entitet.getPolaziste()== null || entitet.getPolaziste().trim().length() == 0) {
            throw new AvioappException("Polazište leta mora biti uneseno");
        }
    }

    @Override
    public List<Let> getEntiteti() {
        return session.createQuery("from Let").list();
    }

    public List<Let> getImeLeta(String uvjet) {
        return session.createQuery("from Let a" + "where a.imeLeta like :uvjet ")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20)
                .list();
    }

}
