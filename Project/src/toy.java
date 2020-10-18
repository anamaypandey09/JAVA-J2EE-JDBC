import java.util.ArrayList;

public class toy {

	private int toy_id;
	public String toy_name;
	public String toy_type;
	private int min_age;
	private int max_age;
	private int price;
	public int quantity;
	public int rental_amount;
		
	
//	public toy() {
//		
//		this.toy_id = toy_id;
//		this.toy_name = toy_name;
//		this.toy_type = toy_type;
//		this.min_age = min_age;
//		this.max_age = max_age;
//		this.price = price;
//		this.quantity = quantity;
//		this.rental_amount = rental_amount;
//	}
	
	public toy(int toy_id, String toy_name, String toy_type, int min_age, int max_age, int price, int quantity,
			int rental_amount) {
		
		this.toy_id = toy_id;
		this.toy_name = toy_name;
		this.toy_type = toy_type;
		this.min_age = min_age;
		this.max_age = max_age;
		this.price = price;
		this.quantity = quantity;
		this.rental_amount = rental_amount;
	}

	public int getToy_id() {
		return toy_id;
	}
	public void setToy_id(int toy_id) {
		this.toy_id = toy_id;
	}
	public String getToy_name() {
		return toy_name;
	}
	public void setToy_name(String toy_name) {
		this.toy_name = toy_name;
	}
	public String getToy_type() {
		return toy_type;
	}
	public void setToy_type(String toy_type) {
		this.toy_type = toy_type;
	}
	
	public int getMin_age() {
		return min_age;
	}
	public void setMin_age(int min_age) {
		this.min_age = min_age;
	}
	public int getMax_age() {
		return max_age;
	}
	public void setMax_age(int max_age) {
		this.max_age = max_age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getRental_amount() {
		return rental_amount;
	}
	public void setRental_amount(int rental_amount) {
		this.rental_amount = rental_amount;
	}
	
	
	
	
}

 