/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avioapp.model;

import javax.persistence.MappedSuperclass;

/**
 *
 * @author pc
 */
@MappedSuperclass
public class Osoba extends Entitet{
    private String ime;
    private String prezime;
    private String email;
    public Osoba() {
        super();
    }

    public Osoba(String ime, String prezime, String email, Integer sifra) {
        super(sifra);
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

        
     @Override
    public String toString() {
        return ime + " " + prezime;
    }
}
