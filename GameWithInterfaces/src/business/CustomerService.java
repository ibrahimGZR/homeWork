package business;

import entities.Customer;

public interface CustomerService {
	void add(Customer customer);
	void list();
	void update(Customer customer);
	void delete(Customer customer);
}
