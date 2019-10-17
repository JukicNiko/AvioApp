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
public class Putnik extends Osoba implements Serializable {

    private String brojDokumenta;

    public Putnik() {
        super();
    }

    public Putnik(Integer sifra, String ime, String prezime, String brojDokumenta, String email, String telefon) {
        super(ime, prezime, email, sifra, telefon);
        this.brojDokumenta = brojDokumenta;
    }

    public String getBrojDokumenta() {
        return brojDokumenta;
    }

    public void setBrojDokumenta(String brojDokumenta) {
        this.brojDokumenta = brojDokumenta;
    }

}
