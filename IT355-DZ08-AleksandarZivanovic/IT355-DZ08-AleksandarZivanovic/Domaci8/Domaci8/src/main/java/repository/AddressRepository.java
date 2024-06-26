package repository;

import entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {
    List<Address> findByCity(String city);

    List<Address> findByCountryId(Integer countryId);

    List<Address> findAllByStreetNameContaining(String streetName);
}
