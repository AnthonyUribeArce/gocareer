package pe.edu.upc.gocareer.serviceInterface;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.gocareer.entity.Customer;



public interface ICustomerService {

	Optional<Customer> fetchByCustomerWithOrders(Long id);

	public Integer insert(Customer customer);

	public void delete(long idCustomer);

	List<Customer> list();

	Optional<Customer> findById(Long idCustomer);

}
