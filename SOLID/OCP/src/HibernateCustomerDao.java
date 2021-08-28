
public class HibernateCustomerDao implements CustomerDaoRepository {
	@Override
	public void add() {
		System.out.println("Added by Hibernate");
	}
}
