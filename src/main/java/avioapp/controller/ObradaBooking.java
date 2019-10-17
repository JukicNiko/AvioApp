/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avioapp.controller;

import avioapp.model.Booking;
import avioapp.utility.AvioappException;
import java.util.List;

/**
 *
 * @author PC
 */
public class ObradaBooking extends Obrada<Booking> {

    @Override
    protected void kontrolaSpremi(Booking entiet) throws AvioappException {
        
    }

    @Override
    protected void kontrolaBrisi(Booking entitet) throws AvioappException {

    }

        @Override
    public List<Booking> getEntiteti() {
        return session.createQuery("from Booking").list();
    }
    public List<Booking> getNazivBookinga(String uvjet) {
        return session.createQuery("from Booking a "
                + " where a.naziv like :uvjet ")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20)
                .list();
    }
}
