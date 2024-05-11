package controller;

import entity.Address;
import entity.Country;
import entity.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.AddressRepository;
import repository.CountryRepository;
import repository.CustomerRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {
    private final AddressRepository addressRepository;
    private final CountryRepository countryRepository;
    private final CustomerRepository customerRepository;

    public MainController(AddressRepository addressRepository, CountryRepository countryRepository, CustomerRepository customerRepository) {
        this.addressRepository = addressRepository;
        this.countryRepository = countryRepository;
        this.customerRepository = customerRepository;
    }

    @GetMapping("/addresses")
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
