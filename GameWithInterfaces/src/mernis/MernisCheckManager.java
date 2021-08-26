package mernis;
import entities.Customer;

public  class MernisCheckManager {
	public  void Checked(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " - Müşteri doğrulandı");
	}
}
