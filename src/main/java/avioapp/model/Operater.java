/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avioapp.model;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Marta
 */
@Entity
public class Operater extends Osoba implements Serializable {

    private String lozinka;

    public Operater() {
        super();
    }

    public Operater(String lozinka, String ime, String prezime, Integer sifra, String email) {
        super(ime, email, prezime, sifra);
        this.lozinka = lozinka;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

}
