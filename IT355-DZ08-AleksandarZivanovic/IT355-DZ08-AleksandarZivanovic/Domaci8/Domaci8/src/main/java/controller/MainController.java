package controller;

import entity.Address;
import entity.Country;
import entity.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import repository.AddressRepository;
import repository.CountryRepository;
import repository.CustomerRepository;

import java.util.List;

@Controller
public class MainController  {
    private final AddressRepository addressRepository;
    private final CountryRepository countryRepository;
    private final CustomerRepository customerRepository;

    public MainController(AddressRepository addressRepository, CountryRepository countryRepository, CustomerRepository customerRepository) {
        this.addressRepository = addressRepository;
        this.countryRepository = countryRepository;
        this.customerRepository = customerRepository;
    }

    @GetMapping("/addresses")
    public String getAllAddresses() {
        List<Address> addresses = addressRepository.findAll();
        for (Address address : addresses) {
            System.out.println(address);
        }
        return null;
    }

    @GetMapping("/countries")
    public String getAllCountries() {
        List<Country> countries = countryRepository.findAll();
        for (Country country : countries) {
            System.out.println(country);
        }
        return null;
    }

    @GetMapping("/customers")
    public String getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        return null;
    }
}
