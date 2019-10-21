/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avioapp.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author PC
 */
@Entity
public class Let extends Entitet implements Serializable {

    private String imeLeta;
    private Date datumOdlaska;
    private Date datumDolaska;
    private String polaziste;
    private String odrediste;

    @ManyToOne
    private Avion avion;

    public Let() {
        super();
    }

    public Let(Integer sifra, String imeLeta, Date datumOdlaska, Date datumDolaska, String polaziste, String odrediste, Avion avion) {
        super(sifra);
        this.imeLeta = imeLeta;
        this.datumOdlaska = datumOdlaska;
        this.datumDolaska = datumDolaska;
        this.polaziste = polaziste;
        this.odrediste = odrediste;
        this.avion = avion;
    }

    public String getImeLeta() {
        return imeLeta;
    }

    public void setImeLeta(String imeLeta) {
        this.imeLeta = imeLeta;
    }

    public Date getDatumOdlaska() {
        return datumOdlaska;
    }

    public void setDatumOdlaska(Date datumOdlaska) {
        this.datumOdlaska = datumOdlaska;
    }

    public Date getDatumDolaska() {
        return datumDolaska;
    }

    public void setDatumDolaska(Date datumDolaska) {
        this.datumDolaska = datumDolaska;
    }

    public String getPolaziste() {
        return polaziste;
    }

    public void setPolaziste(String polazni_grad) {
        this.polaziste = polazni_grad;
    }

    public String getOdrediste() {
        return odrediste;
    }

    public void setOdrediste(String odrediste) {
        this.odrediste = odrediste;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    @Override
    public String toString() {
        return imeLeta;
    }
   
}
