
public class customer {
	
	public String customer_name;
	public String country;
	private String password;
	private int customer_id;
	private String city;
	private int zip;
	private String state;
	
	
	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public customer(String customer_name,String country,  String password,  int customer_id, 
			String city,int zip,String state) {
		
		this.customer_name = customer_name;
		this.country = country;
		this.password = password;
		this.customer_id = customer_id;
		this.city = city;
		this.zip = zip;
		this.state = state;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getCustomer_id() {
		return customer_id;
	}
	
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
		
	
		
	

}
