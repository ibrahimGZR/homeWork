
public class Main {

	public static void main(String[] args) {
		// Open Closed Prenciple, Dependency Inversion Prenciple
		
		
		//IoC
		CustomerManager customerManager = new CustomerManager(new EfCustomerDao());
		customerManager.add();
	}

}
