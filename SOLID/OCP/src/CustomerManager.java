
public class CustomerManager implements CustomerService {
	private CustomerDaoRepository customerDaoRepository;

	public CustomerManager(CustomerDaoRepository customerDaoRepository) {
		super();
		this.customerDaoRepository = customerDaoRepository;
	}

	public void add() {

		this.customerDaoRepository.add();
	}
}
