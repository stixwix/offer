package checkout.offer;

public class GroceryItem {

	private String name;
	private String productCode;
	private int price;
	private int qty;

	public GroceryItem(String name, String productCode,int price, int qty) {
		super();
		this.name = name;
		this.price = price;
		this.productCode = productCode;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
}
