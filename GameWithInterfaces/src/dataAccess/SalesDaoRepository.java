package dataAccess;

import entities.Sales;

public interface SalesDaoRepository {
	void add(Sales sales);
	void list();
	void update(Sales sales);
	void delete(Sales sales);
}
