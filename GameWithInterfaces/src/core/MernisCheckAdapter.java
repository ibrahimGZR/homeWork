package core;

import entities.Customer;
import mernis.MernisCheckManager;

public class MernisCheckAdapter implements MernisCheckService{
	
	public void check(Customer customer) {
	
		MernisCheckManager mernisCheckManager = new MernisCheckManager();
		mernisCheckManager.Checked(customer);
	}
}
