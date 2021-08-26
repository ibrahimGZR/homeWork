package dataAccess;

import entities.Sales;

public class SalesDao implements SalesDaoRepository {

	@Override
	public void add(Sales sales) {
		System.out.println(
				"Oyun adı : " + sales.getGames().get(0).getGameName() + " - Kampanya adı : " + sales.getCampaign().getCampaignName()
						+ " - Müşteri adı : " + sales.getCustomer().getFirstName() +" - Toplam tutar : " + sales.getTotalPrice() + " Satış işlemi gerçekleşti");

	}

	@Override
	public void list() {
		System.out.println("Listelendi");

	}

	@Override
	public void update(Sales sales) {
		System.out.println("Kampanya adı : " + sales.getCampaign().getCampaignName() + " Müşteri adı : "
				+ sales.getCustomer().getFirstName() + " Güncellendi");

	}

	@Override
	public void delete(Sales sales) {
		System.out.println("Kampanya adı : " + sales.getCampaign().getCampaignName() + " Müşteri adı : "
				+ sales.getCustomer().getFirstName() + " Silindi");

	}

}
