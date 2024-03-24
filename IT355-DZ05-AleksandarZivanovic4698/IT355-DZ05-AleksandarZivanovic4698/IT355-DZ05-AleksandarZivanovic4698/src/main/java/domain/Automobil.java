package domain;

public class Automobil {

    private String model;

    private String marka;

    private double cena;

    private Korisnik korisnik;

    public Automobil() {

    }

    public Automobil(String model, String marka, double cena, Korisnik korisnik) {
        this.model = model;
        this.marka = marka;
        this.cena = cena;
        this.korisnik = korisnik;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }
}
