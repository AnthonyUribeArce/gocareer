package pe.edu.upc.gocareer.serviceInterface;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.gocareer.entity.Order;


public interface IOrderService {
	public Order insert(Order order);

	public void delete(long idOrder);

	List<Order> list();

	public Optional<Order> findById(long id);

	Optional<Order> fetchByOrderIdWithCustomerWhithOrderDetailWithProduct(Long id) throws Exception;

}
