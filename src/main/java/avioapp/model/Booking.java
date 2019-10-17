/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avioapp.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author PC
 */
@Entity
public class Booking extends Entitet implements Serializable {

    private String naziv;
    private Integer sjedalo;
    private String prtljaga;
    private BigDecimal cijena;

    @ManyToOne
    private Putnik putnik;

    @ManyToOne
    private Let let;

    public Booking() {
        super();
    }

    public Booking(Integer sifra, String naziv, Integer sjedalo, String prtljaga, BigDecimal cijena, Putnik putnik, Let let) {
        super(sifra);
        this.sjedalo = sjedalo;
        this.prtljaga = prtljaga;
        this.cijena = cijena;
        this.putnik = putnik;
        this.let = let;
        this.naziv = naziv;
    }

    public Integer getSjedalo() {
        return sjedalo;
    }

    public void setSjedalo(Integer sjedalo) {
        this.sjedalo = sjedalo;
    }

    public String getPrtljaga() {
        return prtljaga;
    }

    public void setPrtljaga(String prtljaga) {
        this.prtljaga = prtljaga;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public Putnik getPutnik() {
        return putnik;
    }

    public void setPutnik(Putnik putnik) {
        this.putnik = putnik;
    }

    public Let getLet() {
        return let;
    }

    public void setLet(Let let) {
        this.let = let;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

}
