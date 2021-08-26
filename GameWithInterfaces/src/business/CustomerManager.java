package business;

import core.MernisCheckService;
import dataAccess.CustomerDaoRepository;
import entities.Customer;

public class CustomerManager implements CustomerService {

	CustomerDaoRepository customerDaoRepository;
	MernisCheckService mernisCheckService;

	public CustomerManager(CustomerDaoRepository customerDaoRepository, MernisCheckService mernisCheckService) {
		super();
		this.customerDaoRepository = customerDaoRepository;
		this.mernisCheckService = mernisCheckService;
	}

	@Override
	public void add(Customer customer) {
		mernisCheckService.check(customer);
		customerDaoRepository.add(customer);
	}

	@Override
	public void list() {
		customerDaoRepository.list();

	}

	@Override
	public void update(Customer customer) {
		customerDaoRepository.update(customer);

	}

	@Override
	public void delete(Customer customer) {
		customerDaoRepository.delete(customer);

	}

}
