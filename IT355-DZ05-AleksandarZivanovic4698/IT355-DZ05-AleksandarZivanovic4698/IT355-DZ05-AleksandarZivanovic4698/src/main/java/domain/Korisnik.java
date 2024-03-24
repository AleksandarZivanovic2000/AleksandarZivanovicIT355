package domain;

public class Korisnik {

    private String ime;
    private String prezime;
    private String brTelefona;

    public Korisnik() {
    }

    public Korisnik(String ime, String prezime, String brTelefona) {
        this.ime = ime;
        this.prezime = prezime;
        this.brTelefona = brTelefona;
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

    public String getBrTelefona() {
        return brTelefona;
    }

    public void setBrTelefona(String brTelefona) {
        this.brTelefona = brTelefona;
    }
}
