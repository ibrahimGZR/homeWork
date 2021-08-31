package dataAccess.concretes.jpa;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.SalesDao;
import entities.concretes.Sales;

public class JpaSalesDao implements SalesDao {
	List<Sales> sales;

	public JpaSalesDao() {
		super();
		this.sales = new ArrayList<Sales>();
	}

	@Override
	public void add(Sales entity) {
		this.sales.add(entity);

	}

	@Override
	public List<Sales> getAll() {

		return this.sales;
	}

	@Override
	public void update(Sales entity) {
		int index = this.sales.indexOf(entity);

		Sales sale = this.sales.get(index);

		sale.setId(entity.getId());
		sale.setGame(entity.getGame());
		sale.setGamer(entity.getGamer());
		sale.setCampaign(entity.getCampaign());
	}

	@Override
	public void delete(Sales entity) {
		this.sales.remove(entity);

	}
}
