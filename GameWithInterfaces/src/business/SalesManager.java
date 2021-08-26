package business;

import dataAccess.SalesDaoRepository;
import entities.Sales;

public class SalesManager implements SalesService{

	SalesDaoRepository salesDaoRepository;
	
	
	public SalesManager(SalesDaoRepository salesDaoRepository) {
		super();
		this.salesDaoRepository = salesDaoRepository;
	}

	@Override
	public void add(Sales sales) {
		salesDaoRepository.add(sales);
		
	}

	@Override
	public void list() {
		salesDaoRepository.list();
		
	}

	@Override
	public void update(Sales sales) {
		salesDaoRepository.update(sales);
		
	}

	@Override
	public void delete(Sales sales) {
	salesDaoRepository.delete(sales);
		
	}

}
