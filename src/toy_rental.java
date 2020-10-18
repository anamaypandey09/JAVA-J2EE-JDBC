
public class toy_rental  {

	public int customer_id;
	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getToy_id() {
		return toy_id;
	}

	public void setToy_id(int toy_id) {
		this.toy_id = toy_id;
	}

	public int toy_id;
	private int rental_id;
	public String rental_start_date;
	public String rental_end_date;
	public int rental_amount_per_day;
	public long total_amount;
	public int fine;
	public String status;
	
	

	public int getRental_id() {
		return rental_id;
	}

	public void setRental_id(int rental_id) {
		this.rental_id = rental_id;
	}

	public String getRental_start_date() {
		return rental_start_date;
	}

	public void setRental_start_date(String rental_start_date) {
		this.rental_start_date = rental_start_date;
	}

	public String getRental_end_date() {
		return rental_end_date;
	}

	public void setRental_end_date(String rental_end_date) {
		this.rental_end_date = rental_end_date;
	}

	public int getRental_amount_per_day() {
		return rental_amount_per_day;
	}

	public void setRental_amount_per_day(int rental_amount_per_day) {
		this.rental_amount_per_day = rental_amount_per_day;
	}

	public long getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(long total_amount) {
		this.total_amount = total_amount;
	}

	public int getFine() {
		return fine;
	}

	public void setFine(int fine) {
		this.fine = fine;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
	 
	
}
