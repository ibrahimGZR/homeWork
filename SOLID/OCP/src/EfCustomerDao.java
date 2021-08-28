
public class EfCustomerDao implements CustomerDaoRepository {
	@Override
	public void add() {
		System.out.println("Added by Ef");
	}
}
