package dataAccess;

import entities.Customer;

public interface CustomerDaoRepository {
	void add(Customer customer);
	void list();
	void update(Customer customer);
	void delete(Customer customer);
}
