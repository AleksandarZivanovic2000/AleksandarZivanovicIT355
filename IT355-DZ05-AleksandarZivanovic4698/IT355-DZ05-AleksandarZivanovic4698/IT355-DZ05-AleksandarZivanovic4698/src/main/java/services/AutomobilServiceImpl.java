package services;

import domain.Automobil;
import domain.Korisnik;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AutomobilServiceImpl implements AutomobilServices{

    private List<Automobil> listaAutomobila = new ArrayList<>();



    @Override
    public List<Automobil> getAll() {
        return listaAutomobila;
    }



    @Override
    public List<Automobil> filter(String ime) {
        if(ime.equals("")){
            return listaAutomobila;
        }
        return listaAutomobila.stream().filter(automobil -> automobil.getKorisnik().getIme().equals(ime)).collect(Collectors.toList());
    }

    public AutomobilServiceImpl(){
        listaAutomobila.add(new Automobil("Audi", "Q5", 15000, new Korisnik("Sasa", "Stanojevic", "0659163517")));
        listaAutomobila.add(new Automobil("BMW", "X6", 40000, new Korisnik("Ksenija", "Zirovic", "0643308334")));
        listaAutomobila.add(new Automobil("Citroen", "C5", 6000, new Korisnik("Ivan", "Stanojevic", "0659163518")));
        listaAutomobila.add(new Automobil("Audi", "Q7", 55000, new Korisnik("Vukica", "Stanojevic", "0659163516")));
        listaAutomobila.add(new Automobil("Audi", "A8L", 100000, new Korisnik("Kristina", "Stanojevic", "0659163519")));
    }


}
