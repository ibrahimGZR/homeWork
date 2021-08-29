package business.concretes;

import business.abstracts.SalesService;
import entities.Sales;

public class SalesManager implements SalesService {

	@Override
	public void add(Sales sales) {
		this.printCampaign(sales);
	}

	@Override
	public void getAll() {
		System.out.println("Satışlar listelendi : ");

	}

	@Override
	public void update(Sales sales) {
		System.out.println("satış güncellendi : " + sales.getId());

	}

	@Override
	public void delete(Sales sales) {
		System.out.println("Satış silindi : " + sales.getId());

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
