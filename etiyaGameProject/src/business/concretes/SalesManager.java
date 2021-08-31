package business.concretes;

import java.util.List;

import business.abstracts.SalesService;
import dataAccess.abstracts.SalesDao;
import entities.concretes.Sales;

public class SalesManager implements SalesService {

	SalesDao salesDao;
	public SalesManager(SalesDao salesDao) {
		super();
		this.salesDao = salesDao;
	}

	@Override
	public void add(Sales sales) {
		this.printCampaign(sales);
		this.salesDao.add(sales);
	}

	@Override
	public List<Sales> getAll() {
		System.out.println("Satışlar listelendi : ");
		return this.salesDao.getAll();
	}

	@Override
	public void update(Sales sales) {
		System.out.println("satış güncellendi : " + sales.getId());
		this.salesDao.update(sales);
	}

	@Override
	public void delete(Sales sales) {
		System.out.println("Satış silindi : " + sales.getId());
		this.salesDao.delete(sales);
	}

	public double calculateCampaignPrice(Sales sales) {
		double campaignPrice = sales.getGame().getUnitPrice() * (100 - sales.getCampaign().getDiscountRate()) / 100;
		return campaignPrice;
	}
	
	public void printCampaign(Sales sales) {
		System.out.println(
				"Oyun adı : " + sales.getGame().getName()+ 
				" Oyun ücreti :" + sales.getGame().getUnitPrice()+ 
				" Oyuncunun adı : " + sales.getGamer().getFirstName()+ 
				" Kampanya adı : " + sales.getCampaign().getName() + 
				" Kampayalı fiyat :" + this.calculateCampaignPrice(sales)+ 
				" Satış işlemi gerçekleşti");
	}

}
