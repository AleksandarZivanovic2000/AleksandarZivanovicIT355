package services;

import domain.Automobil;

import java.util.List;

public interface AutomobilServices {

     List<Automobil> getAll();


    List<Automobil> filter(String ime);


}
