/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avioapp.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author PC
 */
@Entity
public class Avion extends Entitet implements Serializable {

    private String proizvodac;
    private Integer kolicinaSjedala;

    public Avion() {
        super();
    }

    public Avion(String proizvodac, Integer kolicinaSjedala, Integer sifra) {
        super(sifra);
        this.proizvodac = proizvodac;
        this.kolicinaSjedala = kolicinaSjedala;
    }

    public String getProizvodac() {
        return proizvodac;
    }

    public void setProizvodac(String proizvodac) {
        this.proizvodac = proizvodac;
    }

    public Integer getKolicinaSjedala() {
        return kolicinaSjedala;
    }

    public void setKolicinaSjedala(Integer kolicinaSjedala) {
        this.kolicinaSjedala = kolicinaSjedala;
    }

    @Override
    public String toString() {
        return proizvodac;
    }   
}
