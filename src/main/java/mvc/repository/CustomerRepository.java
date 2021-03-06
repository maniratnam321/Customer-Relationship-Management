package mvc.repository;

import mvc.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
