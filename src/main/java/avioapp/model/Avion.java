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

    private String proizvođač;
    private Integer količinaSjedala;

    public Avion() {
        super();
    }

    public Avion(String proizvođač, Integer količinaSjedala, Integer sifra) {
        super(sifra);
        this.proizvođač = proizvođač;
        this.količinaSjedala = količinaSjedala;
    }

    public String getProizvođač() {
        return proizvođač;
    }

    public void setProizvođač(String proizvođač) {
        this.proizvođač = proizvođač;
    }

    public Integer getKoličinaSjedala() {
        return količinaSjedala;
    }

    public void setKoličinaSjedala(Integer količinaSjedala) {
        this.količinaSjedala = količinaSjedala;
    }

}
