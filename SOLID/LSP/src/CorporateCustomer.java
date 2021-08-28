
public class CorporateCustomer extends Customer {
	private String taxNumber;
	private String corporateTitle;

	public CorporateCustomer() {
		super();
	}

	public CorporateCustomer(int id, String taxNumber, String corporateTitle) {
		super(id);
		this.taxNumber = taxNumber;
		this.corporateTitle = corporateTitle;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public String getCorporateTitle() {
		return corporateTitle;
	}

	public void setCorporateTitle(String corporateTitle) {
		this.corporateTitle = corporateTitle;
	}
}
