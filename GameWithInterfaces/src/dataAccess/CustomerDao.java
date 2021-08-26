package dataAccess;

import entities.Customer;

public class CustomerDao implements CustomerDaoRepository {

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getFirstName() + " Eklendi");

	}

	@Override
	public void list() {
		System.out.println("Listelendi");

	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " Güncellendi");

	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " Silindi");

	}

}
