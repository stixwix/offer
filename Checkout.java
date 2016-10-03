package checkout.offer;

import java.util.ArrayList;
import java.util.List;

public class Checkout {
	
	// Note - I would normally choose JUnit for tests but due to time constraint will run basic tests from Main method
	// Also would use Log4j for logging
	public static void main(String[] args) {
		
		// test 1 - this tests that the code meets the requirement
		CustomerOrder customerOrder1 = Checkout.loadCustomerOrder1();
		long total1 = customerOrder1.printReceipt(Checkout.loadSpecialOffers());
		if (total1 != 255){
			System.out.println("Test1 failed");
		}
		
		// test 2 - this tests that the code can handle items without a special offer
		CustomerOrder customerOrder2 = Checkout.loadCustomerOrder2();
		long total2 = customerOrder2.printReceipt(Checkout.loadSpecialOffers());
		if (total2 != 265){
			System.out.println("Test2 failed");
		}
		
		// test 3  - this tests a free item
		CustomerOrder customerOrder3 = Checkout.loadCustomerOrder3();
		long total3 = customerOrder3.printReceipt(Checkout.loadSpecialOffers());
		if (total3 != 75){
			System.out.println("Test3 failed");
		}
	}
	
	// simulate loading offers from DB
	private static List<SpecialOffer> loadSpecialOffers(){
		
		List<SpecialOffer> offers = new ArrayList<SpecialOffer>();
		offers.add(new SpecialOffer("APPLE", "BOGOF"));
		offers.add(new SpecialOffer("ORANGE", "3FOR2"));
		return offers;
	}
	
	// simulate loading the order from DB
	private static CustomerOrder loadCustomerOrder1(){
			
		CustomerOrder customerOrder = new CustomerOrder();
		customerOrder.addItem(new GroceryItem("apple", "APPLE",60,5));
		customerOrder.addItem(new GroceryItem("orange","ORANGE",25,4));
		return customerOrder;
	}
	
	// simulate loading the order from DB
	private static CustomerOrder loadCustomerOrder2(){
			
		CustomerOrder customerOrder = new CustomerOrder();
		customerOrder.addItem(new GroceryItem("apple", "APPLE",60,5));
		customerOrder.addItem(new GroceryItem("orange","ORANGE",25,4));
		customerOrder.addItem(new GroceryItem("banana","BANANA",10,1));
		return customerOrder;
	}
	
	// simulate loading the order from DB
	private static CustomerOrder loadCustomerOrder3(){
			
		CustomerOrder customerOrder = new CustomerOrder();
		customerOrder.addItem(new GroceryItem("apple", "APPLE",0,1));
		customerOrder.addItem(new GroceryItem("orange","ORANGE",25,4));
		return customerOrder;
	}
	

}
