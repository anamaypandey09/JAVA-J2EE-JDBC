import java.util.Scanner;

import java.util.List;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class implementation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = ConnectionFactory.getConnection();
		
		try {
			
			Statement stmt=con.createStatement();			   
			int count=1;
			toy_rental tr=new toy_rental();
			customer c=new customer();
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Welcome to toy rental services");
			System.out.println("Press 1 to rent toy(New customers)");
			System.out.println("Press 2 for exsisting customers(Bill_info,customer_info,new booking)");
			System.out.println("Press 3 for available toy details");
			int x=sc.nextInt();
				
			if(x==1) {
			String q=("INSERT INTO customer(customer_id,customer_name,password,city,state,zip,country)values(?,?,?,?,?,?,?)");
			PreparedStatement pstmt=con.prepareStatement(q);
			
			System.out.println("Enter customer id");
			c.setCustomer_id(sc.nextInt());
			
			System.out.println("Enter full name : ");
			c.setCustomer_name(sc.next());
			sc.nextLine();
			
			System.out.println("Enter the password");
			System.out.println("Password length must not be more than 12 characters");
			c.setPassword(sc.next());
			if(c.getPassword().length()>12) {
				System.out.println("Input password must not be more than 12 charcters ");
			}
			
			
			System.out.println("Enter the country");
			c.setCountry(sc.next());
			
			System.out.println("Enter the state");
			c.setState(sc.next());
			
			System.out.println("Enter the city");
			c.setCity(sc.next());
			
			System.out.println("Enter zip number");
			c.setZip(sc.nextInt());
			
			pstmt.setInt(1, c.getCustomer_id());
			pstmt.setString(2, c.getCustomer_name());
			pstmt.setString(3, c.getPassword());
			pstmt.setString(4, c.getCity());
			pstmt.setString(5, c.getState());
			pstmt.setInt(6, c.getZip());
			pstmt.setString(7, c.getCountry());
			pstmt.executeUpdate();
			
			System.out.println("Account created succesfully.");
			}
			
			if(x==1||x==2) {
				if(x==1) {
					tr.setRental_id(count++);
					tr.setCustomer_id(c.getCustomer_id());
					System.out.println("Which toy you want to rent");
				}
				if(x==2) {
					PreparedStatement ps=con.prepareStatement("SELECT * FROM customer WHERE customer_name =? and password=? ");
					System.out.println("Enter your name");
					ps.setString(1, sc.next());
					System.out.println("Enter your password");
					ps.setString(2, sc.next());
					ResultSet rs = ps.executeQuery();
					if(rs.next()) {
						System.out.println("Welcome "+ rs.getString("customer_name"));
					}
					else {
						System.out.println("Enter valid credentials");
				
					}
								
					System.out.println("Press 1 for new toy booking");
					System.out.println("Press 2 for profile info");
					System.out.println("Press 3 for billing");
					int z=sc.nextInt();
					if(z==1) {
						
					}
					if(z==2) {
						System.out.println("customer name - "+rs.getString("customer_name"));
						System.out.println("customer password - "+rs.getString("password"));
						System.out.println("customer id - "+rs.getString("customer_id"));
						System.out.println(" city - "+rs.getString("city"));
						System.out.println(" state - "+rs.getString("state"));
						System.out.println(" zip - "+rs.getString("zip"));
						System.out.println(" country - "+rs.getString("country"));	
		
					}
					
					if(z==3) {
						
						PreparedStatement psd=con.prepareStatement("SELECT * FROM toy_rental WHERE customer_id=? ");
						System.out.println("Enter your customer id");
						psd.setInt(1, sc.nextInt());
						ResultSet rss=psd.executeQuery();
						if(rss.next()) {
							System.out.println("Your billing details are : ");
							System.out.println("Your rental id is: "+rss.getString("rental_id"));
							System.out.println("Your toy id is: "+rss.getInt("toy_id"));
							System.out.println("Your rental start date is: "+rss.getString("rental_start_date"));
							System.out.println("Your rental end date is is: "+rss.getInt("rental_end_date"));
							System.out.println("Your total rental damount is: "+rss.getString("total_amount"));
							System.out.println("Fine after end date :"+rss.getString("fine"));
						
						}
						else {
							System.out.println("please enter valid details");
							
						}
						
						
					}
				}
			
			List<String> toy_list=new ArrayList<>();
			ResultSet rs = stmt.executeQuery("select toy_name from toy");
			 
		      while(rs.next()) {
		    	  for(int i=0;i<=5;i++) {
		    		  toy_list.add(i, rs.getString("toy_name"));
		    	  }
		      }
		      System.out.println("Press 1 for Teddy");
		      System.out.println("Press 2 for Car");
		      System.out.println("Press 3 for Lego");
		      System.out.println("Press 4 for Unicorn");
		      System.out.println("Press 5 for Robot");
		      System.out.println("Press 6 for drawingpad");
		      
		     


			    toy t1=new toy(01,"teddy","stuffed",01,10,500,5,50);
			    toy t2=new toy(02,"car","electric",8,12,2000,10,300);
			    toy t3=new toy(03,"lego","plastic",05,12,900,8,80);
			    toy t4=new toy(04,"unicorn","stuffed",01,7,300,2,40);
			    toy t5=new toy(05,"robot","electric",8,12,5000,4,500);
			    toy t6=new toy(06,"drawingpad","plastic",03,07,500,5,50);
			    
			    
			    otherClass oc = new otherClass();
			   
			  
			   
			     oc.toylist.add(t1);
			     oc.toylist.add(t2);
			     oc.toylist.add(t3);
			     oc.toylist.add(t4);
			     oc.toylist.add(t5);
			     oc.toylist.add(t6);
		      
		      int n=sc.nextInt();
		      if(n==1) {
		    	  tr.setToy_id(1);
		      }
		      else if(n==2) {
		    	  tr.setToy_id(2);
		      }
		      else if(n==3) {
		    	  tr.setToy_id(3);
		      }
		      else if(n==4) {
		    	  tr.setToy_id(4);
		      }
		      else if(n==5) {
		    	  tr.setToy_id(5);
		      }
		      else if(n==6) {
		    	  tr.setToy_id(6);
		      }
		      else {
		    	  System.out.println("Invalid Input");
		    	  
		      }
		     
//		      
		    
		      List<Integer> quant_list=new ArrayList<>();
		      String qq=("select * from toy ");
			    ResultSet result= stmt.executeQuery(qq);
			    			    
			    while(result.next()) {
			    
			    
			    quant_list.add(result.getInt(7));
			    
			    }
			    
			    int r=oc.getToylist().get(n-1).getQuantity();
			    if(r>0) {
			    	  tr.setStatus("Available");
			    	  System.out.println("toy avilable");
			      }
			      else {
			    	  tr.setStatus("Not Available");
			    	  System.out.println("Sorry toy not available");
			      }
			    
			    oc.getToylist().get(n-1).setQuantity(r-1);
		      
		      
		      System.out.println("Enter rental date in format yyyy-mm-dd");
		      tr.setRental_start_date(sc.next());
		      
		      System.out.println("Enter rental end date in format yyyy-mm-dd");
		      tr.setRental_end_date(sc.next());
		      
		      List<Integer> amt_day=new ArrayList<>();
		      ResultSet rt=stmt.executeQuery(qq );
		      //column number
		      
		      while(rt.next()) {
		    	  amt_day.add(rt.getInt(7));
		      }
		     
		     		      
		      System.out.println("Your rental amount per day will be: ");
		      tr.setRental_amount_per_day(oc.getToylist().get(n-1).getRental_amount());
		      System.out.println(tr.getRental_amount_per_day());
		      
		      System.out.println("fine if you return after due date");
		      tr.setFine(oc.getToylist().get(n-1).getRental_amount()/2);
		      System.out.println(tr.getFine());
		      
		      System.out.println("Total amount will be:");
		      String rental_start_date = tr.getRental_start_date();
		  		String rental_end_date = tr.getRental_end_date();
		  		LocalDate start = LocalDate.parse(rental_start_date);
		  		LocalDate end = LocalDate.parse(rental_end_date);
		  		long noOfDays = ChronoUnit.DAYS.between(start, end);
		  		tr.setTotal_amount(tr.getRental_amount_per_day()*noOfDays);
		  		System.out.println(tr.getRental_amount_per_day()*noOfDays);
		  		
		  		
		  		String q=("INSERT INTO toy_rental(rental_id,customer_id,toy_id,rental_start_date,rental_end_date,rental_amount_perday,total_amount,fine,status)values(?,?,?,?,?,?,?,?,?)");
				PreparedStatement pstmt=con.prepareStatement(q);
				pstmt.setInt(1, count);
				if(x==1) {
					pstmt.setInt(2, c.getCustomer_id());
				}
				if(x==2) {
					PreparedStatement ps=con.prepareStatement("SELECT * FROM customer WHERE customer_name =?");
					System.out.println("Please enter your name");
					ps.setString(1, sc.next());
					ResultSet rk=ps.executeQuery();
					pstmt.setString(2,rk.getString("customer_id"));
				}
				
				pstmt.setInt(3, tr.getToy_id());
				pstmt.setString(4, tr.getRental_start_date());
				pstmt.setString(5, tr.getRental_end_date());
				pstmt.setInt(6, tr.getRental_amount_per_day());
				pstmt.setLong(7, tr.getTotal_amount());
				pstmt.setInt(8, tr.getFine());
				pstmt.setString(9, tr.getStatus());
				
		      
			}
			if(x==3) {
				PreparedStatement pss=con.prepareStatement("select * from toy where toy_name=?");
				System.out.println("Press 1 for Teddy");
			      System.out.println("Press 2 for Car");
			      System.out.println("Press 3 for Lego");
			      System.out.println("Press 4 for Unicorn");
			      System.out.println("Press 5 for Robot");
			      System.out.println("Press 6 for drawingpad");
				pss.setInt(1, sc.nextInt());
				ResultSet rrs=pss.executeQuery();
				if(rrs.next()) {
					System.out.println("Toy details are");
					System.out.println("Toy name is : "+rrs.getInt(2));
					System.out.println("Toy type is : "+rrs.getInt(3));
					System.out.println("Min age for playing is : "+rrs.getInt(4));
					System.out.println("Max age for playing is : "+rrs.getInt(5));
					System.out.println("Price is : "+rrs.getInt(6));
					System.out.println("Rental_amount : "+rrs.getInt(8));
				}
				else {
					System.out.println("Invalid input");
				}
			}
//			else {
//				System.out.println("Please enter valid input");
//			}
		      sc.close();
		}  catch (Exception e) {
		      e.printStackTrace();
	    } 
		
	}

}
