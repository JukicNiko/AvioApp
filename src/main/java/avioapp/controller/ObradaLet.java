/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avioapp.controller;

import avioapp.model.Let;
import avioapp.utility.AvioappException;
import java.util.List;

/**
 *
 * @author PC
 */
public class ObradaLet extends Obrada<Let> {

    @Override
    protected void kontrolaSpremi(Let entiet) throws AvioappException {

    }

    @Override
    protected void kontrolaBrisi(Let entitet) throws AvioappException {

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
