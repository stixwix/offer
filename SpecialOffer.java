package checkout.offer;

public class SpecialOffer {
	private String productCode;
	private String offerCode;

	public SpecialOffer(String productCode, String offerCode) {
		super();
		this.productCode = productCode;
		this.offerCode = offerCode;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getOfferCode() {
		return offerCode;
	}

	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}

}
