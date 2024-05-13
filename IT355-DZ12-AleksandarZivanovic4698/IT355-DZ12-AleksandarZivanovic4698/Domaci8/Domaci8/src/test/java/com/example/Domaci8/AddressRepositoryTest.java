package com.example.Domaci8;

import entity.Address;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import repository.AddressRepository;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class AddressRepositoryTest {

    @Autowired
    private AddressRepository addressRepository;

    @Test
    public void testCrudOperations() {
        // Testiranje kreiranja adrese
        Address address = new Address();
        // Postavite polja adrese
        Address savedAddress = addressRepository.save(address);
        assertThat(savedAddress.getId()).isNotNull();

        // Testiranje čitanja adrese
        Optional<Address> retrievedAddress = addressRepository.findById(savedAddress.getId());
        assertThat(retrievedAddress).isPresent();

        // Testiranje ažuriranja adrese
        Address updatedAddress = retrievedAddress.get();
        // Ažurirajte polja adrese
        Address savedUpdatedAddress = addressRepository.save(updatedAddress);
        assertThat(savedUpdatedAddress.getSomeField()).isEqualTo(updatedAddress.getSomeField());

        // Testiranje brisanja adrese
        addressRepository.delete(savedUpdatedAddress);
        Optional<Address> deletedAddress = addressRepository.findById(savedUpdatedAddress.getId());
        assertThat(deletedAddress).isEmpty();
    }
}
