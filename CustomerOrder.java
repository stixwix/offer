package checkout.offer;

import java.util.ArrayList;
import java.util.List;

public class CustomerOrder {
	
	private List<GroceryItem> orderItems = new ArrayList<GroceryItem>();
	
	public void addItem (GroceryItem item){
		orderItems.add(item);
	}
	
	private long calculateTotal( List<SpecialOffer>offers){
		long total = 0;
		for (GroceryItem item : orderItems){
			boolean offerFound = false;
			for (SpecialOffer offer : offers){
				// this part would benefit from use of Strategy pattern  
				if(item.getProductCode().equalsIgnoreCase(offer.getProductCode())){
					if(offer.getOfferCode().equalsIgnoreCase("BOGOF")){
						total += SpecialOfferUtil.bogof(item.getPrice(), item.getQty());
						offerFound = true;
					} else if(offer.getOfferCode().equalsIgnoreCase("3FOR2")){
						total += SpecialOfferUtil.threeForTwo(item.getPrice(), item.getQty());
						offerFound = true;
					} 
				}
			}
			if(!offerFound){
				total += (item.getPrice() * item.getQty());
			}
		}
		return total;
	}
	
	public long printReceipt( List<SpecialOffer>offers){
		System.out.println("item name" + "\t" + "item price"+ "\t" +"item qty");
		for (GroceryItem item : orderItems){
			System.out.println(item.getName() + "\t\t" + item.getPrice() + "\t\t"+item.getQty());
		}
		System.out.println("-----------------------------------------");
		long total = calculateTotal(offers);
		System.out.println("total\t\t\t\t" + total+"\n\n");
		return total;
	}

}
