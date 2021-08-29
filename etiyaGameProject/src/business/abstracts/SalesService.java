package business.abstracts;

import entities.Sales;

public interface SalesService {
	void add(Sales sales);
	void getAll();
	void update(Sales sales);
	void delete(Sales sales);
}
