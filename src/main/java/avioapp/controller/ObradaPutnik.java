/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avioapp.controller;

import avioapp.model.Entitet;
import avioapp.model.Putnik;
import avioapp.utility.AvioappException;
import java.util.List;

/**
 *
 * @author PC
 */
public class ObradaPutnik extends ObradaOsoba<Putnik> {

    @Override
    public List<Putnik> getEntiteti() {
        return session.createQuery("from Putnik").list();
    }

    public List<Putnik> getPutnik(String uvjet) {
        return session.createQuery("from Putnik a "
                + " where a.ime like :uvjet or "
                + " a.prezime like :uvjet")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20)
                .list();
    }

    @Override
    protected void kontrolaSpremi(Putnik entitet) throws AvioappException {
        super.kontrolaSpremi(entitet);
        kontrolaBrojDokumenta(entitet);
    }

    @Override
    protected void kontrolaBrisi(Putnik entitet) throws AvioappException {
        super.kontrolaBrisi(entitet);
    }

      private void kontrolaBrojDokumenta(Putnik entitet) throws AvioappException {
        if (entitet.getBrojDokumenta()== null){
            throw new AvioappException("Broj dokumenta mora biti unesen");
                
                 
        }else if(entitet.getBrojDokumenta().trim().length()<9 ) {
            throw new AvioappException("Broj dokumenta mora biti 9 znakova");
            
        }
      }
}
