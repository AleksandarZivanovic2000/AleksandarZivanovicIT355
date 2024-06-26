package repository;

import entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Customer findByEmail(String email);

    List<Customer> findAllByLastName(String lastName);

    List<Customer> findAllByFirstNameAndLastName(String firstName, String lastName);

    List<Customer> findByLastNameOrderByCustomerIdDesc(String lastName);
}
