package repository;

import entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
    Country findByCountryName(String countryName);

    List<Country> findAllByCountryNameContaining(String countryName);

    List<Country> findAllByCountryNameIn(List<String> countryNames);

    List<Country> findByCountryNameOrderByCountryIdDesc(String countryName);

}
