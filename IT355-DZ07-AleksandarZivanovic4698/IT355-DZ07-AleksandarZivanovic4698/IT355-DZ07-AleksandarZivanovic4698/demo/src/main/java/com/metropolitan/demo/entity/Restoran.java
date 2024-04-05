package com.metropolitan.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "restoran")
public class Restoran {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String naziv;
    private String adresa;
    private String telefon;
    private String ocena;


    public Restoran() {
    }

    public Restoran(String naziv, String adresa, String telefon, String ocena) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.telefon = telefon;
        this.ocena = ocena;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getOcena() {
        return ocena;
    }

    public void setOcena(String ocena) {
        this.ocena = ocena;
    }

    @Override
    public String toString() {
        return "Restoran{" +
                "id=" + id +
                ", naziv='" + naziv + '\'' +
                ", adresa='" + adresa + '\'' +
                ", telefon='" + telefon + '\'' +
                ", ocena='" + ocena + '\'' +
                '}';
    }
}

