package checkout.offer;

public class SpecialOfferUtil {
	
	public static long threeForTwo(int price, int qty){
		if(qty > 0){
			int remainder = qty % 3;
			int chargable = qty / 3;
			return (chargable * 2 * price) + (price * remainder);
		}
		return 0;
	}
	public static long bogof(int price, int qty){
		if(qty > 0){
			int remainder = qty % 2;
			int chargable = qty / 2;
			return (chargable * price) + (price * remainder);
		}
		return 0;
	}

}
